// 패키지 선언
//package day4;
// 라이브러리(클래스) 연결
// import javax.util.*;

import javax.swing.*;
import java.awt.*;
//borderLayout 는 5개 방향으로 배치
//                동(East), 서(West), 남(South), 북(North), 가운데(Center)
//HTML:(d-flex)     end     start     bottom      top     middle,

// 현재 클래스에 윈도우 기능을 추가
public class BorderLayoutEx extends JFrame {
    public BorderLayoutEx(){ // 생성자에서 윈도우 프로그램 구현
        // 메모리에 윈도우를 구성(주요객체의 속성을 변경해서)
        // 1. 윈도우창 구성
        setTitle("BorderLayout연습"); // 윈도우 제목
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료시 윈도우 제거
        setSize(300, 200);
        // 2. 윈도내부 구성(작업영역) 생성한 클래스 사용은 소유자.메소드()
        Container c = getContentPane(); //현재 윈도우의 작업지를 읽어와라
        // 배치방향은 왼쪽에서 시작, 수평간격 30, 수직간격 40
        c.setLayout(new BorderLayout(30, 20));

        //작업에 필요한 객체(new)를 만들어서 작업지에 붙이기(add)
        // borderLayout은 (객체, 저장될 방향)
        c.add(new JButton("덧셈"), BorderLayout.NORTH); //덧셈버튼을 만들어서(new) c작업지에 추가(add)
        c.add(new JButton("뺄셈"), BorderLayout.SOUTH);
        c.add(new JButton("곱셈"), BorderLayout.WEST);
        c.add(new JButton("나눗셈"), BorderLayout.EAST);
        c.add(new JButton("계산"), BorderLayout.CENTER);
        // 화면에 윈도우를 출력
        setVisible(true);// 메모리의 윈도우를 화면에 출력
    }

    public static void main(String[] args) {
        new BorderLayoutEx(); // 클래스 생성하면 클래스가 실행

    }
}
