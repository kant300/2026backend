package Chapter3;

//변수 선언과 변수에 값을 대입(=,저장)-왼쪽내용을 오른쪽 전달
public class Ex03_07 {
    //전역변수
    public static void main(String[] args) {
        //지역변수
        int a;      //정수를 저장할 변수 a를 선언
        double b;    //실수를 저장할 변수 b를 선언

        //= 좌우에 데이터형은 반듯히 동일하게 작업

        a = 123; //정수값을 저장, 변수에 데이터형에 맞게 값을 저장
        b = 123.50; //실수값을 저장
        System.out.printf("a의 값===>%d\n", a);
        System.out.printf("b의 값===>%f", b);

        //강제 데이터형 변경, 캐스트연산자 : (데이터형)
        a = (int)123.12; //데이터형이 틀리면 오류가 발생, 강제로 데이터형을 변경
        b = 123; //실수는 정수가 저장되면 자동으로 .0으로
        System.out.printf("a의 값===>%d\n", a);
        System.out.printf("b의 값===>%f", b);
    }
}
