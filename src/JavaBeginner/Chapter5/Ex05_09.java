package JavaBeginner.Chapter5;

import java.util.Scanner;

//swtich문
public class Ex05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;

        System.out.printf("1~4 중에 선택하세요 :");
        a = input.nextInt();

        switch (a){ //a값을 가지고 비교
            case 1: //a가 1과 같으면
                System.out.printf("1을 선택했습니다.");
                break; //작업종료시 반드시 표기
            case 2: //a가 2와 같으면
                System.out.printf("2를 선택했습니다.");
                break;
            case 3: //a가 3과 같으면
                System.out.printf("3을 선택했습니다.");
                break;
            case 4: //a가 4와 같으면
                System.out.printf("4를 선택했습니다.");
                break;
            default:
                System.out.printf("이상한걸 선택했습니다.");
        }
    }
}
