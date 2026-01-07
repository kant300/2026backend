//윈도우창에서 키보드에 키를 눌렀을때
//화면에 아스키코드값,               문자값,           유니코드값을 출력하는 프로그램
//      keyCode()-숫자(10진수)   keyChar()-1byte      keyText()-2byte
//진수 : 한자리에 표현할수있는 가지수
//2진수 : CPU가 사용하는 진수(0,1)
//8진수 : C언어(시스템 프로그램)
//16진수 : C언어(시스템 프로그램)
//10진수 : 인간이 사용하는 단위
//진법 : 진수와 진수로 변환 2진수->8진수, 16진수, 10진수
//
 /*
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListenerEx extends JFrame {
    private JLabel la = new JLabel();//클래스내에서 사용가능한 멤버변수

    //생성자(디자인+이벤트)
    public KeyListenerEx(){
        setTitle("Key Code 예제(F1키 초록색, %키 노란색");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,150);

        Container c = getContentPane();
        c.add(la);//레이블배치
        c.addKeyListener(new MykeyListener());//작업지에 이벤트를 추가
        //키보드는 커서가 존재해야만 키를입력 가능
        //커서를 객체에 위치시키는 것 : focus(윈도우, 자바, HTML)
        c.setFocusable(true);//작업지에 커서이동


        setVisible(true);
    }

    //이벤트(어댑터를 이용)
    class MykeyListener extends KeyAdapter{
        //키를 눌렀을때 이벤트
        public void keyPressed(KeyEvent e){// e 윈도우 내부에서(Container)
            Container contentPane = (Container) e.getSource();
            //레이블에 내용을 변경
            //KeyEvent(키보드이벤트).getKeyText(문자열읽어) .e.getKeyCode(키보드 문자코드를 읽어서)
            //눌러진 키의 아스키코드값을 문자열로 바꾸어서 레이블의 내용으로 적용
            la.setText(KeyEvent.getKeyText(e.getKeyCode())+"키가 입력되었습니다.");
            //String "%\0"를 ==비교하면 "%\n" =="%"===>equals비교
            //char '%' ==비교하면 '%'=='%'
            /*if(e.getKeyChar() =='%'){//눌러진키가 %이면
                contentPane.setBackground(Color.YELLOW);//작업지 배경색 변경
            }else if(e.getKeyChar() ==KeyEvent.VK_F1){
                contentPane.setBackground(Color.GREEN);//
            }*/
/*
import java.awt.Color;
import java.awt.event.KeyEvent;if(e.getKeyCode() ==53){//눌러진키가 %이면
                contentPane.setBackground(Color.YELLOW);//작업지 배경색 변경
            }else if(e.getKeyCode() ==KeyEvent.VK_F1){
                contentPane.setBackground(Color.GREEN);//
            }
        }
    }


    public static void main(String[] args) {
        new KeyListenerEx();
    }
}
*/