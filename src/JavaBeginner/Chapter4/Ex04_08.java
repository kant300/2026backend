package JavaBeginner.Chapter4;

import java.util.Scanner;

//문제 실수 2개를 입력받아서 다양한 연산을 출력한다.
// 첫번째 계산할 값을 입력하세요==> 10
// 두번째 계산할 값을 입력하세요==> 20
// 10.00 + 20.00= 30.00
// 10.00 - 20.00= -100.00
// 10.00 * 20.00= 200.00
// 10.00 / 20.00= 0.50
// 10 % 20 = 10
public class Ex04_08 {
    public static void main(String[] args) {
        //입력에 필요한 변수
        Scanner scanner = new Scanner(System.in); //키보드로 값을 입력
        float a, b; //실수값을 저장할 a,b 변수를 선언
        float result; //결과를 저장할 result 변수를 선언

        //입력처리(HTML, 디자인(화면디자인)->UI/UX)
        System.out.print("첫번째 계산할 값을 입력하세요==>");
        a = scanner.nextFloat();
        System.out.print("두번째 계산할 값을 입력하세요==>");
        b = scanner.nextFloat();

        //처리/출력처리
        //%5(전체자리수).2(소숫점자리수)f(실수형)
        result = a+b;
        System.out.printf("%5.2f + %5.2f = %5.2f\n", a, b, result);

        result = a-b;
        System.out.printf("%5.2f - %5.2f = %5.2f\n", a, b, result);

        result = a*b;
        System.out.printf("%5.2f * %5.2f = %5.2f\n", a, b, result);

        result = a/b;
        System.out.printf("%5.2f / %5.2f = %5.2f\n", a, b, result);

        //소숫점이 없는 결과
        //정수/정수=정수, 정수/실수=실수, 실수/정수=실수
        result = (int)a%(int)b; //2
        System.out.printf("%5d / %5d = %5d\n", (int)a, (int)b, (int)result);
    }
}
