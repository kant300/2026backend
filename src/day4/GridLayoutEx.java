// 패키지 선언
//package day4;
// 라이브러리(클래스) 연결
// import javax.util.*;

import javax.swing.*;
import java.awt.*;
//borderLayout 는 5개 방향으로 배치
//                동(East), 서(West), 남(South), 북(North), 가운데(Center)
//HTML:(d-flex)     end     start     bottom      top     middle, center

// 현재 클래스에 윈도우 기능을 추가
public class GridLayoutEx extends JFrame {
    public GridLayoutEx(){ // 생성자에서 윈도우 프로그램 구현
        // 메모리에 윈도우를 구성(주요객체의 속성을 변경해서)
        // 1. 윈도우창 구성
        setTitle("GridLayout연습"); // 윈도우 제목
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료시 윈도우 제거
        setSize(300, 200);
        // 2. 윈도내부 구성(작업영역) 생성한 클래스 사용은 소유자.메소드()
        GridLayout grid = new GridLayout(4, 2);
        grid.setVgap(5);    //세로간격값 5

        Container c = getContentPane(); //현재 윈도우의 작업지를 읽어와라
        //수평간격 30, 수직간격20
        c.setLayout(grid); // 직접적으로 new로 적용하면 Layout을 추가 변경이 불가능

        //작업에 필요한 객체(new)를 만들어서 작업지에 붙이기(add)
        //행->열 순으로 배치(0,0)(0,1)(1,0)(1,1)(2,0)(2,1)(3,0)(3,1)
        //출력후 위로 이동이 불가능(옆으로 처리가 되면서 밑으로 이동)
        c.add(new JLabel("이름")); // HTML에서 항목에 제목<Lable>
        c.add(new JTextField("")); //입력객체, HTML에서 <Input>
        c.add(new JLabel("학번"));
        c.add(new JTextField(""));
        c.add(new JLabel("학과"));
        c.add(new JTextField(""));
        c.add(new JLabel("과목"));
        c.add(new JTextField(""));


        // 화면에 윈도우를 출력
        setVisible(true);// 메모리의 윈도우를 화면에 출력
    }

    public static void main(String[] args) {
        new GridLayoutEx(); // 클래스 생성하면 클래스가 실행

    }
}
