package JavaBeginner.Chapter10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Scanner를 이용해서 파일 읽기
public class Ex10_12 {
    public static void main(String[] args) throws IOException {
        //System.in : 표준입력장치-키보드
        Scanner input = new Scanner(new File("c:/Temp/data2.txt"));
        int hap=0; //총점을 저장할 변수

        //파일작업시 종료되는 시점을 알 수가 없다.
        //그래서 반복문은 while문을 사용
        //hasNextLine() 한줄을 읽고 다음줄이 이동 --키보드 입력
        while(input.hasNextLine()){ //다음 라인이 존재하지 않을 때까지 반복
            hap += input.nextInt(); //읽어온 한줄의 내용을 정수형으로 읽기
        }

        System.out.println("합계 : "+hap);
        input.close(); //파일 닫기
    }
}
