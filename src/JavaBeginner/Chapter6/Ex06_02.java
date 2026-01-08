package JavaBeginner.Chapter6;

//해당문자열을 5번 반복해서 출력하는 프로그램
public class Ex06_02 {
    public static void main(String[] args) {
        int i; //정수를 저장할 변수 i를 선언

        //반복한 횟수를 다음에 사용할 목적이 있으면
        for(i=0;i<5; i++) { //초기값지정;조건;증가
            System.out.printf("빙글빙글 for문을 공부중입니다.\n");
        }
        System.out.printf("%d\n", i);
        //반복문의 변수를 외부에 선언하면 반복문 이후에 해당변수를 사용

        //단순히 반복만 진행할 때
        for(int j=0; j<5; j++) { //변수선언후 초기값지정;조건;증가
            System.out.printf("위 for문과 동일하다.\n");
        }
        //System.out.printf("%d\n", j); ---오류
        //for문에서 변수를 선언하면 for문 이후에 해당변수는 소멸되어서 사용이 불가능

        //for(int i=0; i<6; i++) { ---오류, 외부에 선언한 변수를 새로 선언해서 사용이 불가능

        //반복이 종료되는 시점이 명확하지 않을 때(while을 대체)
        for(i=0; ;i++){ //조건이 없으면 반복문은 무한 반복
            System.out.printf("for문에 조건을 생략했을 때\n");
            //for문안에서 반복문을 종료하는 if문 사용
            if(i==5) break;
        }

        for(;;){
            System.out.printf("for문이 무한반복...\n");
        }
        //==while문 구현
        /*while(true) {
            System.out.printf("while 무한반복...\n");
        }*/
    }

}
