package JavaBeginner.Chapter10;

import java.util.Scanner;

//계산기 프로그램
//첫번째 수, 연산자, 두번째 수를 받아서 결과를 출력하는 간단한 계산기
//연산자에서 +,-,*,/,% 사용
// /, % 사용시 0으로 나누면 오류가 발생된다.->예외처리해서 오류를 해결
public class Ex10_26 {
    public static void main(String[] args) {
        //1.변수선언
        //키보드입력
        Scanner sc = new Scanner(System.in);
        //첫번째수, 두번째수, 연산자, 결과값을 저장하는 변수
        int num1, num2;
        int result = 0;
        char op; //String op  +,-,* 한문자인데,String은 2자처리, char 1자처리

        //2.입력처리;
        //키보드로부터 첫번째수, 연산자, 두번째수를 입력받는다.
        System.out.print("첫번째 숫자를 입력하세요>> ");
        num1 = sc.nextInt();
        System.out.print("연산자(+,-,*,/)를 입력하세요>> ");
        op = sc.next().charAt(0);//입력한 문자열의 첫번째 문자만 적용
        System.out.print("두번째 숫자를 입력하세요>> ");
        num2 = sc.nextInt();

        //3.처리
        //연사자  +,-,*,/,% 별로 연산을 처리해서 결과에 저장
        // /, %를 0으로 연산 할때 오류가 발생이 된다.
        try {
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;

            }
        } catch (Exception e) {
            System.out.println("연산시 오류발생했습니다...");
        }


        //4.출력처리
        //계산된 결과를 화면에 출력
        System.out.println("----------연산결과-----------");
        System.out.println(num1+op+num2+" = "+result);
    }
}
