package JavaBeginner.Chapter10;


//연속적을 데이터를 읽기/저장할때 사용(이미지파일, 압축파일,pdf파일)
//문장증간에 Enter키가 존재하지 않는 문서
//FileInputStream
//FileOutputStream

//키보드로 입력한 문장을 텍스트 파일에 저장
//행단위로 읽기/쓰기, 각 문장에 Enter키가 존재
//FileReader : 행단위로 읽어올때
//FileWriter : 행단위로 쓰기

import java.io.FileWriter;
import java.util.Scanner;

//AVX 지원 :cpu에서 지원불가능 - CMOS에 설정
public class Ex10_14 {
    public static void main(String[] args) throws Exception {
        //키보드로 문자열을 입력받아서
        Scanner sc = new Scanner(System.in); // new File을 이용하면 파일에서 읽어온다.
        //저장할 파일을 지정하고(c드라이브에 Temp폴더에 data4.txt파일을 열기)
        //R(일기용), W(쓰기용), W+(추가용)
        FileWriter fw = new FileWriter("c:/Temp/data4.txt");
        //입력받은 문자열을 저장할 변수
        String str;

        //반복문을 이용해서 아무내용없이 enter키를 누를때까지 파일에 저장
        //다음행에 내용이 있으면 반복
        while (!(str = sc.nextLine()).equals("") ) {
            fw.write(str);//문자열을 파일에 저장
        }
        fw.close();//저장할 내용이 없으면 파일을 닫기
    }
}
