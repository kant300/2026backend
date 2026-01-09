package JavaBeginner.Chapter11;

//클래스 생성 연습
//클래스를 소유자별로 생성해서 사용

//현대자동차 공장에서 신모델 자동차를 만든다.
class Car{//판매용 자동차
    //자동차를 구성하는 변수(필드)
    String color;
    int speed;

    //자동차의 기능
    void  upSpeed(int value){
        speed += value;//속도증가
    }
    void  downSpeed(int value){
        speed -= value;
    }
}
public class Ex11_1 {
    public static void main(String[] args) {
        //
        Car hong = new Car();//자동차 구매 --클래스 생성은 소유자가 다르다.
        Car lee = new Car();//자동차 구매 --소유자가 다르다.

        //사용하는 클래스는 동일한데 소유자마다 독립적으로 사용

        hong.color = "red";
        lee.color = "blue";

        hong.upSpeed(100); //hong이 자신의 자동차의 속돌글 100km 달린다.
        lee.upSpeed(60);

        System.out.println("hong의 자동차 : "+hong.color+", "+hong.speed);
        System.out.println("lee의 자동차 : "+lee.color+", "+lee.speed);

        //지나가던 kim이 자동차를 보고 구매
        Car kim = new Car();

        //생성한 클래스는 소유자에게 모든 권한
        //소유자.클래스변수, 소유자.메소드() 반드시 소유자. 사용
    }

}
