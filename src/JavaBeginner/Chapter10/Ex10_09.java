package JavaBeginner.Chapter10;

import java.io.FileInputStream;

//파일읽기
//.ini 초기설정파일
//.dat 자료가 들어있는 파일
//.txt 문서파일
// 윈도우에서 파일의 경로는 \ 구분 :  c:\temp\data1.txt
// 리눅스에서 파일의 경로는 / 구분 : c:/temp/data1.txt
// 자바는 파일의 기본 경로는 / 구분

//주요 프로그램에 위치에 try~catch 적용
//오류가 발생하면 로그에 catch에 사용자가 작성한 메세지가 출력
public class EX10_09 {
    public static void main(String[] args) {
        try {
            //c드라이브에 temp폴더에 있는 data1.txt파일을 열기
            FileInputStream fis = new FileInputStream("c:/temp/data1.txt");

            int ch; //파일에서 읽어온 문자를 저장할 변수(ASCII코드)

            //fis(연파일에서).read(1문자를 읽기)서 ch에 저장한다.
            //-1 읽을 수 없을 때까지 반복처리
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch); //읽어온 문자를 옆으로 계속 출력
            }

            //파일의 내용을 모든 읽었으면
            fis.close(); //파일을 닫기(닫기를 제대로 진행하지 않으면 파일이 깨지는 현상)
        } catch(Exception e) {
            System.out.println("파일읽기를 실패하였습니다.");
        }
    }
}
