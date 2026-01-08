package JavaBeginner.Chapter8;

import java.util.Scanner;

public class Ex08_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] aa = new int[4]; //aa => aa[0], aa[1], aa[2], aa[3]
        int hap;

        //배열에 값을 저장하거나 일거오는 순서는 필요없다.
        //키보드로 4개의 값을 입력받아서 배열에 저장
        System.out.printf("1번째 숫자를 입력하세요");
        aa[0] = sc.nextInt();
        System.out.printf("3번째 숫자를 입력하세요");
        aa[2] = sc.nextInt();
        System.out.printf("2번째 숫자를 입력하세요");
        aa[1] = sc.nextInt();
        System.out.printf("4번째 숫자를 입력하세요");
        aa[3] = sc.nextInt();

        hap = aa[1] + aa[2] + aa[3] + aa[0]; //사용하는 순서도 마음대로

        System.out.printf("합계=>%d\n", hap);
    }
}
//배열은 같은 종류의 값을 그룹화 할 때 좋다.
//국어점수[4], 학생명[4], 결과값[4]
//값[4] => 값[0] 국어점수, 값[1] 출석률, 값[2] 결석률, 값[3] 석차  (비추천)
//배열명으로 값들을 관리