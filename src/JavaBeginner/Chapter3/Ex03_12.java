package JavaBeginner.Chapter3;

//문자출력-ASCII코드에 문자표를 사용한다. A-65
public class Ex03_12 {
    public static void main(String[] args) {
        char a,b,c,d,e; //5개의 변수를 문자형으로 선언

        a = 'A'; //문자 A(65)를 a변수에 저장

        System.out.printf("%c\t", a); //문자를 출력
        System.out.printf("%d \n", (int)a); //문자A의 코드값을 출력

        //ASCII코드(1바이트=영문자1자리) (0~127)128가지 문자
        b='a'; //문자 a(97)
        c = (char)(b+1); //문자(97)+1=>'b' 문자는 컴퓨터에 코드값으로 저장되어서 연산이 가능
        System.out.printf("%c\t", b); //문자를 출력
        System.out.printf("%c \n", c);

        //유니코드(문자가 2바이트) (각 나라별로 코드표를 부여)
        d = '가';
        e = (char)(d+1); //가 각 간 갇 갈 감....
        System.out.printf("%d\t", (int)d); //가에 대한 문자코드값을 출력
        System.out.printf("%c \n", e);

    }
}
