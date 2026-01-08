package JavaBeginner.Chapter10;

//예외처리
public class EX10_01 {
    public static void main(String[] args) {
        int[] aa = new int[3]; //배열을 선언 aa[0],aa[1],aa[2]

        try { //정상적으로 처리할 내용, 배열사용시 첨자사용에 오류가 많이 발생가능성이 있다.
            aa[2] = 100; //배열의 범위를 벗어나서 처리
        } catch(ArrayIndexOutOfBoundsException e) { //배열의 첨자를 잘못사용했을 때
            System.out.println("첨자사용에 오류가 발생하였습니다.");
        }

        int a, b, c;
        try {
            a = 3;
            b = 2;
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            //단점은 오류가 발생한 정확한 위치를 알 수가 없다.
            System.out.println("[게시판]삽입시 오류가 발생하였습니다.\n"); //사용자 오류메세지
            System.out.println(e); //오류정보
        }
    }
}
//외부작업을 할 때는 반드시 try~catch :
// java에서 데이터베이스 처리, 파일 처리, api(외부) 사용