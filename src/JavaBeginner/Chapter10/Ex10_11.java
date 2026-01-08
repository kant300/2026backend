package JavaBeginner.Chapter10;

import java.io.BufferedReader;
import java.io.FileReader;

//파일에서 행단위로 읽어서 출력
public class Ex10_11 {
    public static void main(String[] args) throws Exception {
        //파일을 열어서
        FileReader fr = new FileReader("c:/Temp/data1.txt");

        //읽어온 내용을 임시저장(임시기억장소 - 버퍼(Buffer))-메모리
        BufferedReader br = new BufferedReader(fr);

        String line; //버퍼에서 1줄을 저장할 변수

        //읽어올 행이 없을 때까지 반복처리
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close(); //버퍼 닫기
        fr.close(); //파일 닫기
    }
}
//inputStream : 파일열기->한글자 읽어서->옆으로 출력->파일닫기
//FileReader : 파일열기->버퍼에 저장->한행씩 읽어서->한행씩 출력->버퍼닫기->파일닫기
