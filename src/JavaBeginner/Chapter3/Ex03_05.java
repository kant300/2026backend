package Chapter3;

//printf의 활용
public class Ex03_05 {
    public static void main(String[] args) {
        System.out.printf("%d\n", 123);
        System.out.printf("%5d\n", 123); //5자리 확보하고 정수를 출력
        System.out.printf("%05d\n", 123); //5자리에 0으로 채우고 정수를 출력

        System.out.printf("%f\n", 123.45);
        System.out.printf("%7.1f\n", 123.45); //전체자리수 7자리에 소숫점 1자리
        System.out.printf("%7.3f\n", 123.45); //전체자리수 7자리에 소숫점 3자리

        System.out.printf("%s\n", "Hi-Java"); //문자열 출력
        System.out.printf("%10s\n", "Hi-Java"); //10자리를 확보하고 문자열 출력
    }
}

//형식에 사용가능한 문자(데이터형 제외, %)
// \n(개행문자-줄바꿈+커서앞으로) \t(탭키(tab)) \b(backspace(<-) 한칸앞으로)
// \r(커서앞으로) \특수문자(특수문자 출력)