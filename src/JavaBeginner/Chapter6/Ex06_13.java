package JavaBeginner.Chapter6;

public class Ex06_13 {
    public static void main(String[] args) {
        for(int a = 0; a < 3; a++){
            System.out.printf("a(밖)for문의 반복수: %d\n", a);
            for(int b = 0; b < 2; b++){
                System.out.printf("b(안쪽)for문의 반복수: %d\n", b);
            }
        }

        for(int a=0;a<5;a++){
            for(int b=0;b<5;b++){
                System.out.print("*"); //옆으로 b반복만큼 출력
            }
            System.out.println(); //줄바꿈 a반복만큼 출력
        }

        //a=0, b=0
        //a=1, b=0,1
        //a=2, b=0,1,2
        //a=3, b=0,1,2,3
        for(int a=0;a<5;a++){
            for(int b=0;b<=a;b++){
                System.out.print("*"); //옆으로 b반복만큼 출력
            }
            System.out.println(); //줄바꿈 a반복만큼 출력
        }

        //a=5, b=0,1,2,3,4
        //a=4, b=0,1,2,3
        //a=3, b=0,1,2
        //a=2, b=0,1
        for(int a=5;a>0;a--){ //초기값<조건 ++, 초기값>조건 --
            for(int b=0;b<a;b++){
                System.out.print("*"); //옆으로 b반복만큼 출력
            }
            System.out.println(); //줄바꿈 a반복만큼 출력
        }
        //    * 빈공백(4)별(1)
        //   ** 빈공백(3)별(2)
        //  *** 빈공백(2)별(3)
        // ****
        //*****
        for(int a=0;a<5;a++){ //초기값<조건 ++, 초기값>조건 --
            for(int c=0;c<4-a;c++){ //빈공백
                System.out.print(" "); //옆으로 b반복만큼 출력
            }
            for(int b=0;b<=a;b++){ //a만큼 별을 출력
                System.out.print("*"); //옆으로 b반복만큼 출력
            }
            System.out.println(); //줄바꿈 a반복만큼 출력
        }
    }
}
