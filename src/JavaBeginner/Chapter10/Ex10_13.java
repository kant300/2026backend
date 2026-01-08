package JavaBeginner.Chapter10;

import java.io.FileOutputStream;
import java.io.IOException;

//파일에 내용을 쓰기
public class EX10_13 {
    public static void main(String[] args) throws IOException {
        //파일을 쓰기위해 열기
        FileOutputStream fos = new FileOutputStream("c:/Temp/data3.txt");

        int ch; //저장할 아스키코드값

        //키보드에서 enter키를 누를때까지 반복
        while ((ch = System.in.read()) != '\n') {
            fos.write(ch); //키보드로 입력한 한문자를 파일에 쓰기
        }
        fos.close(); //쓰기파일을 닫기
    }
}
