package Chapter4;

//산술연산자 사용
public class Ex04_01 {
    public static void main(String[] args) {
        int a, b=5,c=3; //정수형으로 a,b,c변수를 선언하고, b에 5, c에 3을 저장

        a = b+c; //b(5)와 c(3)를 더해서 결과(8)를 a에 저장(8)
        System.out.printf("%d + %d = %d\n",b,c,a); //b,c는 계산에 사용된 변수, a는 결과를 저장한 변수

        a = b-c; //b(5)와 c(3)을 뺀 결과(2)를 a에 저장(2)
        System.out.printf("%d - %d = %d\n",b,c,a); //b,c는 계산에 사용된 변수, a는 결과를 저장한 변수

        a = b*c; //b(5)와 c(3)을 곱한 결과(15)를 a에 저장(15)
        System.out.printf("%d * %d = %d\n",b,c,a); //b,c는 계산에 사용된 변수, a는 결과를 저장한 변수

        a = b/c; //b(5)와 c(3)을 나눈값의 몫(1)를 a에 저장(1)
        System.out.printf("%d / %d = %d\n",b,c,a); //b,c는 계산에 사용된 변수, a는 결과를 저장한 변수

        a = b%c; //b(5)와 c(3)을 나눈값의 나머지(2)를 a에 저장(2)
        System.out.printf("%d %% %d = %d\n",b,c,a); //b,c는 계산에 사용된 변수, a는 결과를 저장한 변수
    }
}
