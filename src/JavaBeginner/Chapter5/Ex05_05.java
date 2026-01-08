package JavaBeginner.Chapter5;

public class Ex05_05 {
    public static void main(String[] args) { //시작을
        int a = 200; //정수를 저장할 a를 선언해서 200을 저장

        //if문에서 관계연산자는 <,>,= 모두사용, ==, != 모두 사용
        if(a<100) { //만약 a가 100보다 작으면(<)
            System.out.printf("100보다 작군요\n"); //출력을 100보다 작군요
            System.out.printf("참이면 이 문장도 보여요\n");//출력을 참이면 이문장....
        } else { //그게아니고 a가 100보다 작지 않으면(>,=)
            System.out.printf("100보다 큽니다.\n"); //출력을 큽니다..
            System.out.printf("거짓이면 이 문장도 보여요\n"); //출력을 거짓이면...
        }
        //모든 조건처리가 끝나면
        System.out.print("프로그램 끝\n"); //출력은 프로그램 끝...
    }
}
