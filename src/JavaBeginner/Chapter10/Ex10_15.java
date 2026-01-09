package JavaBeginner.Chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//기존의 파일을 읽어서 다른 파일로 저장
//복사기능
//win.ini(윈도우의 설정 정보파일)읽어서 data5.txt파일에 복사
public class Ex10_15 {
    public static void main(String[] args) throws IOException {
        //읽을 파일을 열기(스트림)-한글자단위처리
        FileInputStream fis = new FileInputStream("c:/Windows/win.ini");
        //쓰기 파일을 열기
        FileOutputStream fos = new FileOutputStream("c:/Temp/data5.txt");
        //읽은 문자를 저장할 변수
        //int는 4byte=>4글자
        int ch; //char ch->아스키코드로 구성되어 있어서 숫자형으로 사용가능

        //반복(읽을 파일에서 한글자씩 읽어서 쓰기파일에 쓰기)
        //더이상 읽을 문자가 없을때까지 반복(while)
        //읽기파일에서 한문자를 읽어서 ch에 저장==>저장한 내용이 없을때까지 반복
        //-1 파일의 끝
        System.out.println("복사중....");

        while ((ch=fis.read()) != -1){
            fos.write((byte)ch);//int형을 한문자인 byte형으로 변환해서 저장
        }
        System.out.println("파일쓰기 종류");

        //쓰기파일 닫기
        fos.close();
        //읽기파일 닫기
        fis.close();



    }
}
