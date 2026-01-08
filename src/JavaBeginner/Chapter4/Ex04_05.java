package JavaBeginner.Chapter4;

//관계연산자
//일반 : if(조건) = 조건에 관계연산자를 사용
//      for(초기값;조건;증감값) = 조건에 관계연산자를 사용
//      while(조건) = 조건에 관계연산자를 사용
//      조건?참:거짓; = 조건에 관계연산자를 사용
//      return 조건?참:거짓;  = 조건에 관계연산자를 사용

//산술연산자처리 일반 연산에서도 사용이 가능
//  = 뒤에 사용이 가능
public class Ex04_05 {
    public static void main(String[] args) {
        int a=100, b=200; //정수형을 저장할 변수 a,b를 선언하고, a에 100, b에 200을 초기화
        boolean c; //논리형을 저장항 변수 c선언

        //a==b : a(100)와 b(200)이 같은가? => false
        System.out.printf("%d == %d는 %s이다\n", a, b, a==b);
        //a!=b : a(100)과 b(200)이 같지 않냐? => true
        System.out.printf("%d != %d는 %s이다\n", a, b, a!=b);
        //a>b : a(100)이 b(200)보다 크냐? => false
        System.out.printf("%d > %d는 %s이다\n", a, b, a>b);
        //a<b : a(100)이 b(200)보다 작냐? => true
        System.out.printf("%d > %d는 %s이다\n", a, b, a<b);
        //a>=b : a(100)이 b(200)보다 크거나 같냐? => false
        System.out.printf("%d > %d는 %s이다\n", a, b, a>=b);
        //a<=b : a(100)이 b(200)보다 작거나 같냐? => true
        System.out.printf("%d > %d는 %s이다\n", a, b, a<=b);

        c = a>b; //a(100)이 b(200)보다 크냐 => false 결과를 c에 저장
        System.out.printf("%d > %d는 %s이다\n", a, b, c);

        //a=b; //b(200)을 a에 저장 => a(200)
        //b(200)을 a(100)에 저장한 결과를 출력 => 전달된 200
        System.out.printf("%d > %d는 %s이다\n", a, b, a=b); //a변수값(X) =으로 전달값
        System.out.printf("%d > %d는 %s이다\n", a, b, a=a+b); //변수값(X) =으로 전달값
        System.out.printf("%d\n", a); //이후에는 저장된 a값을 이용
        System.out.printf("%d > %d는 %s이다\n", a, b, c = a>b); //변수값(X) =으로 전달값
    }
}
