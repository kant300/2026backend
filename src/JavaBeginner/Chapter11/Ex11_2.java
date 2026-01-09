package JavaBeginner.Chapter11;

//자동차 공장에서 자동차를 제작
//판매시 옵션 존재
//기본 자동차, 색상을 사용자가 변경한 자동차, 색상과 속도를 사용자가 변경한 자동차
//클래스를 생성할때 다양한 형태로 생성하는 방법 : 오버로딩
class NewCar{
    String color = "grey";
    int speed = 100;

    //생성자(클래스명 = 메소드명)
    //메소드명 NewCar(), NewCar(String color), NewCar(String color, int
    // speed)
    //메도드명이 같으면 오버로딩
    //오버로딩은 메소드명 동일하게(매개변수): 매개변수의 데이터타입 또는 갯수는 다르게

    public NewCar(){} //기본생성(회색, 100), 생략가능

    public NewCar(String color){//사용자가 생성시 색상을 지정
        this.color = color;
    }
    public NewCar(String color, int speed){//사용자가 생성시 색상과 속도를 지정
        this.color = color;
        this.speed = speed;
    }

}
public class Ex11_2 {
    public static void main(String[] args) {
        //생성자를 이용하면, 생성시 필요한 초기설정을 지정
        NewCar hong = new NewCar();//hong이 자동차를 기본으로 구매(생성)
        NewCar lee = new NewCar("blue");//lee는 자동차를 구매시 색상을 지정
        NewCar kim = new NewCar("red", 200); //kim은 구매시 색상과 속도를 지정

        System.out.println("hong 자동차 : "+hong.color+", "+hong.speed);
        System.out.println("lee 자동차 : "+lee.color+", "+lee.speed);
        System.out.println("kim 자동차 : "+kim.color+", "+kim.speed);
    }
}
