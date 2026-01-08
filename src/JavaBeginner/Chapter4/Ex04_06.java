package JavaBeginner.Chapter4;

//논리연산자(두개 이상의 관계연산자의 비교)
// &&(AND, 논리곱) : 모든 관계연산자가 참이면 True, 아니면 False
// ||(OR, 논리합) : 관계연산자가 하나라도 참이면 True, 아니면 False
// !(NOT, 부정) : 결과를 반전(반대) true이면 false, false이면 true
//& : 앰퍼센트, | : 파이프, 버티컬바, ! : 느낌표
// ; : 세미콜론, : : 콜론
public class Ex04_06 {
    public static void main(String[] args) {
        int a = 99; //정수값을 저장할 변수 a를 선언하고, 99를 초기값으로 저장

        //a>=100&&a<=200 구분이 잘 안된다. 잘못하면 연산순서에 따라 결과가 다르게 나온다.
        //() 그룹처리 : 작업구역 나눌때, 연산순서를 변경할 때
        //(a>=100) && (a<=200)
        //1. a가 100보다 크거나 같냐? =>false
        //2. a가 200보다 작거나 같냐? =>true
        //3  && : false와 true가 모두 참이냐? => false
        System.out.printf("AND 연산 : %s\n", (a>=100) && (a<=200));
        //1. a가 100보다 크거나 같냐? =>false
        //2. a가 200보다 작거나 같냐? =>true
        //3  || : false와 true 중 참이 있는가? => true
        System.out.printf("OR 연산 : %s\n", (a>=100) || (a<=200));
        //1. a와 100이 같냐 => false
        //2. ! : 결과값(false)를 반대로 변경 => true
        // !는 ()가 있고 없고에 따라서 결과가 달라진다.
        System.out.printf("NOT 연산 : %s\n", !(a==100));
        //1. a가 결과를 반대로 바꾸고
        //2. 바뀐a값이 100과 같으냐?
        //System.out.printf("NOT 연산 : %s\n", (!a==100));

    }
}
