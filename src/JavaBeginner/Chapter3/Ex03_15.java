package Chapter3;

//문자열 처리
//"" 안에 작성, String 래퍼클래스를 사용===>존재하지 않는 데이터타입
//변수에 값을 저장할 때 마지막에 저장한 값만 남는다.
public class EX03_15 {
    public static void main(String[] args) {
        String str1 = "IT CookBook 입니다."; //str1을 문자열로 선언하고 초기값을 저장
        String str2 = "10"; //str2를 문자열로 선언하고 문자(10)을 저장
        String str3 = "20";


        //기본에 저장한 "IT CookBook 입니다."문자열은 삭제된다.
        str1 = "Java 입니다."; //str1에 새로운 문자열(Java 입니다)를 저장

        System.out.printf("%s\n", str1);
        System.out.printf("%s\n", str2+str3); //문자열을 연산(+) 문자열을 결합
        //Python에서는 연산(*) 가능===>반복

    }
}
