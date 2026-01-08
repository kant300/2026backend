package JavaBeginner.Chapter9;

//문자열 클래스에 주요 메소드
public class Ex09_01 {
    public static void main(String[] args) {
        String a="abc";
        System.out.printf("길이 : %d\n", a.length()); //글자수

        String b=""; //빈문자열
        String c=" "; //빈공백이 존재하는 문자열
        System.out.println("b문자열 isEmpty : "+b.isEmpty());
        System.out.println("c문자열 isEmpty : "+c.isEmpty());

        System.out.println("b문자열 isBlank : "+b.isBlank());
        System.out.println("c문자열 isBlank : "+c.isBlank());

        String d="Abc";
        System.out.println("d문자열 equals : "+d.equals("Abc")); //대소문자 일치하게
        System.out.println("d문자열 equals : "+d.equals("abc"));

        System.out.println("d문자열 equalsIgnoreCase : "+d.equalsIgnoreCase("Abc")); //대소문자 일치하게
        System.out.println("d문자열 equalsIgnoreCase : "+d.equalsIgnoreCase("abc"));

        String e="Java String Class"; //특정위치의 문자를 추출
        System.out.println("e문자열 charAt(0) : "+e.charAt(0));
        System.out.println("e문자열 charAt(2) : "+e.charAt(2));

        String f="Java String Class"; //찾을 문자열을 앞에서 또는 뒤에서부터 검색
        System.out.println("f문자열 indexOf(A) : "+f.indexOf("a"));
        System.out.println("f문자열 lastIndexOf(A) : "+f.lastIndexOf("a"));

        String g="Java String Class"; //찾는 문자열이 존재하면 true, 없으면 false
        System.out.println("g문자열 contains(ass) : "+g.contains("ass"));
        System.out.println("g문자열 contains(Str) : "+g.contains("Str"));

        String h="Java String Class"; //문자열에 특정단어로 시작 또는 끝나는 비교
        System.out.println("h문자열 startWith(java) : "+g.startsWith("Java"));
        System.out.println("h문자열 endWith(java) : "+g.endsWith("Java"));

        String i="Java String Class"; //지정위치로부터 종료위치전까지 문자열 추출
        System.out.println("i문자열 subString(5부터,9전까지) : "+i.substring(5,9));

        String j="Java String Class"; //지정한 문자열을 새로운 문자열로 치환
        System.out.println("i문자열 replace(java, hello) : "+i.replace("Java", "Hello"));
    }
}
