package JavaBeginner.Chapter12;

//우리 아버지 자동차가 있다. 사용하던 도중에 자식에 물려줬다.
//자식-자동차, 부모-자동차

class Car{
    String color="red";
    int speed =100;

    //Setter와 Getter를 자동생성
    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }


    public void  setColor(String color){
        this.color=color;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }

}
class NewCar extends Car{//상속 Car
    //내용이 없다.
}

public class Ex12_1 {//나에게 상속
    public static void main(String[] args) {
        NewCar hong = new NewCar();//NewCar클래스+상속받은 Car클래스
        hong.setColor("black");//상속받은 Car클래스의 메소드를 바로 사용
        hong.setSpeed(100);//상속받은 Car클래스 메소드

        System.out.println(hong.getColor());
        System.out.println(hong.getSpeed());

    }
}

/*
public class Ex12_1 extends Car{//나에게 상속
    String color="red"; //상속받은 내용이 내클래스에 추가
    int speed =100;

    public static void main(String[] args) {

    }
}

 */