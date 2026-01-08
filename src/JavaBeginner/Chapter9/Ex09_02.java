package JavaBeginner.Chapter9;

//메소드
public class Ex09_02 {
    //반환값이 없는 메소드
    public static void hello() {
        System.out.println("hello Java");
    }
    //반환값이 존재하는 메소드(처리)
    public static int result() {
        return 10; //반환 데이터타입에 맞는 값을 전달
    }
    //매개변수가 존재하는 메소드
    public static int sum (int a, int b) {
        int c = a + b; //전달받은값을 가공(처리)해서
        return c; //가공한 값을 전달
    }
    //매개변수는 존재하고 전달값은 없는경우
    public static void printName(String name) {
        System.out.println(name);
        //전달값이 없으면 return 생략
    }
    //매개변수와 전달값이 존재하는 경우
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    //배열을 매개변수로 받아서 결과를 전달
    public static int total(int[] arr) {
        int sum = 0;
        for(int n:arr) {
            sum += n;
        }
        return sum;
    }

    //오버로딩(동일한 메소드명으로 여러방법의 처리)
    //add이름의 메소드는 매개변수를 2개 또는 3개로 처리하는 방법
    //메소드 내부의 프로그램 비슷한 작업=>사용 기능이나 목적이 동일한 경우
    public static int add(int a, int b) {
        return a+b;
    }
    public static int add(int a, int b, int c) {
        return a+b+c;
    }

    //main위에 메소드를 배치
    public static void main(String[] args) {
        hello(); //메소드 호출, 반환값이 없으면 변수가 필요가 없다.

        int result = result(); //반환 데이터타입과 동일한 데이터타입의 변수로 받는다., 출력
        System.out.println(result);

        int sum = sum(10,20); //가공에 필요한 값을 전달해서 결과를 받는다.
        System.out.println(sum);

        printName("홍길동");

        //전달받은 결과값을 다른메소드에 매개변수값으로 바로전달
        //isEven()메소드에 10전달해서 받은 결과값을 println()메소드에 전달
        System.out.println(isEven(10));

        int[] nums = {1,2,3};
        System.out.println(total(nums));

        //오버로딩시 메소드 목록이 펼쳐딘다.
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
    }
}
