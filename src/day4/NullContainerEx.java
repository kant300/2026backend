package day4;
// 배치관리자 없이 객체를 배치하는 방법
// 자유도가 높다,사용자가 원하는 곳에 배치가 가능
//객체를 배치하기 위해서 좌표지정, 객체의 크기지정

import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
    public NullContainerEx(){//생성자
        //윈도우 설정
        setTitle("자유 배치 연습");
        setSize(300,200);

        // 작업지 지정
        Container c = getContentPane();
        c.setLayout(null); // 배치형태 없음,HTML에서는 CANVAS

        //레이블 객체 생성
        JLabel la = new JLabel("버튼을 누르세요!!");
        la.setLocation(130,50);//가로130px, 세로50px위치
        la.setSize(200,20);
        c.add(la);//레이블을 작업지에 추가
        //set~ 저장, get~ 읽기, is~ 비교(판단), to~(변환)
        //9개의 버튼을 일정한 규칙으로 배치
        //for문은 가능하면 초기값 0, 조건식 < 만(= 포함 안시킨다)
        for(int i=1; i<=10; i++){
            //int j=i+1;
            //Integer(정수클래스).toString(문자열로 변환)
            //JAVA에서 숫자를 HTML에 전달하면 숫자는 문자로 처리
            JButton b = new JButton(Integer.toString(i));
            b.setLocation((i+1)*15,(i+1)*15);//i=0 이면 0값이 발생, 최하 15부터 시작
            b.setSize(50,20);
            c.add(b);
        }
        //윈도우 출력
        setVisible(true);
    }

    public static void main(String[] args) {
        new NullContainerEx();

    }
}
