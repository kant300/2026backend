package day5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Puzzle4x4 extends JFrame implements ActionListener {
    //게임에 필요한 변수
//    private final int SIZE=4;
//    private JButton[][] buttons = new JButton[SIZE][SIZE]; //4x4배열
//    private int emptyRow= SIZE-1, emptyCol= SIZE-1; //빈공백이 있는 버튼의 위치

    private JButton[][] buttons = new JButton[4][4]; //4x4배열
    private int emptyRow=3, emptyCol=3; //빈공백이 있는 버튼의 위치
    private final int SIZE=4;
    //생성자(윈도우)
    public Puzzle4x4(){
        setTitle("퍼즐게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        //레이아웃
        setLayout(new GridLayout(SIZE,SIZE));//4x4행렬로 레이아웃
        initPuzzle();//퍼즐초기화
        shuffle();


        setVisible(true);
    }

    /*
     *퍼즐초기세팅
     * 기능 : 16개의 버튼을 생성해서 숫자와 공백을 배치
     */
    private void initPuzzle(){
        int num=1;//버튼에 들어갈 번호(1~15), 빈공백

        for(int i=0; i<SIZE; i++){//행(0~3까지) 4회
            for(int j=0; j<SIZE; j++){//열(0~3까지) 4회, 4*4=16번 반복
                //배열에 버튼을 저장
                buttons[i][j]= new JButton();//버튼생성(0,0)(0,1)(0,2)(0,3)~(3,0)(3,1)(3,2)(3,3)
                //글꼴(글꼴명, 효과, 크기)
                buttons[i][j].setFont(new Font("Arial",Font.BOLD,24));
                buttons[i][j].setSize(100,100);
                //이벤트 적용
                buttons[i][j].addActionListener(this);


                //버튼 text에 숫자를 입력
                if(i==SIZE-1 && j==SIZE-1 ){//(3,3)의 마지막버튼이면
                    buttons[i][j].setText("");//마지막버튼에 빈공백
                }else {//마지막 버튼이 아니면
                    buttons[i][j].setText(String.valueOf(num++));//Integer.toString()

                }
                add(buttons[i][j]);//윈도우에 버튼을 배치


            }
        }

    }
    /*
     * 메소드명 : 퍼즐 섞는 메소드
     * 기능 : 16개의 버튼의 숫자를 섞는 작업
             빈공백 옆에 있는 숫자와 바꿔서 섞기
     */
    private void shuffle(){
        Random random = new Random();//난수클래스를 생성


        for(int i=0; i<1000; i++){//숫자 1000번 섞기
            //빈공백이 이동할 방향(0-위,1-아래,2-왼쪽,3-오른쪽)
            int dir = random.nextInt(4);//0~3까지 사이에서 난수를 발생
            int newRow = emptyRow;//빈공백이 이동한 행,열위치
            int newCol = emptyCol;

            switch (dir){
                case 0:
                    newRow--;//행(3)->행(2)
                    break;
                case 1:
                    newRow++;//행(2)->행(3)
                    break;
                case 2:
                    newCol--;//열(3)->열(2)
                    break;
                case 3:
                    newCol++;//열(2)->열(3)
                    break;
            }
            //현재 빈간을 새로운 위치로 변경
            //++,--에 의해서 0~3의 범위를 벗어나는 문제가 발생이 된다
            //Swap는 범위내에서만 작업을 진행
            if(isValids(newRow,newCol)) {
                swap(emptyRow, emptyCol, newRow, newCol); //현재(행,열), 바꿀(행,열)
                emptyRow = newRow;//빈공백이 이동한 위치로 빈공백의 위치를 변경
                emptyCol = newCol;
            }
        }

    }
    /*
     * 메소드명 : 이벤트 메소드
     * 기능 : 해당하는 숫자를 마우스로 클릭하면 옆에 빈공백과 교환
     * 추상메소드를 채워서 사용
     */
    @Override
    public void actionPerformed(ActionEvent e){
        //버튼을 클릭했을때 클릭한 버튼의 주변에 공백이 존재하면
        // 서로 자리를 바꾸는 작업
        JButton clickButton = (JButton) e.getSource(); //클릭한버튼
        for(int i=0; i<SIZE; i++){//모든 버튼을 반복
            for(int j=0; j<SIZE; j++){
                if(buttons[i][j] == clickButton){//현재버튼이 클릭한 버튼이면
                    //클릭한 버튼의 상하좌우에 빈공백이 존재(이동가능)
                    if((Math.abs(i-emptyRow) + Math.abs(j-emptyCol))==1){
                        swap(emptyRow,emptyCol, i, j);//숫자교환
                        emptyRow=i;
                        emptyCol=j;

                        //완성체크
                        if(isSolved()){//퍼즐이 완성되면
                            //javascript에서 alert()-메시지 출력
                            JOptionPane.showConfirmDialog(this,"성공하였습니다.");
                            //다음동작
                            shuffle();
                        }

                    }

                }
            }
        }
    }

    /*
     * 메소드명 : 교환메소드
     * 기능 : 숫자와 빈공백을 서로 위치를 바꾸는 기능
     */
    private void swap(int emptyRow, int emptyCol, int newRow, int newCol){
        //숫자값을 저장
        //빈공백이 이동할 새로운 위치에 기존숫자를 저장
        String temp = buttons[newRow][newCol].getText();
        //빈공백의 버튼의 내용을 새로운 위치에 저장
        buttons[newRow][newCol].setText(buttons[emptyRow][emptyCol].getText());
        //기존위치에 저장해둔 숫자를 저장
        buttons[emptyRow][emptyCol].setText(temp);

    }
    /*
     * 메소드명 : 범위 유효성 검사 메소드
     * 기능 : 현재 위치가 게임판의 범위를 벗어났는지 판별
     */
    private boolean isValids(int newRow, int newCol){
        //행이 0~3사이고 열이 0~3사이면 true 아니면 false
        return newRow>=0 && newRow<SIZE && newCol>=0 && newCol<SIZE;

    }
    /*
     * 메소드명 : 숫자배열의 완성 검사 메소드
     * 기능 : 숫자배열의 완성되었는지 판별
     */
    private boolean isSolved(){
        int num=1;

        for(int i=0; i<SIZE; i++){
            for(int j=0;j<SIZE; j++){
                //마지막 칸이 빈공백인가
                if(i==SIZE-1 && j==SIZE-1){
                    return buttons[i][j].getText().equals("");
                }
                //!(첫번째버튼부터 마지막까지 1~15순과 같은가) 않은가
                if(!buttons[i][j].getText().equals(String.valueOf(num++))){
                    //숫자가 순서가 안맞으면 false(실패)
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new Puzzle4x4();//게임시작
    }
}
