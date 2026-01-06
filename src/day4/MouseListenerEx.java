package day4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//마우스이벤트가 발생했들때 처리하는 프로그램
//1. 마우스버튼을 클릭했을때 해당 위치에 label을 출력
//2. 마우스버튼을 클릭한 좌표가 필요
//3. label을 출력 layout은 null로 사용
//4. 마우스이벤트는 윈도우창 내에서 발생
//마우스 이벤트 Component에 적용
//MouseListener mousePressed(눌렀을때), mouseREleased(떼었을때), mouseClicked(클릭했을때)
//              mouseEntered(객체위에 놓였을때), mouseExited(객체에서 벗어났을때)
//내부 이벤트 클래스를 이용
public class MouseListenerEx extends JFrame {
    //생성자와 이벤트클래스에서 사용
    private JLabel la = new JLabel("hello");

    //윈도우에 디자인 작업
    //Frame>Container>Panel>객체
    public MouseListenerEx(){
        setTitle("마우스 이벤트");
        setSize(250,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c =getContentPane();
        c.setLayout(null);//사용자가 좌표를 통해서 배치가 가능

        //레이블의 초기상태
        la.setSize(50,20); //레이블크기
        la.setLocation(150,150);//출력할 위치
        c.add(la);

        c.addMouseListener(new MyMouseListener());//작업지(윈도우내)에 마우스이벤트추가

        setVisible(true);

    }

    //이벤트(클래스 구성)
    //인터페이스에 선언된 추상메소드는 모두 만들어야 한다.
    //void mousePressed(); 어딘가에 존재
   /* private class MyMouseListener implements MouseListener{
        public void mousePressed(MouseEvent e){
            int x = e.getX();//마우스의 x좌표
            int y = e.getY();//마우스의 y좌표
            la.setLocation(x,y);//마우스의 x,y좌표에 label을 위치
        }
        public void mouseReleased(MouseEvent e){ }
        public void mouseClicked(MouseEvent e){ }
        public void mouseEntered(MouseEvent e){ }
        public void mouseExited(MouseEvent e){ }
    }*/

    //리스너 인터페이스는 모든 추상메소드를 구현을 해야 사용이 가능
    // 메소드 이름만 선언이 되어 있는 상태 ==> 메소드 내용을 채워
    //      public void mouseReleased( );
    //      public void mouseClicked( );
    //어댑터 인터페이스는 필요한 추상메소드만 구현해서 사용
    //  메소드 이름과 빈내용으로 채워진 상태
    //      public void mouseClicked(MouseEvent e){ }
    //      public void mouseEntered(MouseEvent e){ }

    //  MouseAdapter 와  MouseListener의 차이
    private class MyMouseListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            int x = e.getX();//마우스의 x좌표
            int y = e.getY();//마우스의 y좌표
            la.setLocation(x,y);//마우스의 x,y좌표에 label을 위치
        }

    }


    public static void main(String[] args) {
        new MouseListenerEx();
    }
}
