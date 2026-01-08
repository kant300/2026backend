package Chapter3; //클래스가 포함되어 있는 폴더(패키지)

//연습) printf()의 기본 사용법(형식이 있는 모양으로 출력)
//print(인쇄)+format(형식) 결합
//printf("형식(모양)",변수)
//형식 %d-10진수, %i-정수, %f-실수, %c-문자, %s-문자열
//    %전체자리수.소숫점자리수데이터타입  ===> %5d(10진수를 5자리에 출력)
//%전체자리수데이터타입 : 숫자는 오른쪽->왼쪽, 문자는 왼쪽->오른쪽
//-방향을 반대로 전환
public class Ex03_01 {
    //main메소드는 프로젝트를 시작하는 메소드
    public static void main(String[] args) {
        System.out.printf("100+200"); //해당문자열을 화면에 출력
        System.out.printf("\n"); //엔터키를 적용해서 출력(줄바꿈)
        System.out.printf("%d\n",100+100); //100+100의 합을 %d에 10진수로 출력
        System.out.printf("\n"); //엔터키를 적용해서 출력(줄바꿈)
        System.out.printf("%5d\n",100+100); //전체자리수 5자리에 10진수로 100+100의 결과
        System.out.printf("%-5d\n",100+100); //전체자리수 5자리에 10진수로 100+100의 결과
        System.out.printf("합계는 : %d\n", 100+100); //합계를 %d에 적용해서 출력
        System.out.printf("%d+%d=%d\n",100,100,100+100);//위치에 값이 순서대로 저장
    }
}
