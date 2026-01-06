package day4;
//CPU에서 임의적인 숫자(난수)를 생성
//0~1사이에 숫자0.0~0.999999 발생
//Math라이브러리에 제공


import javax.swing.*;
import java.awt.*;

public class RandomEx extends JFrame {
    public RandomEx(){
        setTitle("난수로 레이블 배치");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        //20개의 레이블을 출력
        for( int i=0; i<20; i++){
            JLabel label = new JLabel(Integer.toString(i)); //레이블에 숫자를 적용
            //0-50=50, 300-250=50
            //(데이터형) : 강제데이터형 변경, 캐스트연산
            //( )뒤에 내용을 해당데이터형으로 변경
            //(int)Math.random() 0.0000~0.99999=>0 *200 +50=>50 연산전에 데이터를 변환 후 연산처리
            //(int)(Math.random()*200 +50) 연산한결과의 값을 데이터형으로 변환
            int x=(int)(Math.random()*200 +50); // 50부터 시작 250사이에 난수
            int y=(int)(Math.random()*200 +50);
            label.setLocation(x,y);
            label.setSize(15,15);
            label.setBackground(Color.RED); //작업지와 객체의 색상을 겹치게
            label.setOpaque(true);
            c.add(label); //작업지에 추가
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new RandomEx();
    }
}
