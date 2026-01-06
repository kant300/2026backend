package day4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//이벤트를 외부클래스로 만들어서 사용
class MyActionListener implements ActionListener {
    //ActionListener에서 제공하는 추상메소드를 완성을 해야 한다.
    // void actionPerformed(); 추상메소드로 선언
    public void actionPerformed(ActionEvent e){//ActionEvent e 이벤트가 발생한 객체
        JButton b = (JButton)e.getSource();//이벤트가 발생한 객체를 읽어서 JButton으로 저장
        //버튼의 내용을 읽어서 Action이면 액션, 액션은 Action으로 변경
        if(b.getText().equals("Action")){//버튼의 내용이 Action이면
            b.setText("액션");
        }else {//Action이 아니면(한글 액션)
            b.setText("Action");
        }


    }
}
public class IndepClassListener extends JFrame {
    //생성자
    public IndepClassListener(){
        setTitle("이벤트 작업");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350,150);

        //작업지 설정
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        //객체추가
        JButton btn = new JButton("Action");
        c.add(btn);
        //버튼에 이벤트를 추가
        //메소드를 채운 클래스를 선언
        //내용이 없는 메소드(추상메소드) : override에서 내용을 채운다.
        btn.addActionListener(new MyActionListener());//버튼에 ActionListener이벤트추가

        setVisible(true);

    }

    public static void main(String[] args) {
        new IndepClassListener();
    }
}
