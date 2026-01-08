package JavaBeginner.Chapter5;

public class Ex05_04 {
    public static void main(String[] args) {
        int a = 200; //정수값을 저장할 변수 a를 선언하고 200을 초기값으로 저장

        //만약 a가 100보다 작으면(false) 100보다 작습니다 출력 (그게 아니면) 100보다 큽니다.
        if(a<100)  //{없으면 if나 else문 바로 다음줄은 자동으로 인식
            System.out.printf("100보다 작습니다.\n"); //true
        else
            System.out.printf("100보다 큽니다.\n");   //false
    }
}
