package day4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

//마우스의 모든 이벤트를 이용해서 좌표를 출력하는 프로그램
//마우스버튼을 클릭시 어떤 이벤트인지를 출력
//마우스 이동시 좌표를 출력
//
public class MouseAllEx extends JFrame{

    //마우스상태 및 좌표 출력용 레이블
    private JLabel la = new JLabel("준비중...");
    //윈도우설정(생성자)
    public MouseAllEx(){
        setTitle("마우스 이벤트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(la);
        // 이벤트추가
        MouseEventClass evt = new MouseEventClass();
        c.addMouseListener(evt);
        c.addMouseMotionListener(evt);


        setVisible(true);
    }
    //이벤트클래스(모든 추상메소드 구현)
    class MouseEventClass implements MouseListener, MouseMotionListener{
        //mouseListener(5개)
        public void mousePressed(MouseEvent e){
            la.setText("마우스 누름("+e.getX()+","+e.getY()+")");
        }//눌렀을때
        public void mouseReleased(MouseEvent e){
            la.setText("마우스 뗌("+e.getX()+","+e.getY()+")");
        }//떼었을때
        public void mouseClicked(MouseEvent e){ }//클릭했을때
        public void mouseExited(MouseEvent e){
            Component c = (Component) e.getSource();
            c.setBackground(Color.YELLOW);
        }//객체에서 벗어났을때
        public void mouseEntered(MouseEvent e){
            //changeComponet(e, Color.CYAN);
            Component c = (Component) e.getSource();
            c.setBackground(Color.CYAN);
        }//객체위에 올라갔을때
        //MouseMotionListener(2개)
        public void mouseDragged(MouseEvent e){
            la.setText("마우스 드래그("+e.getX()+","+e.getY()+")");
        }//드래그했을때
        public void mouseMoved(MouseEvent e){
            la.setText("마우스 이동("+e.getX()+","+e.getY()+")");
        }//움직였을때
    }

   /* public void changeComponet(MouseEvent e, Color color){
        Component c = (Component) e.getSource();//객체
        c.setBackground(Color);
    } */


    //시작
    public static void main(String[] args) {
        new MouseAllEx();
    }
}
