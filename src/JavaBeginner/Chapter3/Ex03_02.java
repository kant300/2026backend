package Chapter3;

//예문) 형식과 전달하는 값의 개수가 틀린경우
public class Ex03_02 {
    public static void main(String[] args) {
        //보내는 값이 받는것보다 많으면 남는 값은 무시
        System.out.printf("%d\n", 100,200); //받는 곳(%d-1개), 보내는 값(100,200 2개)
        System.out.printf("\n");
        //보내는 값이 받는값보다 적으면 오류
        System.out.printf("%d %d\n", 100); //받은 곳(%d %d-2개), 보내는 값(100 1개)
        System.out.printf("\n");
    }
}
//형식의 갯수와 보내는 값의 갯수는 같거나 커야만 함