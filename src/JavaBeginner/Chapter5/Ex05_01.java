package JavaBeginner.Chapter5;

public class Ex05_01 {
    public static void main(String[] args) {
        int a = 99; //정수를 저장할 변수 a 선언하고, 초기값 99을 저장

        //만약 a가 100보다 작으면(true) 100보다 작습니다.를 출력
        if(a<100) System.out.printf("100보다 작습니다.\n");

        //만약 a가 100과 같으면(false) 100과 같습니다.를 출력
        if(a==100) System.out.printf("100과 같습니다.\n");

        //만약 a가 100보다 크면(false) 100보다 큽니다.를 출력
        if(a>100) {
            System.out.printf("100보다 큽니다.\n");
        }
    }
}
