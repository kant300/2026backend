package day4;
//레이블을 방향키로 이용해서 이동하는 프로그램
//윈도우 레이아웃은 null
//label을 화면에 배치(50,50)에 문자열"HELLO"
//키보드 이벤트를 통해서 방향키(상,하,좌,우)=>if문으로 비교
//10px만큼 이동하는 프로그램

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FlyingTextEx extends JFrame {
    //이동값(상수화)
    private final int FLYING_UNIT = 10;//10을 프로그램내에서 FLYING_UNIT사용
    //이동할 레이블
    private JLabel la = new JLabel("HELLO");

    //생성자
    public FlyingTextEx(){
        //윈도우
        setTitle("방향키 이동");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);

        Container c = getContentPane();
        c.setLayout(null);
        la.setLocation(100,100);//시작위치
        la.setSize(100,20);
        c.add(la); //작업지에 배치

        //이벤트 적용
        c.addKeyListener(new KeyEventClass());
        c.setFocusable(true);



        setVisible(true);
    }
    //이벤트클래스
    class KeyEventClass extends KeyAdapter{
        public void keyPressed(KeyEvent e){//눌러진 키에 대한 작업
            int keyCode = e.getKeyCode();
            //공통적으로 작업을 변수로 줄이는 작업
            int x = la.getX();//레이블의 x좌표값
            int y = la.getY();//레이블의 y좌표값

            //4가지 상, 하, 좌, 우 중에서 같은 경우에 이동
            switch (keyCode){//입력받은 키가
                case KeyEvent.VK_UP://위쪽 키
                    if(y-FLYING_UNIT>0) {
                        la.setLocation(x, y - FLYING_UNIT);
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if(y+FLYING_UNIT<250) {
                        la.setLocation(x, y + FLYING_UNIT);
                    }
                    break;
                case KeyEvent.VK_LEFT:
                    if(x-FLYING_UNIT>0) {
                        la.setLocation(x - FLYING_UNIT, y);
                    }
                    break;
                case 047://39: //0x27:(16진수)// KeyEvent.VK_RIGHT:
                    if(x+FLYING_UNIT<250) {
                        la.setLocation(x + FLYING_UNIT, y);
                    }
                    break;
            }

        }
    }

    public static void main(String[] args) {
        new FlyingTextEx();
    }
}
