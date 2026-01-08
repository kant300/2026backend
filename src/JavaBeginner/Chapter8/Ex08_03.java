package JavaBeginner.Chapter8;

//일반적으로 배열은 for문과 함께 사용
//SpringBoot에서 배열은 작업할 내용을 한번에 저장해서 한번에 처리하기 위해
//SpringBoot에서는 for문보다 forEach 사용

import java.util.Scanner;

//for(저장할변수:배열) {}, for(저장할변수:리스트){}
//배열이나 리스트에 저장된 내용을 저장할변수에 하나씩 옮겨서 반복
//for(int i=0; i<5; i)) {        for(k:aa) {
//     hap = hap + aa[i];          hap = hap + k;
//}                              }
public class Ex08_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] aa = new int[4]; //키보드로 입력받은 숫자를 저장할 변수
        int hap =0; //배열에 저장된 값의 합계를 저장할 변수

        //i<4 : 배열의 갯수를 알고 있는 경우 ...고정배열
        for(int i=0; i<4; i++) {
            System.out.printf("%d번째 숫자를 입력하세요 :", i+1);
            aa[i] = sc.nextInt();
        }

        hap=0;
        //배열의 갯수는 정확히 모르는데, 배열의 갯수만큼 반복처리 ...가변배열
        //aa.length : 배열에 갯수(값이 있거나 없는게에 상관없느 new int[4]에 선언된 갯수만큼 반복
        //int [5] aa = {1,2,3} =>5회반복([5]참고)
        for(int i=0; i<aa.length; i++) {
            hap+=aa[i];
        }
        System.out.printf("합계는 : %d\n", hap);

        hap=0;
        //배열의 갯수만큼 반복 처리가 아니다.
        //배열에 저장된 값의 갯수만큼 반복
        //int [5] aa = {1,2,3} =>3회반복({1,2,3}참고)
        for(int k:aa) {
            hap+=k;
        }
        System.out.printf("합계는 : %d\n", hap);

    }
}
