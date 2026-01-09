package JavaBeginner.Chapter12;
//인터페이스
//부모클래스를 상속받는데 상속받은 메소드의 내용이 존재하지 않는 경우
//부모클래스의 내용이 없는 경우에 interface로 선언해서 클래스를 만든다.
interface Cars{//부모클래스
    //메소드 명시화
    //메소드명만 존재
    void work(); //메소드의 내용이 존재하지 않는다.

    //메소드에 빈내용이 존재
    //(X)void work() { }//메소드에 내용이 존재하는 경우

}
class Sedan implements Cars{
    //빈껍데기만 있는 메소드를 채워야 한다.
    //이름만 있는 메소드에 내용을 채우는 것을 오버라이드
    @Override //현재 메소드는 상속받은 빈메소드의 내용
    public void work() {
        System.out.println("오버라이드로 내용을 채운 내용");
    }//Cars상속(빈껍데기만)-반드시 내용을 채워준다.
    //interface는 부모는 메소드이름만, 자식에서 내용을 채운다.
    //extends 처럼 부모를 독립적으로 사용이 불가능함.

}
public class Ex12_2 {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.work();
    }
}
