package JavaBeginner.Chapter5;

import java.util.Scanner;

public class Ex05_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;

        System.out.print("점수를 입력하세요 :");
        a = scanner.nextInt();

        if(a>=90) {//만약에 점수가 90점이상이면
            System.out.printf("A학점");
        } else if(a>=80) { //그게아니고 점수가 80점이상이면
            System.out.println("B학점");
        }  else if(a>=70) { //그게아니고 점수가 70점이상이면
            System.out.printf("C학점");
        }  else if(a>=60) { //그게아니고 점수가 60점이상이면
            System.out.printf("D학점");
        } else {
            System.out.printf("F학점");
        }
    }
}
