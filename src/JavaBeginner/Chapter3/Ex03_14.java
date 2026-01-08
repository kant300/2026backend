package JavaBeginner.Chapter3;

//논리형 사용
public class EX03_14 {
    public static void main(String[] args) {
        boolean bool1, bool2, bool3; //논리형 변수 bool1, bool2를 선언

        //저장가능한 값은 true(1), false(0)
        //가장 적은 공간을 사용

        bool1 = true; //논리형
        System.out.printf("%s\n", bool1);
        //      관계연산자(>,<,>=,<=,==,!=)
        bool2 = (10 == 20); //10이 20과 같으냐 =>false
        System.out.printf("%s\n", bool2);
        //      조건연산자(조건식?참일때:거짓일때)
        bool3 = 10>20?true:false;
        System.out.printf("%s\n", bool3);
    }

}

//true,false의 사용용도
//메소드를 정상적으로 처리했는지, 비정상적으로 처리했는지 판별
//사용자의 요청을 정상적으로 받았는지 판별
//요청받은 내용을 정상적으로 처리했는지 판별

//브라우저 ------>요청--------->자바(수신성공 true, 수신실패 false) 404코드
//브라우저<-------응답<---------자바(처리성공 true, 처리실패 false) 500코드