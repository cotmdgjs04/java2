/*  예제 2-1 : Hello.java
* Hello.java는 두 정수를 더하는 sum()함수를 정의,
* main() 함수에서 이 함수를 호출하여 결과를 출력하는 예제
*/
public class Foo {
    // 두 정수를 더하는 메소드
    public static int sum(int n, int m) {
        return n + m;
    }

    // main() 메소드에서 실행 시작 
    public static void main(String[] args) {
        int i = 20; // i 에 20 저장
        int s;
        char a;

        s = sum(i,10);                    // 메소드 호출
        a = '?';   
        System.out.println(a);              // 문자 '?' 출력
        System.out.println("Hello");     // "Hello" 문자열 출력
        System.out.println(s);             // 정수 s 값 30 출력
    }
}
