package JavaBeginner.Chapter11;
//애완동물(pet)가게에서 동물팔아요
//애완동물의 구성이 : 동물종류, 동물나이, 움직
class Pet {
    String type; //동물의 종류
    int age; //나이

    void move() {
        //메소드에서 인스턴스(필드)를 사용할 때는 this. (생성전 클래스내에서 사용)
        System.out.println(this.type+"이 움직입니다.");
    }

    //인스턴스(필드)는 직접적으로 사용을 금지(JAVA)
    //인스턴스 변수에 접근할 수 있는 메소드를 만들어서 사용

    //변수에 저장하는 메소드는 Setter라고 함.
    //set변수명을 첫글자 대문자로 바꾸어서 선언(반드시 변수명은 소문자로 구성)
    public void setType(String type) { //type변수에 저장하는 메소드
        this.type = type;
    }
    public void setAge(int age) { //age변수에 저장하는 메소드
        this.age = age;
    }
    //변수에 값을 읽어오는 메소드는 Getter라고 함.
    //set변수명을 첫글자 대문자로 바꾸어서 선언(반드시 변수명은 소문자로 구성)
    public String getType() { //type변수를 읽어오는 메소드
        return this.type;
    }
    public int getAge() { //age변수를 읽어오는 메소드
        return this.age;
    }
}

public class Ex11_29 {
    public static void main(String[] args) {
        Pet pet = new Pet(); //생성자가 없으면
        Pet pet2 = new Pet();

        //인스턴스를 직접사용(클래스 변수)===>HTML에 사용
        pet.type ="강아지"; //생성후 클래스변수를 이용해서 적용
        pet.age = 8;

        pet2.type = "고양이";
        pet2.age = 12;

        System.out.println("pet의 클래스는 "+pet.type+", "+pet.age);
        System.out.println("pet2의 클래스는 "+pet2.type+", "+pet2.age);

        pet.move();
        pet.move();
        pet2.move();

        Pet pet3 = new Pet();
        pet3.setType("강아지");
        pet3.setAge(12);
        System.out.println("pet3의 클래스는 "+pet3.getType()+", "+pet3.getAge());

    }
}
