자바기초(문법)
1. 프로그램작성요령(구문)
    class sample{
        변수선언(멤버변수)
        접근자 전달자 메소드명(매개변수){
            문장(명령어);
        }
    }
2. Java, C, C++는 maim()메소드 시작
3. 표준입력장치 : Scanner, System.out.print
4. 변수(메소드내)=속성(객체내)=필드(클래스내)
    변수에 저장되는 형태 : 데이터형
    int(Integer), double(Double), String, boolean(Boolean)
    데이터형 : 기본형 소문자로 구성, 메소드내에서 변수선언
              명시형 대문자로 시작, 필드로 선언 <-> 데이터베이스 연계
5. 연산자 : 계산이 목적
6. 조건문 : if문 특별한 switch문
            >,>=,<,<=,==,!=(관계연산자), &&, ||, !(논리연산자)
7. 반복문 : 일정한 작업을 반복할 때 
            for : javascript, for~Each : 스프링부트
            for(초기값;조건;증감) : 조건에 만족할때 까지 반복
            for(받을변수:리스트(배열)) : 하나씩 받을 변수에 전달해서 반복
                                      전달할 값이 없을때까지 반복
8. 배열, 리스트, 맵 : 변수를 확장

객체프로그램
1. 클래스 이용
   클래스 생성 : new 생성자() => 기존 클래스를 복사해서 여러개 사용
                스프링부트에 기본적으로 생성을 통해서 이용
   클래스 상속 : extends 클래스, implements 인터페이스,
               => 기존 클래스와 결합해서 한번 사용
                  스프링부트에서 데이터베이스와 연계할 때 이용
2. 클래스 중요 용어
   생성자를 여러개 만들어서 상황에 따라 적용 : 오버로딩(Overload)
   메소드의 내용을 변경해서 적용 : 오버라이드(Override)
   @ : 어노테이션, 컴파일할때 정보를 제공, 자동으로 프로그램 구현
3. 클래스 종류
   class : 변수와 메소드로 구성된 클래스, extends 또는 new 생성자 이용
   interface : 변수와 빈메소드로 구성된 클래스, extends 또는 implements
                extends 연결하면 interface가 결합 - 추상클래스
                implements 연결하면 interface가 결합후 반드시 메소드 내용을 작성
4. public sample(); 빈 메소드, 이름만 지정하고
                    sample() 메소드가 프로그램 어딘가에 존재
                    추상메소드
   public sample(){
        작성
    }
5. 클래스 사용
    extends 또는 implements로 상속받은 클래스와 메소드는 일반메소드처럼 사용
    new 생성자를 통한 클래스는 소유자, 메소드 사용

    class sample{
        public void sum(int a, int b){
            System.out.println(a+b);
        }
    }
   class test extends sample{
        sum(5, 3); // 상속받은 클래스의 메소드는 메소드명으로만 지정해서 사용
   }
   class Test2{
        public static void main( ){
            Sample data(소유자) = new Sample();
            data.sum(5, 3); // 클래스를 생성후 사용시 소유자.메소드명()
        }
   }

프로그램 공부
1. 타이핑 연습 : 연습문제 반복작업
2. 문제와 결과만 **분석**
    1) 문제를 보고 결과가 나오려면 어떻게 해야하는지를 생각
    2) 수동으로 작업할때 작업순서를 세부적으로 생각(문제해결) 
        - 중간 생략없이 상세히 순서를 지정
    3) 작업순서대로 코딩 (알고있는 명령어로만 구현)
    4) 결과가 비슷하게 나오면 최적화(불필요한 명령제거, 적당한 명령어 또는 메소드적용) 
    5) 코딩시 명령어를 해석하면서 작성 

Gap(좌우 상하여백) : HTML에서 Margin(바깥여백), Padding(안쪽여백)

윈도우     java        SpringBoot
이벤트     이벤트리스터   Service

SpringBoot
디자인(UI/UX) <--------->주소연결<--------->작업처리<--------->데이터베이스(자료를 반영구저장)
HTML                    Controller       Service         Repository
            변수DTO                               Entity
