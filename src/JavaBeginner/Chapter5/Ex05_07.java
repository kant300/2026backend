package JavaBeginner.Chapter5;
//프로그램 시작을 위해서 클래스를 생성을 한다.
public class Ex05_07 {
    //프로그램 구동을 위해서 main을 생성
    public static void main(String[] args) {
        int a = 45; //정수값을 저장할 a를 선언해서 75를 저장

        if(a>50) { //만약에 a가 50보다 크면(true)   a>50
            if(a<100) { //만약 a가 100보다 작으면   a<100 =      50<a<100
                System.out.printf("50보다 크고, 100보다 작습니다.\n");
            } else { //50보다 크고, 100보다 크다
                System.out.printf("50보다 크고, 100보다 크다.\n");
            }

        } else { //그렇지 않고 a가 50보다 작거나 같으면
            System.out.printf("50보다 작거나 같다.\n");
        }
    }

}
