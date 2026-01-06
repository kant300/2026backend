package day4;


import javax.swing.*;
import java.awt.*;
//패키지>클래스>메소드>변수(명령어)
//프레임(JFrame)>컨테이너(Container)>패널(Panel)>객체(Button,TextField,Label)>속성(Set~)
//패널(Panel) - 그룹 - HTML에서 iframe(동영상 학습 프로그램)
//레이아웃에 객첼르 그룹화해서 적용할때 panel
//상단구현
class NorthPanel extends JPanel{
    public NorthPanel(){
        setBackground(Color.LIGHT_GRAY);
        setOpaque(true);
        setLayout(new FlowLayout());
        add(new JLabel("수식입력"));
        add(new JTextField(16)); //16자리까지 입력할 수있는 입력창
    }
}

//하단구현
class SouthPanel extends JPanel{
    public SouthPanel(){
        //레이이앗을 구성할 객체의 그룹을 작업
        setBackground(Color.darkGray);
        setOpaque(true); // 투명도
        setLayout(new FlowLayout(FlowLayout.LEFT));//패널의 객체의 배치방식
        add(new JLabel("계산 결과"));//패널을 구성하는 객체
        add(new JTextField(15));
    }
}
//중앙구현
class CenterPanel extends JPanel{
    // 배열을 이용해서 배치순서대로
    JButton b[] = { new JButton("+"), new JButton("-"),
                    new JButton("*"), new JButton("/")};

    public CenterPanel(){
        setBackground(Color.white);
        setOpaque(true);
        setLayout(new GridLayout(4,4,5,5));
        // 숫자버튼 배치(0~9까지)
        for(int i=0; i<10; i++){
            //0~9 => 9~0 최종값-i : 역순
            JButton b = new JButton(Integer.toString(i));
            //JButton b = new JButton(Integer.toString(9-i));
            add(b); //패널에 추가
        }
        add(new JButton("CE"));
        add(new JButton("계산"));

        for(int i=0; i<4; i++){
            if((i+1)%4==0){ //4의 배수, 4번째 항목일때, 규칙을 만들어서 통일
                b[i].setBackground(Color.cyan);
            }else { //1,2,3번째일때
                b[i].setBackground(Color.white);
            }
            add(b[i]);
        }
    }

}
public class Caculator extends JFrame{
    public Caculator(){
        setTitle("계산기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        //작업지
        Container c = getContentPane();
        c.add(new NorthPanel(),BorderLayout.NORTH);
        c.add(new SouthPanel(),BorderLayout.SOUTH);
        c.add(new CenterPanel(),BorderLayout.CENTER);

        setVisible(true);


    }

    public static void main(String[] args) {
       new Caculator();
    }
}
