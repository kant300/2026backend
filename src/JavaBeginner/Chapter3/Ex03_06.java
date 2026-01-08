package Chapter3;

//printf에서 특수문자 활용
public class Ex03_06 {
    public static void main(String[] args) {
        System.out.printf("\n줄바꿈\n연습\n"); //명령하나로 여러행을 출력
        System.out.printf("\t탭키\t연습\n"); //한행의 내용을 일정한 간격으로 출력
        System.out.printf("이것을\r덮어습니다.\n"); //출력시 수정을 할 때
        System.out.printf("글자가 \"강조\"되는 효과\n"); //출력시 특수문자를 출력할 때
        System.out.printf("\\\\\\역슬래시 세개 출력\n"); //동일한 기호 출력
    }
}
