package JavaBeginner.Chapter10;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//구구단프로그램
//1단~9단까지
//1행에 1단~9단의 내ㅛㅇ을 구성
//gugu.txt에 구구단을 출력
//단 * 차수 = 단(1~9), 차수(1~9) => for문 2개
//for() - 행(아래쪽 이동) - 차수
//  for() -열(옆으로 이동) - 단수
public class Ex10_27 {
    public static void main(String[] args) throws FileNotFoundException {
        //1.변수선언
        //구구단을 저장할 파일을 열기(쓰기용)
        PrintWriter out = new PrintWriter("c:/Temp/gugu.txt");
        //한 행에 출력할 구구단을 저장할 변수
        String str = "";//한행에 해당하는 구구단 문자열을 저장할 변수

        //2.입력작업(없음)

        //3.처리작업
        //구구단의 제목을 출력
        for(int i=2; i<10; i++){//2,3,4,5,6,7,8,9
            //str += "*"+i+"단* ";//누적에 사용하는 변수는 초기값 지정필수
            str += String.format("* %2d단 *\t\t" ,i);

        }
        out.println(str);//파일에 출력
        out.println();//한줄 띄어쓰기
        //한행씩 구구단을 만들어서 파일에 쓰기
        for(int i=1; i<10; i++){
            str=""; //새로운 행을 작업하기 위해서 초기화
            for(int j=2; j<10; j++){
                //모양이 불규칙하게 출력
                //str += j+"*"+i+"="+(j*i)+" ";
                //모양을 잡아서 처리하는 format==>printf
                str += String.format("%2d * %2d = %2d\t ", j, i, j*i);
            }
            //과정을 출력(1행마다 과정을 출력)
            out.println(str);//완성된 한행을 파일에 출력
        }
        // for문 밖에 결과를 출력(한번만->마지막 결과)
        //out.println();

        //4.출력작업(없음)
        out.close();


    }//main e
}//class end
