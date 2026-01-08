package JavaBeginner.Chapter4;

//연산순위
public class Ex04_02 {
    public static void main(String[] args) {
        int a=2, b=3, c=4; //정수형 변수 a,b,c를 선언해서 a에 2, b에 3, c에 4를 저장
        int result1, mok, namugi; //정수형 변수 result1(결과), mok(몫), namugi(나머지) 변수를 선언
        float result2; //실수형 변수 result2

        //Ctrl-F : 찾기, Ctrl-R : 바꾸기  =현재클래스
        //shift-Ctrl-F :프로젝트 찾기, shift-Ctrl-R : 프로젝트 바꾸기 = 프로젝트
        
        result1 = a+b-c; //a(2)와 b(3)를 더한 결과(5)와 c(4)를 뺀 결과를 result1에 저장(1)
        System.out.printf("%d + %d - %d = %d\n", a,b,c,result1);

        result1 = a+b*c; //a(2)와 (b(3)와 c(4)를 곱한 결과(12)) 더한 결과를 result1에 저장(14)
        System.out.printf("%d + %d * %d = %d\n", a,b,c,result1);

        // (2*3) => 4->4.0 => 6/4.0 =>
        result2 = a*b/(float)c; //a(2)와 b(3) 곱한 결과(6)와 c를 실수로 변환하고(c(4.0)) 나눈 결과값을 저장 result2에 저장
        System.out.printf("%d * %d / %d = %d\n", a,b,c,result1);

        mok = c/b; //c(4)와 b(3) 나눈 후 몫값을 mok에 저장(1)
        System.out.printf("%d / %d = %d\n", c,b,mok);

        namugi = c%b; //c(4)와 b(3) 나눈 후 나머지값을 namugi에 저장(1)
        System.out.printf("%d / %d = %d\n", c,b,namugi);
    }
}
//      _1(몫)_______
//   3 | 4
//       3
//      -1(나머지)----