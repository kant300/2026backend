package JavaBeginner.Chapter4;

import java.util.Scanner;

//문제 동전교환 프로그램
// 입력된 액수만큼 500원 100원, 50원 10원짜리 동전으로 교환해주는 프로그램입니다.
// 1. 동전은 총개수는 최소화한다.
// 2. 고액의 동전을 우선적으로 교환해준다.
//## 교환할 돈은 ? 7777
//오백원짜리 ---> 15개  교환할 돈/500 = 갯수, 교환할 돈%500 =남은 돈
//백원짜리 ---> 2개
//오십원짜리 ---> 1개
//십원짜리 ---> 2개
//바꾸지 못한 잔돈 ---> 7원
public class EX04_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //money-입력받은 돈, c500-500원갯수, c100-100원갯수, c50-50원갯수, c10-10원갯수
        int money, c500, c100, c50, c10; //정수를 저장할 money, c500, c100, c50, c10를 선언

        //입력
        System.out.print("## 교환할 돈은?");
        money = scanner.nextInt();

        //처리
        c500 = money / 500; //500 나눈 몫값(500원의 갯수) 570/500 = 1
        money = money % 500; //money를 500 나눈 나머지를 money에 다시 저장 570%500=70

        c100 = money / 100;
        money = money % 100;

        c50 = money / 50;
        money = money % 50;

        c10 = money /10;
        money = money % 10;

        //출력
        System.out.printf("\n");
        System.out.printf("오백원짜리 ==> %5d개\n", c500);
        System.out.printf("  백원짜리 ==> %5d개\n", c100);
        System.out.printf("오십원짜리 ==> %5d개\n", c50);
        System.out.printf("  십원짜리 ==> %5d개\n", c10);
        System.out.printf("바꾸지 못한 잔돈 ==> %5d원\n", money);
    }
}
