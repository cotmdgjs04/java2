# 202330231 채승헌 
# JAVA2

---

## 9주차 2026/04/29
## 상속의 장점
- 클래스 사이의 멤버 중복 선언 불필요
    - 클래스의 간결화
- 클래스들의 계층적 분류로 클래스 관리 용이
- 클래스 재사용과 확장을 통한 소프트웨어의 생산성 향상

## 자바의 상속 선언
- 상속하는 클래스를 ``슈퍼 클래스``라고 함
- 상속 받는 자식 클래스를 ``서브 클래스`` 라고 함

## 자바 상속의 특징
- 클래스 ``다중 상속`` 불허
- 자바의 모든 클래스는 자바에서 제공하는 Object 클래스를 자동으로 상속받도록 컴파일 됨
    - 유일하게 슈퍼 클래스를 가지지 않는 클래스

## 서브 클래스와 슈퍼 클래스의 생성자 선택
- 슈퍼 클래스와 서브 클래스 : 각각 ``여러 개의 생성자`` 작성 가능
- 서브 클래스의 객체가 생성 될 때 : 슈퍼 클래스 생성자 1개와 서브 클래스 생성자 1개가 실행
- 슈퍼 클래스의 생성자가 먼저 실행 됨


## 업캐스팅
- 서브 클래스는 슈퍼 클래스의 속성을 ``상속``받음
- 서브 클래스는 슈퍼클래스로 ``취급`` 될 수 있음
- 서브 클래스 객체가 슈퍼 클래스 타입으로 변환되는 것을 ``업캐스팅`이라고 함
```bash
Person p;
Student s = new Student();
p = s; // 업캐스팅
```
- 업캐스팅한 레퍼런스로는 객체 내에 실존하는 모든 데이터를 접근 할 수 없고 ``슈퍼 클래스의 멤버``만 접근 할 수 있음
- ``명시적 타입 변환``을 하지 않아도 됨
```bash
p = (Person)s; // (Person)을 생략하고, p = s; 로 해도 됨
```

## 다운캐스팅
- 슈퍼 클래스 레퍼런스를 서브 클래스 레퍼런스에 대입
- 업캐스팅 된 것을 다시 ``원래대로 되돌리는 것``
- 반드시 ``명시적 타입 변환 지정``
```bash
Person p = new Student("이재문"); // 업캐스팅
Student s = (Student)p; // 다운캐스팅, (Student)의 타입 변환을 반드시 지정
```

## 메소드 오버라이딩의 개념
- 서브 클래스에서 슈퍼 클래스의 메소드 ``중복`` 작성
- ``슈퍼 클래스의 메소드 무력화``, 항상 서브 클래스에 ``오버라이딩한 메소드``가 실행되도록 보장
- 서브 클래스에 오버라이딩한 메소드는 반드시 슈퍼 클래스에 작성된 메소드의 ``이름, 리턴 타입, 매개 변수 리스트가 모두 같도록 작성``되어야 함

## 오버라이딩의 목적, 다형성 실현
- 오버라이딩으로 ``다형성`` 실현
- 하나의 ``인터페이스(같은 이름)``에 서로 다른 구현
- 슈퍼 클래스의 메소드를 서브 클래스에서 각각 목적에 맞게 다르게 구현

## 오버로딩과 오버라이딩
- ``오버라이딩``은 슈퍼 클래스에 있는 ``메소드와 이름, 매개 변수 타입과 개수, 리턴 타입 등``이 모두 동일한 메소드가 서브 클래스에 재정의되었을 경우임
- ``오버로딩``은 한 클래스나 ``상속 관계에 있는`` 클래스에 서로 매개 변수의 타입이나 개수가 다른 여러 개의 메소드가 같은 이름으로 작성되는 것을 지칭함

## 추상 메소드
- ``추상 메소드``란 abstract 키워드와 함께 원형만 선언되고, 코드는 작성되지 않은 메소드
```bash
abstract public String getName(); // 추상 메소드
abstract public String fail() { return "God Bye"; } // 추상 메소드 아님, 컴파일 오류
```

## 추상 클래스 선언
- 추상 메소드를 최소 한 개 이상 가지고 abstract로 선언된 클래스
- 추상 메소드가 없어도 ``abstract``로 선언한 클래스
- 추상 메소드를 가지고 있으면 ``반드시 추상 클래스로 선언되어야 함``

## 추상 클래스의 목적
- 객체(인스턴스)를 생성하기 위함이 아니며, 상속을 위한 ``슈퍼 클래스``로 활용하기 위한 것
- 추상 클래스는 추상 메소드를 통해 서브 클래스가 구현할 메소드의 원형을 알려주는 ``인터페이스``의 역할을 하고, 서브 클래스의 ``다형성``을 실현

---

## 자바 인터페이스
- 자바의 인터페이스는 ``interface`` 키워드를 사용하여 클래스를 선언하듯이 선언함

## 인터페이스를 구성하는 멤버들의 특징
- 상수는 ``public static final`` 속성이며, 속성은 생략 가능함
- 추상 메소드는 속성이 ``public abstract``로 정해져 있으며 생략 가능
- ``default``메소드의 접근 지정은 public으로 고정되어 있음
- ``private``메소드는 인터페이스 내의 다른 메소드에서만 호출 가능
- ``static``메소드의 경우 접근 지정이 생략되면 public이며, private로 지정 가능함
- ``default, private, static``메소드들은 코드가 작성되어 있어야 함

### Ex51ColorPointEx.java
```bash
    public static void main(String[] args) {
        Point p = new Point(); // Point 객체 생성
        p.set(1, 2); // Point 클래스의 set() 호출
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3, 4); // Point 클래스의 set() 호출
        cp.setColor("red"); // ColorPoint의 setColor() 호출
        cp.showColorPoint(); // 컬러의 좌표 출력
    }
}


class Point {
    private int x, y; // 한 점을 구성하는 x, y 좌표
    public void set(int x, int y) {
        this.x = x; this.y = y;
    }
    public void showPoint() { // 점의 좌표 출력
        System.out.println("(" + x + "," + y + ")");
    }
}


class ColorPoint extends Point { // Point를 상속받은 ColorPoint 선언
    private String color; // 점의 색
    public void setColor(String color) {
        this.color = color;

    }
    public void showColorPoint() { // 컬러 점의 좌표 출력
        System.out.print(color);
    showPoint(); // Point 클래스의 showPoint() 호출
    }
}

```

#### 결과
```bash
(1,2)
red(3,4)
```


---
---


## 7주차 2026/04/15

## 객체 생성과 활용
1. 레퍼런스 변수 선언
```bash
Circle pizza;
```
2. 객체 생성
- new 연산자 이용

```bash
pizza = new Circle();
```

3. 객체 멤버 접근
- 점(.) 연산자 이용

```bash
pizza.radius = 10;
area = pizza.getArea();
```

---

## 생성자의 특징
- 생성자 이름은 ``클래스 이름과 동일``
- 생성자는 여러 개 작성 가능(생성자 중복)
```bash
public class Circle{
    public Circle() {...} // 매개 변수 없는 생성자
    public Circle(int r, String n) {...} // 2개의 매개 변수를 가진 생성자
}
```

- 생성자는 객체 생성시 한 번만 호출
    - 자바에서 객체 생성은 반드시 ``new`` 연산자로 함
```bash
Circle pizza = new Circle(10, "자바피자"); // 생성자 Circle(int r, String n) 호출
Circle donut = new Circle(); // 생성자 Circle() 호출
```
- 생성자의 목적은 객체 생성 시 ``초기화``
- 생성자는 리턴 타입을 지정할 수 없음

---

## 생성자의 종류
- 기본 생성자(default constructor) : ``매개 변수 없고``, 아무 작업 없이 단순 ``리턴``하는 생성자
```bash
class Circle() {
    public Circle() { } // 기본 생성자
}
```
- 기본 생성자가 자동 생성되는 경우
    - 클래스에 생성자가 하나도 ``선언되어 있지 않을 때``
    - 컴파일러에 의해 기본 생성자 자동 생성

- 기본 생성자가 자동 생성되지 않는 경우
    - 클래스에 생성자가 ``선언되어`` 있는 경우
    - 컴파일러는 기본 생성자를 자동 생성해 주지 않음

---

## this 레퍼런스
- 객체 자신에 대한 레퍼런스
- 컴파일러에 의해 자동 관리, 개발자는 사용하기만 하면 됨
- ``this.멤버`` 형태로 멤버를 접근할 때 사용

## this()로 다른 생성자 호출
- 같은 클래스의 다른 생성자 호출
- ``생성자 내``에서만 사용 가능
- ``생성자 코드의 제일 앞``에 있어야 함

---

## 객체 배열
- 객체에 대한 레퍼런스 배열
- 자바의 객체 배열 생성
1. 배열 레퍼런스 ``배열 선언``
2. 레퍼런스 ``배열 생성``
3. 배열의 각 원소 ``객체 생성``

```bash
Circle [] c; // 1. Circle배열에 대한 레퍼런스 변수 c 선언
c = new Circle[5]; // 2. 레퍼런스 배열 생성

for(int i=0; i<c.length; i++) // c.length는 배열 c의 크기로서 5
    c[i] = new Circle(i); // 3.각 원소 객체 생성

for(int i=0; i<c.length; i++)
    System.out.println((int)(c[i].getArea()) + " "); // 배열의 원소 객체 사용
```

---

## 메소드
- 자바의 모든 메소드는 반드시 ``클래스 안에`` 있어야함(캡슐화 원칙)
```bash
public int getSum(int i, int k) { // public: 접근 지정자, int: 리턴 타입, getSum: 메소드 이름, (int i, int j): 메소드 인자들
    int sum;
    sum = i + j;
    return sum;
}
```
- 접근 지정자 : 다른 클래스에서 ``메소드를 접근할 수 있는지`` 여부 선언
    - public, private, protected, 디폴트(접근 지정자 생략)
- 리턴 타입 : 메소드가 ``리턴하는 값의 데이터 타입``

### 1. 인자 전달 - 기본 타입의 값이 전달되는 경우
- 매개 변수가 byte, int, double, 등 ``기본 타입``으로 선언되었을 때
    - 호출자가 건네는 값이 매개 변수에 ``복사되어 전달, 실 인자 값은 변경 안 됨``

### 2. 인자 전달 - 객체가 전달되는 경우
- 객체의 레퍼런스만 전달 : 매개 변수가 ``실 인자 객체 공유``

### 3. 인자 전달 - 배열이 전달되는 경우
- 배열 레퍼런스만 매개 변수에 전달 : ``배열 통째로 전달되지 않음``
- 객체가 전달되는 경우와 동일 : 매개 변수가 ``실 인자의 배열 공유``

---

## 메소드 오버로딩(Overloading)
- 한 클래스 내에서 ``두 개 이상``의 ``이름이 같은 메소드`` 작성
- 메소드 ``이름이 동일``해야 함
- 매개 변수의 ``개수 혹은 타입``이 달라야 함
- 리턴 타입은 오버로딩과 관련 없음

## 객체 치환 시 주의할 점
- 객체 치환은 객체 복사가 아니며, 레퍼런스의 복사
```bash
Samp ob1 = new Samp(3);
Samp ob2 = new Samp(4);

s = ob2; // 객체 치환, s는 ob2의 객체를 가리킴

ob1 = ob2; // 객체 치환, ob1은 ob2의 객체를 가리키게 됨
```

---

## 객체 소멸
- new로 ``할당 받은 객체와 메모리를 JVM으로 되돌려 주는 행위``
- 자바는 ``객체 소멸 연산자 없음``
- 객체 소멸은 JVM의 고유한 역할
- C/C++에서는 할당 받은 객체를 개발자가 프로그램 내에서 삭제해야 함
- C/C++의 프로그램 작성을 어렵게 만드는 요인
- 자바에서는 사용하지 않는 객체나 배열을 돌려주는 코딩 책임으로부터 개발자 해방

---

## 가비지
- ``가리키는 레퍼런스가 하나도 없는 객체``
- 더 이상 접근할 수 없어 사용할 수 없게 된 메모리
- ``가비지 컬렉션`` : 자바 가상 기계의 가비지 컬렉터가 ``자동으로 가비지 수집, 반환``

```bash
Person a, b;
a = new Person("이몽룡");
b = new Person("성춘향");

b = a; // b가 가리키던 객체는 가비지가 됨
```

## 가비지 컬렉션(garbage collection)
- JVM이 가비지 자동 회수
    - 가용 메모리 공간이 일정 이하로 부족해질 때
    - 가비지를 수거하여 가용 메모리 공간으로 확보
- ``가비지 컬렉터(garbage collector)``에 의해 자동 수행
- 강제 가비지 컬렉션 강제 수행 : System 또는 Runtime 객체의 gc() 메소드 호출
```bash
System.gc(); // 가비지 컬렉션 작동 요청
```
- 이 코드는 JVM에 ``강력한 가비지 컬렉션 요청``
- 그러나 ``JVM이 가비지 컬렉션 시점을 전적으로 판단``

---

## 자바의 패키지 개념
- 상호 관련 있는 클래스 파일(컴파일된 .class)을 저장하여 관리하는 디렉터리
- 자바 응용프로그램은 하나 이상의 패키지로 구성

---

## 접근 지정자
- 자바의 접근 지정자 4가지 : ``private, protected, public, 디폴트(접근 지정자 생략)``
- 접근 지정자의 목적
    - 클래스나 일부 멤버를 공개하여 ``다른 클래스에서 접근하도록 허용``
    - 객체 지향 언어의 캡슐화 정책은 ``멤버를 보호하는 것``
        - 접근 지정은 ``캡슐화에 묶인 보호를 일부 해제할 목적``으로 사용

---

## 클래스 접근 지정
- 다른 클래스에서 사용하도록 허용할 지 지정
- public 클래스 : 다른 ``모든 클래스``에게 접근 허용
- 디폴트 클래스(접근 지정자 생략) : ``같은 패키지의 클래스에``만 접근 허용
```bash
public class World { // public 클래스
................
}
class local { // 디폴트 클래스
............
}
```

---

## 멤버 접근 지정
- public 멤버 : 패키지에 관계 없이 ``모든 클래스``에게 접근 허용
- private 멤버 : ``동일 클래스 내``에만 접근 허용, ``상속 받은 서브 클래스에서 접근 불가``
- protected 멤버: ``같은 패키지 내``의 다른 모든 클래스에게 접근 허용
    - ``상속 받은 서브 클래스는 다른 패키지에 있어도 접근 가능``
- 디폴트(default) 멤버 : ``같은 패키지 내``의 ``다른 클래스``에게 접근 허용

---

## static 멤버
- static 멤버 선언
```bash
class StaticSample {
    int n;          // non-static 필드
    void g() {...}  // non-static 메소드
    
    static int m;   // static 필드
    static void f() {...} // static 메소드
}
```

- 객체 생성과 non-static 멤버의 생성
    - non-static 멤버는 ``객체가 생성될 때, 객체마다 생김``
- 객체마다 n, g()의 non-static 멤버들이 생김

## static 멤버의 생성
- static 멤버는 클래스당 하나만 생성
- 객체들에 의해 공유됨

## static 멤버 사용
- 클래스 이름으로 접근 가능
```bash
StaticSample.m = 3;     // 클래스 이름으로 static 필드 접근
StaticSample.f();       // 클래스 이름으로 static 메소드 호출
```
- 객체의 멤버로 접근 가능
```bash
StaticSample b1 = new StaticSample();

b1.m = 3;   // 객체 이름으로 static 필드 접근
b1.f();     // 객체 이름으로 static 메소드 호출
```
- non-static 멤버는 클래스 이름으로 접근 안됨
```bash
StaticSample.n = 5; // n은 non-static이므로 컴파일 오류
StaticSample.g();   // g()는 non-static이므로 컴파일 오류
```

## static의 활용
- 전역 변수와 전역 함수를 만들 때 사용
- 공유 멤버를 만들 때 : static으로 선언한 멤버는 클래스의 객체들 사이에 공유

## static 메소드의 제약 조건 1
- static 메소드는 오직 static 멤버만 접근 가능
    - 객체가 생성되지 않은 상황에서도 static 메소드는 실행될 수 있기 때문에, ``non-static 멤버 활용 불가``
    - non-static 메소드는 ``static 멤버 사용 가능``

## static 메소드의 제약 조건 2
- static 메소드는 ``this 사용불가``
- static 메소는 객체 없이도 사용 가능하므로, ``this 레퍼런스 사용할 수 없음``

---

## final 클래스와 메소드
- final 클래스
    - 더 이상 클래스 상속 불가능
    - 더이상 오버라이딩 불가능

## final 필드
- final 필드
    - 상수를 선언할 때 사용
- 상수 필드는 선언 시에 ``초기 값을 지정``하여야 함
- 상수 필드는 실행 중에 ``값을 변경 할 수 없음``

---
### 코드
### Ex4_1.java

```bash
public class Ex4_1 {
    int radius;     // 원의 반지름 필드
    String name;    // 원의 이름 필드

    public double getArea() { // 멤버 메소드
        return 3.14*radius*radius;    
    }

    public static void main(String[] args) {
        Ex4_1 pizza; // 객체에 대한 레퍼런스 변수 pizza 선언
        pizza = new Ex4_1(); // Ex4_1 객체 생성
        pizza.radius = 10; // 피자의 반지름을 10으로 설정
        pizza.name = "자바피자"; // 피자의 이름 설정
        double area = pizza.getArea(); // 피자 면적 알아내기
        System.out.println(pizza.name + "의 면적은 " + area);

        Ex4_1 donut = new Ex4_1(); // Ex4_1 객체 생성
        donut.radius = 2; // 도넛의 반지름을 2로 설정
        donut.name = "자바도넛"; // 도넛의 이름 설정
        area = donut.getArea(); // 도넛의 면적 알아내기
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
```
#### 결과
```bash
자바피자의 면적은 314.0
자바도넛의 면적은 12.56
```

### Ex4_6_CircleArray.java
```bash
class Circle {
    int radius;     

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() { 
        return 3.14*radius*radius;    
    }
}

public class Ex4_6_CircleArray {
    public static void main(String[] args) {
        Circle [] c; // Circle 배열에 대한 레퍼런스 c 선언
        c = new Circle[5]; // 5개의 레퍼런스 배열 생성

        for (int i = 0; i < c.length; i++) // 배열의 개수 만큼
            c[i] = new Circle(i); // i 번째 원소 객체 생성

        for (int i = 0; i < c.length; i++) // 배열의 모든 Circle 객체의 면적 출력
            System.out.println((int) (c[i].getArea()) + " ");
    }
}
```

#### 결과 
```bash
0
3
12
28
50
```


---
---

## 6주차 2026/04/08
## 배열의 크기, length필드
- 자바의 배열은 객체로 처리
- 배열의 크기는 배열 객체의 length 필드에 저장
```bash
int intArray[];
intArray = new int[5];

int size = intArray.length;
// size는 5
```

---

## 배열과 for-each 문
- for-each문 : 배열이나 나열의 원소를 순차 접근하는데 유용한 for문
```bash
for(변수(1) : 배열레퍼런스){
    ...반복작업문...
}
```
- 예시
```bash
int [] n = { 1, 2, 3, 4, 5 };
int sum = 0;
for (int k : n) {
    sum += k;   // 반복될 때마다 k는 n[0], ...., n[4]로 번갈아 설정
}
```

---

## 2차원 배열 선언
- 배열 선언

```bash
int intArray[][]; 또는 int[][] intArray
```

- 배열 생성
```bash
intArray = new int[2][5];  int intArray[] = new int[2][5]; // 배열 선언과 생성 동시
```

## 2차원 배열의 length 필드
- i.length  ->  2차원 배열의 행의 개수로, 2
- i[n].length  ->  n번째 행의 열의 개수
- i[1].length   ->  1번째 행의 열의 개수, 5

## 2차원 배열의 초기화
- 배열 선언과 동시에 초기화
```bash
int intArray[][] = { 0, 1, 2 },
                    { 3, 4, 5 },
                    { 6, 7, 8 }; // 3x3 배열 생성

char charArray[][] = { { 'a', 'b', 'c'}, {'d', 'e', 'f'} }; // 2x3 배열 생성

double doubleArray[][] = { { 0.01, 0.02}, {0.03, 0.04} }; // 2x2 배열 생성
```
---
## 메소드의 배열 리턴
- ``배열의 레퍼런스``만 리턴되며, 배열 전체가 리턴되는 것이 아님
- 메소드의 리턴 타입
    - 리턴하는 배열 타입과 리턴 받는 배열 타입 일치
    - 리턴 타입에 배열의 크기를 지정하지 않음

```bash
int[] makeArray() {
    int temp[] = new int[4];
    return temp;
}
```
---

## 자바의 예외 처리
- 예외(Exception) : 실행 중 오동작이나 결과에 악영향을 미치는 예상치 못한 상황 발생
    - 자바에서는 실행 중 발생하는 에러를 ``예외``로 처리
- 실행 중 예외 발생 : 자바 플랫폼은 응용프로그램이 예외를 처리하도록 호출
    - 응용프로그램이 예외를 처리하지 않으면 프로그램 ``강제 종료 시킴``

- 예외 발생 경우
    - 정수를 ``0``으로 나누는 경우
    - 배열의 크기보다 ``큰 인덱스``로 배열의 원소를 접근하는 경우
    - 정수를 읽는 코드가 실행되고 있을 때 사용자가 ``문자``를 입력한 경우

---

## try-catch-finally문
- 예외 처리 : 발생한 예외에 대해 개발자가 작성한 프로그램 코드에서 대응하는 것
- finally 블록은 생략 가능
```bash
try {
    예외가 발생할 가능성이 있는 실행문(try 블록)
}
catch (처리할 예외 타입 선언) {
    예외 처리문(catch 블록)
}
finally {  // 생략 가능
    예외 발생 여부와 상관없이 무조건 실행되는 문장(finally 블록)
}
```

## 자바의 예외 클래스
| 예외 타입(예외 클래스) |                예외 발생 경우                |         패키지        |
| :------------------- |  ---------------------------------------- | :--------------------|
| ArithmeticExcpetion | 정수를 0으로 나눌 때 발생                      | java.lang            |
| NullPointException | null 레퍼런스를 참조할 때 발생                   | java.lang           |
| ClassCastException | 변환할 수 없는 타입으로 객체를 변환할 때 발생       | java.lang            |
| OutOfMemoryError   | 메모리가 부족한 경우 발생                       | java.lang              |
| ArrayIndexOutOfBoundsException | 배열의 범위를 벗어난 접근 시 발생    | java.lang              |
| IllegalArgumentException        | 잘못된 인자 전달 시 발생             | java.lang           |
| IOException           | 입출력 동작 실패 또는 인터럽트 시 발생           | java.lang            |
| NumberFormatException | 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환 시 발생 | java.lang |
| InputMismatchException | Scanner 클래스의 nextInt()를 호출하여 정수로 입력받고자 하였지만, 사용자가 'a' 등과 같이 문자를 입력한 경우 | java.lang |

---

## 객체
- TV, 컴퓨터, 책, 건물, 의자 등 실세계는 객체들의 집합
- 다른 객체들과 정보를 주고 받는 등, 상호작용하며 살아감

## 자바의 객체 지향 특성 : 캡슐화
- 캡슐화 : 객체를 캡슐로 싸서 내부를 볼 수 없게 하는 것
- 객체의 가장 본질적인 특징
- 외부의 접근으로부터 객체 보호
- 클래스(class) : 객체 모양을 선언한 틀(캡슐화하는 틀)
- 객체 : 생성된 실체(instance) : 클래스 내에 메소드와 필드 구현

---

## 자바의 객체 지향 특성 : 상속
- 상위 객체의 속성이 하위 객체에 물려 줌
- 하위 객체가 상위 객체의 속성을 모두 가지는 관계

## 자바의 상속
- 상위 클래스의 멤버를 하위 클래스가 물려받음
- 상위 클래스 : 수퍼 클래스
- 하위 클래스 : 서브 클래스, 수퍼 클래스 코드의 재사용, 새로운 특성 추가 가능

---

## 자바의 객체 지향 특성 : 다형성
- 같은 이름의 메소드가 클래스 혹은 객체에 따라 다르게 구현되는 것
- 메소드 오버로딩 : ``한 클래스`` 내에서 같은 이름이지만 ``다르게 작동``하는 여러 메소드
- 메소드 오버로딩 : 슈퍼 클래스의 메소드를 ``동일한 이름``으로 ``서브 클래스``마다 다르게 구현

---

## 객체 지향 언어의 목적
1. 소프트웨어의 생산성 향상
- 컴퓨터 산업 발전에 따라 소프트웨어의 생명 주기(life cycle) 단축
- 소프트웨어를 빠른 속도로 생산할 필요성 증대
- 객체 지향 언어
    - 상속, 다형성, 객체, 캡슐화 등 소프트웨어 재사용을 위한 여러 장치 내장
    - 소프트웨어 재사용과 부분 수정 빠름
    - 소프트웨어를 다시 만드는 부담 대폭 줄임
    - 소프트웨어 생산성 향상
2. 실세계에 대한 쉬운 모델링
- 초기 프로그래밍
    - 수학 계산/통계 처리를 하는 등 처리 과정, 계산 절차 중요
- 현대 프로그래밍
    - 컴퓨터가 산업 전반에 활용
    - 실세계에서 발생하는 일을 프로그래밍
    - 실세계에서는 절차나 과정보다 물체(객체)들의 상호 작용으로 묘사하는 것이 용이
- 객체 지향 언어
    - 실세계의 일을 보다 쉽게 프로그래밍하기 위한 객체 중심적 언어

---

## 클래스와 객체
- 클래스 : 객체의 속성(state)과 행위(behavior) 선언. 객체의 설계도 혹은 틀
    - class 키워드로 선언
    - 멤버 : 클래스 구성 요소. 필드(멤버 변수)와 메소드(멤버 함수)
    - 클래스에 대한 public 접근 지정 : 다른 모든 클래스에서 클래스 사용 허락
    - 멤버에 대한 public 접근 지정 : 다른 모든 클래스에게 멤버 접근 허용
- 객체 : 클래스의 틀로 찍어낸 실체
    - 프로그램 실행 중에 생성되는 실체
    - 메모리 공간을 갖는 구체적인 실체
    - 인스턴트(instance)라고도 부름

---
### 코드
### Ex3_12.java
```bash
import java.util.Scanner;
public class Ex3_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend; // 나뉨수
        int divisor; // 나눗수

        System.out.print("나뉨수를 입력하시오:");
        dividend = scanner.nextInt(); // 나뉨수 입력
        System.out.print("나눗수를 입력하시오:");
        divisor = scanner.nextInt(); // 나눗수 입력
        System.out.println(dividend+"를 " + divisor + "로 나누면 몫은 "
            + dividend/divisor + "입니다. "); // 0으로 나누면 에러 발생
    }    
}
```

#### 결과
```bash
나뉨수를 입력하시오:30
나눗수를 입력하시오:0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Ex3_12.main(Ex3_12.java:12)
```
---

### Ex3_13.java
```bash
import java.util.Scanner;
public class Ex3_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend; // 나뉨수
        int divisor; // 나눗수

        System.out.print("나뉨수를 입력하시오:");
        dividend = scanner.nextInt(); // 나뉨수 입력
        System.out.print("나눗수를 입력하시오:");
        divisor = scanner.nextInt(); // 나눗수 입력
        try {
        System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 "
            + dividend/divisor + "입니다. ");
        }
        catch(ArithmeticException e) { // 정수를 0으로 나눌 때 발생하는 예외 처리 코드
            System.out.println("0으로 나눌 수 없습니다!");
        }
        finally {
            scanner.close(); // 정상적이든 예외가 발생하든 최종적으로 scanner를 닫음
        }
    }    
}
```

#### 결과
```bash
나뉨수를 입력하시오:30
나눗수를 입력하시오:0
0으로 나눌 수 없습니다!
```

---

### Ex3_14.java
```bash
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex3_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요");
        int sum=0, n=0;
        for(int i=0; i<3; i++) {
            System.out.print(i+">>");
            try {
                n = scanner.nextInt(); // 정수 입력
            }
        catch(InputMismatchException e) {
            System.out.println("정수가 아닙니다.다시 입력하세요!");
            scanner.next();
            i--;
            continue;
        }
        sum += n;
        }
        System.out.println("합은 " + sum);
        scanner.close();
    }
}
```

#### 결과
```bash
정수 3개를 입력하세요
0>>246
1>>25
2>>31
합은 302
```

---
---

## 5주차 2026/04/01
## 조건 연산
- 3개의 피연산자로 구성
- 삼항 연산자
- opr1 ? opr2: opr3 -> opr1이 결과가 true 이면 opr2, false 면 opr3

```bash
int x=5, y=3;
int big = (x>y)?x:y // x 가 y 보다 크기 때문에 x 값 5가 big 에 대입
```

---

## 비트 연산
- 하드웨어 프로그래밍 뿐만 아니라 일반 소프트웨어 개발에서도 여러 가지 용도로 사용됨
- 성능이 중요한 경우나 최적화가 필요한 경우에 많이 활용됨
1. 성능 최정화 및 연산 속도 향상 : 곱셈(*)과 나눗셈(/)보다 비트 연산(<<, >>)이 훨씬 빠름
```bash
int x = 5;
int result = x << 1;     // 5 * 2 = 10
System.out.println(result);    // 10
```

2. 권한 및 플래그 설정(비트 마스크) : 여러개의 상태(flag)를 하나의 int 변수에 저장할 때 사용
```bash
class Permissions {
    static final int READ = 1;     // 0001
    static final int WRITE = 2;    // 0010
    static final int EXEC = 4;     // 0100
}
```

```bash
int userPermissions = Permissions.READ | Permissions.WRITE;     // 0011 (3)

// 특정 권한 확인
boolean canWrite = (userPermissions & Permissions.WRITE) ! = 0;
System.out.println("Can Write: " + canWrite); // true
```
---

## 조건문
## 단순 if 문
- if의 괄호 안에 조건식(논리형 변수나 논리 연산)
- 실행문장이 단일 문장인 경우 둘러싸는 {,} 생략 가능
```bash
if(조건식) {
    ...실행 문장... // 조건식이 참인 경우
}
```

## if-else문
- 조건식이 true면 실행문장1, false이면 실행문장 2 실행
```bash
if(조건식) {
    ...실행 문장1... // 조건식이 참인 경우
}
else {
    ...실행 문장2... // 조건식이 거짓인 경우
}
```

## 다중 if-else문
- 조건문이 너무 많은 경우, swich 문 사용 권장
```bash
if(조건식 1) {
    실행 문장  1; // 조건식 1이 참인 경우
}
else if(조건식 2) {
    실행 문장 2; // 조건식 2가 참인 경우
}
else if(조건식 m) {
    .............. // 조건식 m이 참인 경우
}
else {
    실행 문장 n; // 앞의 모든 조건이 거짓인 경우
}
```

---

## switch문
- Switch문의 식과 case 문의 값과 비교
- case의 비교 값과 일치하면 해당 case의 실행문장 수행
- break를 만나면 switch문을 벗어남
- case의 비교 값과 일치하는 것이 없으면 default 문 실행
- default문은 생략 가능
```bash
switch(식) {
    case 값1: // 식의 결과가 값1과 같을 때
        실행 문장1;
        break;
    case 값2: // 식의 결과가 값2와 같을 때
        실행 문장2;
        break;
    ...
    case 값m:
        실행 문장 m; // 식의 결과가 값m과 같을 때
        break;
    default:  // 어느 것과도 같지 않을 때
        실행 문장 n;
}
```
## switch문에서 break문의 역할
- break문을 만나면 switch문 벗어남
- case 문에 break문이 없다면, 다음 ``case문`` 계속 실행
- 언젠가 ``break를 만날 때까지`` 계속 내려 가면서 실행

## case문의 값
- ``문자, 정수, 문자열 리터럴``(JDK 1.7부터)만 허용
- 실수 리터럴은 허용되지 않음

---

## 반복문
## for문
- for문이 반복되는 동안 매번 실행
- 작업문이 하나의 문장인 경우 ``중괄호({})``가 필요 없음
- 초기문에서는 대개 for 문의 조건식에서 사용하는 변수를 ``초기화``함
- 초기문에는 지역 변수를 선언하고 바로 사용 가능
```bash
for(초기문(1번); 조건식(2번); 반복 후 작업(4번)){
    ..작업문(3번)..
}
```

## while문
- true인 경우 반복이 계속되며, false인 경우 while문을 벗어남
- for문과 달리 조건식이 없으면 컴파일 오류가 발생
```bash
while(조건식(1번)) {
    ..작업문(2번)..
}
```

## do-while문
- 조건식은 while문과 동일하며 조건식이 없으면 컴파일 오류 발생
- 작업문 실행 후 반복 조건을 따지므로, 작업문이 ``최초 한번``은 반드시 ``실행``
```bash
do {
    ..작업문(1번)..
} while(조건식(2번));
```

## 중첩 반복
- 반복문이 다른 반복문을 내포하는 구조
- 몇 번이고 중첩이 가능하나 너무 많은 중첩 반복은 프로그램 구조를 복잡하게 하므로 2중 또는 3중 반복 정도가 적당

---

## continue문
- 반복문을 빠져 나가지 않고, 다음 반복으로 제어 변경
- 반복문에서 continue; 문에 의한 분기

## break문
- 반복문 하나를 ``즉시`` 벗어날 때 사용. 하나의 반복문만 벗어남
- 중첩 반복의 경우 안쪽 반복문의 break문이 실행되면 안쪽 반복문만 벗어남

---

## 자바 배열(array)
- 인덱스와 인덱스에 대응하는 데이터들로 이루어진 자료 구조로 ``한번에 많은 메모리 공간`` 선언
- 같은 타입의 데이터들이 순차적으로 저장되는 공간으로 ``인덱스``를 이용하여 원소 데이터 접근
- 반복문을 이용하여 처리하기에 적합한 자료
- 배열 인덱스 : ``0부터`` 시작

## 배열 선언 및 생성
1. 배열에 대한 래퍼런스 변수 선언
```bash
int intArray [];    // 배열 타입(int), 배열에 대한 레퍼런스 변수(intArray), 배열 선언([])
```
2. 배열 생성 - 배열 공간 할당
```bash
intArray = new int [5];   // 배열에 대한 레퍼런스 변수(intArray), 배열 생성(new int), 원소 개수([5])
```

## 배열 선언 및 생성 디테일
- 배열은 선언과 생성의 두 단계 필요: ``선언과 동시``에 생성할 수 있음
- 배열 선언 : 배열의 이름 선언(배열 래퍼런스 변수 선언)
- int intArray []; 또는 int[] intArray;     int intArray [5]; // 크기 지정하면 오류 발생
- 배열 생성 : 배열 공간 ``할당`` 받는 과정
- intArray = new int[5]; 또는 int intArray[] = new int[5]; // 선언과 동시에 배열 생성
- 배열 초기화 : 배열 생성과 값 ``초기화``
- int intArray[] = {4, 3, 2, 1, 0}; //  5개의 정수 배열 생성 및 값 초기화
- double doubleArray[] = {0.01, 0.02, 0.03, 0.04}; // 5개의 실수 배열 생성 및 값 초기화

## 배열 인덱스와 배열 원소 접근
- 배열의 인덱스는 0부터, 크기 1부터
```bash
int intArray = new int[5]; // 인덱스는 0~4까지 가능
intArray[0] = 5;           // 원소 0에 5 저장
intArray[3] = 6;           // 원소 3에 6 저장
int n = intArray[3];       // 원소 3의 값을 읽어 n에 저장
```
- 인덱스를 잘못 사용한 경우
```bash
int n = intArray[-2];      // 인덱스로 음수 사용 불가
int m = intArray[5];       // 5는 인덱스의 범위(0~4) 넘었음
```
- 반드시 배열 생성 후 접근
```bash
int intArray [];           // 레퍼런스만 선언 함
intArray[1] = 8;           // 오류. 배열이 생성되어 있지 않음

int intArray[] = new int[5];
```
## 레퍼런스 치환과 배열 공유
- 자바에서는 배열 공간과 레퍼런스 변수가 분리되어 있어 생성된 배열에 대한 공유가 쉽게 이루어짐
- 생성된 배열을 다수의 레퍼런스가 참조할 수 있음
```bash
int intArray[] = new int[5];
int myArray[] = intArray; // 레퍼런스 치환. myArray는 intArray와 동일한 배열 참조
```
- 배열을 복사하여 새로운 배열을 만들어 myArray배열을 생성하는 것이 아닌, 레퍼런스만 복사 됨
- myArray로 intArray의 배열 원소를 마음대로 접근할 수 있음

---

## 코드
### Ex02_9.java
```bash
public class Ex02_9 {
    public static void main(String[] args) {
        int a = 3, b =5;

        System.out.println("두 수의 차는 " + ((a>b)?(a-b):(b-a))); // a>b가 false 이므로 b-a 의 값 2가 나옴
    }
}
```
#### 결과
```bash
두 수의 차는 2
```

---

### Ex2_14.java
```bash
import java.util.Scanner;
public class Ex2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("월(1~12)을 입력하시오:");
        int month = scanner.nextInt();
        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("봄입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("가을입니다.");
                break;
            case 12: case 1: case 2:
                System.out.println("겨울입니다."); break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
        scanner.close();
    }
}
```
#### 결과
```bash
월(1~12)을 입력하시오:3
봄입니다.
```

---

### Ex3_1.java
```bash
public class Ex3_1 {
    public static void main(String[] args) {
        int i, sum=0;
        for(i=1; i<=10; i++) {
            sum += 1;
            System.out.print(i);
            if(i<=9)
                System.out.print("+");
            else {
                System.out.print("=");
                System.out.print(sum);
            }
        }
    }
}
```
#### 결과
```bash
1+2+3+4+5+6+7+8+9+10=10
```

---

### Ex3_4_1.java
```bash
public class Ex3_4_1 {
    public static void main(String[] args) {
        for(int i=2; i<10; i++) {
            System.out.println("[" + i + "단]");
            for(int j=1; j<10; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
            }
            System.out.println();
        }
    }
}
```
#### 결과
```bash
[2단]
2*1=2
2*2=4
2*3=6
2*4=8
2*5=10
2*6=12
2*7=14
2*8=16
2*9=18

[3단]
3*1=3
3*2=6
3*3=9
3*4=12
3*5=15
3*6=18
3*7=21
3*8=24
3*9=27

... 생략

[9단]
9*1=9
9*2=18
9*3=27
9*4=36
9*5=45
9*6=54
9*7=63
9*8=72
9*9=81
```
---

### Ex3_4_2.java
```bash
public class Ex3_4_2 {
    public static void main(String[] args) {
        System.out.println("[ 2단 ]\t[ 3단 ]\t[ 4단 ]\t[ 5단 ]\t[ 6단 ]\t[ 7단 ]\t[ 8단 ]\t[ 9단 ]");
        for(int j=1; j<10; j++) {
            for(int i=2; i<10; i++) {
                System.out.print(i + "X" + j + "=" + (i*j));    // i가 1씩 먼저 늘고 계산 다 되면 j 하나 늘기
                System.out.print('\t');
            }
            System.out.println();
            
        }
    }
}
```
#### 결과
```bash
[ 2단 ] [ 3단 ] [ 4단 ] [ 5단 ] [ 6단 ] [ 7단 ] [ 8단 ] [ 9단 ]
2X1=2   3X1=3   4X1=4   5X1=5   6X1=6   7X1=7   8X1=8   9X1=9
2X2=4   3X2=6   4X2=8   5X2=10  6X2=12  7X2=14  8X2=16  9X2=18
2X3=6   3X3=9   4X3=12  5X3=15  6X3=18  7X3=21  8X3=24  9X3=27
2X4=8   3X4=12  4X4=16  5X4=20  6X4=24  7X4=28  8X4=32  9X4=36
2X5=10  3X5=15  4X5=20  5X5=25  6X5=30  7X5=35  8X5=40  9X5=45
2X6=12  3X6=18  4X6=24  5X6=30  6X6=36  7X6=42  8X6=48  9X6=54
2X7=14  3X7=21  4X7=28  5X7=35  6X7=42  7X7=49  8X7=56  9X7=63
2X8=16  3X8=24  4X8=32  5X8=40  6X8=48  7X8=56  8X8=64  9X8=72
2X9=18  3X9=27  4X9=36  5X9=45  6X9=54  7X9=63  8X9=72  9X9=81
```

---

### Ex3_4.java
```bash
public class Ex3_4 {
    public static void main(String[] args) {
        for(int i=1; i<10; i++){
            for(int j=1; j<10; j++){
                System.out.print(i + "*" + j + "=" + i*j);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
```

#### 결과
```bash
2*1=2   2*2=4   2*3=6   2*4=8   2*5=10  2*6=12  2*7=14  2*8=16  2*9=18
3*1=3   3*2=6   3*3=9   3*4=12  3*5=15  3*6=18  3*7=21  3*8=24  3*9=27
4*1=4   4*2=8   4*3=12  4*4=16  4*5=20  4*6=24  4*7=28  4*8=32  4*9=36
5*1=5   5*2=10  5*3=15  5*4=20  5*5=25  5*6=30  5*7=35  5*8=40  5*9=45
6*1=6   6*2=12  6*3=18  6*4=24  6*5=30  6*6=36  6*7=42  6*8=48  6*9=54
7*1=7   7*2=14  7*3=21  7*4=28  7*5=35  7*6=42  7*7=49  7*8=56  7*9=63
8*1=8   8*2=16  8*3=24  8*4=32  8*5=40  8*6=48  8*7=56  8*8=64  8*9=72
9*1=9   9*2=18  9*3=27  9*4=36  9*5=45  9*6=54  9*7=63  9*8=72  9*9=81
```

---

### Ex3_5.java
```bash
import java.util.Scanner;
public class Ex3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 5개 입력하세요.");
        int sum=0;
        for(int i=0; i<5; i++) {
            int n=scanner.nextInt();
            if(n<=0) continue;
            else sum += n;

        }
        System.out.println("양수의 합은 " + sum);

        scanner.close();
    }
}
```

#### 결과
```bash
정수를 5개 입력하세요.
2 3 4 5 6
양수의 합은 20
```

---

### Ex3_7.java
```bash
import java.util.Scanner;
public class Ex3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intArray[];
        intArray = new int[5];
        int max=0;
        System.out.println("양수 5개를 입력하세요.");
        for(int i=0; i < 5; i++) {
            intArray[i] = scanner.nextInt();
            if(intArray[i] > max) {
                max = intArray[i];
            }

        }
    System.out.print("가장 큰 수는 " + max + "입니다.");

    scanner.close();
    }
}
```

#### 결과
```bash
양수 5개를 입력하세요.
2 6 4 7 8
가장 큰 수는 8입니다.
```

---

### Ex3_10.java
```bash
import java.util.Scanner;
public class Ex3_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요(0~100):");
        int score = scanner.nextInt();
        System.out.print("학년을 입력하세요(1~4):");
        int year = scanner.nextInt();

        if(score >= 60) {
            if(year != 4)
                System.out.println("합격!");
            else if(score >= 70)
                System.out.println("합격!");
            else
                System.out.println("불합격!");
        }
        else
            System.out.println("불합격!");

        scanner.close();
    }
}
```
#### 결과
```bash
점수를 입력하세요(0~100):69
학년을 입력하세요(1~4):3
합격!
```

---
---


## 4주차 2026/03/25
## 자바의 특징

### 8. 가비지 컬렉션
- 자바 언어는 메모리를 할당받는 기능은 있지만, 메모리를 반환하는 기능은 없음
- 프로그램 내에 사용되지 않는 메모리는 자바 가상 기계의 가비지 컬렉션 기능에 의해 자동으로 회수됨

### 9. 실시간 응용 시스템에 부적함
- 자바 응용프로그램은 실행 도중 예측할 수 없는 시점에 가비지 컬렉션이 실행되므로, 프로그램 실행이 일시적으로 중단됨

### 10. 자바 프로그램은 안전
- 자바 언어는 타입 체크가 매우 엄격
- C/C++와 달리 메모리의 물리적 주소를 사용하는 포인터의 개념이 없음
- 잘못된 자바 프로그램으로 인해 컴퓨터 시스템이 중단되는 일이 없음

### 11. 프로그램 작성이 쉬움
- 포인터 개념이 없음
- 동적 메모리 반환 하지 않음
- 다양한 라이브러리 지원

### 12. 실행 속도 개선을 위한 JIT 컴파일러 사용
- 자바는 바이트 코드를 인터프리터 방식으로 실행
- 기계어가 실행되는 것보다 느림
- JIT 컴파일 기법으로 실행 속도 개선
- JIT 컴파일이란 실행 중에 바이트 코드를 기계어 코드로 컴파일하여 기계어를 실행하는 기법

---

## 소스 코드, 바이트 코드, 기계어

### 소스 코드
- 우리가 작성하는 JAVA 코드 (.java 파일)
- 사람이 읽을 수 있는 고수준 언어 (High-Levlel Language)

### 바이트 코드
- Java 컴파일러(javac)가 소스코드를 변환한 중간 코드
- CPU가 직접 실행할 수 없음, JVM(Java Virtual Machine)이 실행해야 함
- 기계어와 다르게 플랫폼 독립적(Windows, Mac, Linux에서 동일하게 실행 가능)
- 바이트코드는 JVM이 해석하거나, JIT 컴파일러가 기계어로 변환 실행됨

### 기계어
- CPU가 직접 실행할 수 있는 0과 1의 이진 코드
- 운영체제와 CPU 아키텍처에 따라 다름
- 16진수 형태의 기계어

### 바이트 코드와 기계어의 차이점
- 바이트 코드는 JVM이 실행하는 중간 코드, 운영체제와 CPU에 관계없이 사용 가능
- 기계어는 CPU가 직접 실행하는 코드, 특정 하드웨어에 종속됨

---

### Temurin OpenJDK 24에서 jmods 디렉토리가 사라진 이유
- Temurin OpenJDK 24부터는 JEP 439 표준을 따르게 되어 jmods 디렉토리가 포함되지 않음
- JMOD 파일을 사용하지 않고도 사용자 지정 run-time 이미지를 생성할 수 있어 JDK크기를 약 25% 줄임
- JDK 빌드할 때 활성화해야 하며, 기본적으로 비활성화, 일부 JDK 공급업체는 이 기능을 활성화하지 않을 수도 있음
- 그러나 Temurin OpenJDK 24는 빌드할 때 기본 자동으로 활성화 됨

---

### 식별자
- 특수문자(%, *, &, @, ^ 등), 공백(탭, space 등) 은 식별자로 사용 불가
- 예외('_', '$')
- 한글을 사용할 수 있음
- if, while, class 등 자바 언어의 키워드는 사용 불가
- 식별자의 첫 번째 문자로 숫자 사용 불가
- true, false, null은 사용 불가
- 대소문자를 구별함
- 길이 제한이 없음

---

### 자바의 데이터 타입 8개
| 종류 |     크기      |                   설명                      |
| :------ |  --------- | :----------------------------------------|
| **boolean** | 1비트 | true, 또는 false, 논리 타입|
| **char** | 2바이트 | unicode, 문자 타입 |
| **byte** | 1바이트 | -128 ~ 127, 정수 타입|
| **short** | 2바이트 | -32768 ~ 32767, 정수 타입 |
| **int** | 4바이트 | -2**31 ~ 2**31 - 1, 정수 타입 |
| **long** | 8바이트 | -2**63 ~ 2**63 -1, 정수 타입 |
| **float** | 4바이트 | -3.4E38 ~ 3.4E38 |
| **double** | 8바이트 | -1.7E308 ~ 1.72308 |

- 기본 타입의 크기는 CPU나 운영체제에 따라 변하지 않음

---

### 참조 자료형 (Reference Type)
- 레퍼런스형 1개 용도는 클래스, 인터페이스, 배열 : 포인터와 유사한 개념이지만 메모지 주소는 아님
- 포인터는 임의의 메모리 주소를 저장
- 참조 자료형은 주소를 저장할 수 없음
- 객체를 참조하는 변수 유형, 힙(Heap) 영역에 저장된 객체의 메모리 주소를 가리킴
- **new** 키워드로 객체를 생성
- JVM이 객체의 주소를 저장
- 배열(Array), 인터페이스(Interface) 혹은 열거형(Enum)도 객체
- 객체를 참조하지 않을 때 null 값을 가질 수 있음
- 같은 객체를 여러 변수가 참조 할 수 있음
- 연산자로 객체의 주소 비교도 가능

---

### 메모리의 구조
- 힙 (heap - FIFO) 영역은 프로그래머가 직접 공간을 할당, 해제하는 메모리 공간(Java 의 경우 JVM이 담당)
- 스택 (stack - LIFO) 영역은 프로그램이 자동으로 사용하는 임시 메모리 영역
- 오버 플로우란 힙이 스택을 침범하는 경우
- 스택 오버 플로우란 스택이 힙을 침범하는 경우

---

### 상수
- final 키워드를 사용
- 선언할 때 초기값 지정
- 실행 중 **값의 변경은 불가능**
- 예시 final double PI = 3.141592;
- final: 상수 선언, double = 데이터 타입, PI = 상수 이름, 3.141592 = 초기화

---

### 변수
- 프로그램 실행 중에 값을 임시로 저장하기 위한 메모리의 공간
- 프로그램 **수행 중 변경될 수 있음**
- 변수 선언: 데이터 타입에서 정한 크기의 메모리를 할당
- 예시: int price;
- int = 데이터 타입, price = 변수 이름 

---

### var 키워드
- 자바 10부터 도입됨
- 타입을 생략하고 변수 선언 가능
- 컴파일러가 추론하여 변수 타입을 결정
- 변수 선언할 때 **초기값**이 주지 않으면 컴파일 오류 발생
- 지역 변수 선언에만 사용 가능, 클래스 필드에서는 사용 불가
- 지역변수: 메소드 내부에 선언되는 변수
- 클래스 필드: 클래수 내부에 선언되는 변수, 객체가 생성될 때 함께 만들어지는 변수
- 예시: var Foo; **(오류)**
- 예시: var Foo = 100; (O)

---

### System.out.print의 종류
### System.out.print()
- 줄 바꿈 하지 않고 한 줄로 출력
- 줄 바꿈 하려면 \n (new line)를 넣어야 함

### System.out.println()
- 줄 바꿈을 실행
- 개행 문자 없이 자동으로 줄 바꿈이 됨

### System.out.printf()
- 형식을 지정하여 문자열을 출력할 때 사용
- 값을 특정한 형식(소수점 자리 수, 정렬 등)으로 출력할 때 유용

| 종류 |     타입      |                   설명                      |
| :------ |  --------- | :----------------------------------------|
| %d | 정수 | System.out.printf("%d", 10); -> 10 |
| %f | 실수 | System.out.printf("%.2f", 3.1415); -> 3.14 |
| %s | 문자열 | System.out.printf("%s", "Hello"); -> Hello |
| %c | 문자 | System.out.printf("%c", 'A'); -> A |
| %b | 불리언 | System.out.printf("%b", true); -> true |

---

### 타입 변환
### 자동 타입 변환 
- 컴파일러에 의해 원래의 타입보다 큰 타입으로 자동 변환
- 치환문(=)이나 수식 내에서 타입이 일치하지 않을 때

```bash
long m = 25; // 25는 int 타입 25가 long 타입으로 자동 변환
double d = 3.14 * 10; // 실수 연산을 하기 위해 10이 10.0 으로 자동 변환
```

### 강제 타입 변환
- 개발자의 의도적 타입 변환
- ( ) 안에 개발자가 명시적으로 타입 변환 지정
- 강제 변환은 값 손실 우려
```bash
int n = 300;
byte b = n;  // 컴파일 오류. int 타입은 byte 타입으로 자동 변환 안됨
```
- Int -> byte 같은 큰 타입에서 작은 타입으로 바꾸면 오류 발생 

---

### System.in vs Scanner
### System.in
- 키보드와 연결된 자바의 표준 입력 스트림
- 입력되는 키를 바이트(문자 x)로 리턴하는 저수준 스트림
- System.in을 직접 사용하면 바이트를 문자나 숫자로 변환하는 어려움이 있음

### Scanner 클래스
- 읽은 바이트를 문자, 정수, 실수, 불린, 문자열 등 다양한 타입으로 변환하여 리턴 ( java.util.Scanner )
- 객체를 생성해서 사용
- 키보드에 연결된  System.in에게 키를 읽게 하고, 원하는 타입으로 변환하여 리턴
- 입력되는 키 값을 공백으로 구분되는 토큰 단위로 읽음
- 공백 문자 : '\t', ' \r', '\n', ' ', ' \f' (페이지 나누기, 폼 피드, 프린트에서 사용)

---

### 산술 연산자
| **연산의 종류** |      **내용**      |
| :------ | :------------- |
| 증감 | + + - - |
| 산술 | + - * / % |
| 시프트 | >> << >>> |
| 비교 | >  <  >= <= == != |
| 비트 | & ㅣ ^ ~ |
| 논리 | && ㅣㅣ  ! ^ |
| 조건 | ? : |
| 대입 | = *= /= += -= &= ^= ㅣ= <<= >>= >>>= |

### 증감 연산자 
| **연산의 종류** |      **내용**      |
| :------ | :------------- |
| a++ | a를 1 증가하고 증가 전의 값 반환 |
| a-- | a를 1 감소하고 감소 전의 값 반환 |
| ++a | a를 1 증가하고 증가된 값 반환 |
| --a | a를 1 감소하고 감소된 값 반환 |

### 대입 연산자
| **연산의 종류** |      **내용**      |
| :------ | :------------- |
| a = b | b의 값을 a에 대입 |
| a += b | a = a + b와 동일 |
| a-= b | a = a - b와 동일 |
| a *= b | a = a * b와 동일 |
| a /= b | a = a / b와 동일 |
| a %= b | a = a % b와 동일|
| a & = b | a = a & b와 동일 |
| a ^=b | a = a ^ b와 동일 |
| a ㅣ = b | a = a ㅣ b와 동일 |
| a <<= b | a = a <<b와 동일 |
| a >>=b | a = a >> b와 동일 |
| a >>>=b | a = a >>> b와 동일 |

### 비교 연산자
| **연산의 종류** |      **내용**      |
| :------ | :------------- |
| a < b | a가 b보다 작으면 true |
| a > b | a가 b보다 크면 true |
| a <= b | a가 b보다 작거나 같으면 true |
| a >= b | a가 b보다 크거나 같으면 true |
| a == b | a가 b와 같으면 true |
| a != b | a가 b와 같지 않으면 true |

### 논리 연산자
| **연산의 종류** |      **내용**      |
| :------ | :------------- |
| ! a | a가 true 이면 false, false이면 true |
| a ^ b | a와 b의 XOR연산, a, b가 같으면 false |
| a ㅣㅣ b | a와 b의 OR 연산, a와 b 모두 false인 경우만 false |
| a && b | a와 b의 AND 연산, a와 b 모두 true인 경우만 true |

---

### 코드
### Foo.java

```bash
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

```

#### 결과
```
?
Hello
30
```

---

### Bar.java
```bash
// 예제 2-3 : Bar.java는 상수를 사용하여 원의 면적을 계산하는 예제 

public class Bar {
    public static void main(String[] args) {
        final double PI = 3.14;  // 원주율을 상수로 선언
        double radius = 10.2;    // 원의 반지름
        double circleArea = radius*radius*PI;  // 원의 면적 계산

        // 원의 면적을 화면에 출력한다.
        System.out.print("반지름 " + radius + ", ");
        System.out.println("원의 면적");
        System.out.println("원의 면적 =" + circleArea);
    }
}
```
#### 실행
```
반지름 10.2, 원의 면적
원의 면적 =326.68559999999997
```

---

### Hun.java
```bash
// 예제 2-4 : 타입 변환

public class Hun {
    public static void main(String[] args) {
        byte b = 127;
        int i = 100;
        System.out.println(b+i);    // b 가 int 타입으로 자동 변환
        System.out.println(10/4);
        System.out.println(10.0/4); // 4가 4.0으로 자동 변환
        System.out.println((char)0x12340041); 
        System.out.println((byte)(b+i));
        System.out.println((int)2.9 +1.8);
        System.out.println((int)(2.9 + 1.8));
        System.out.println((int)2.9 + (int)1.8);
    }
}
```
#### 실행
```bash
227
2
2.5
A
-29
3.8
4
3
```

---

### Boo.java
```bash
// 예제 2-5 : Scanner를 이용한 키 연습

import java.util.Scanner;       // import로 불러오기

public class Boo {
    public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");

        Scanner scanner = new Scanner(System.in);    // 객체 생성할 때 new 키워드로, 객체는 소문자, 클래스는 대문자 시작
        String name = scanner.next(); // 문자열 토큰 읽기
        System.out.println("당신의 이름은 " + name + "입니다.");
        String city = scanner.next(); // 문자열 토큰 읽기
        System.out.println("당신이 사는 도시는 " + city + "입니다.");
        int age = scanner.nextInt(); // 정수 토큰 읽기
        System.out.println("당신의 나이는 " + age + "살입니다.");
        double weight = scanner.nextDouble(); // 실수 토큰 읽기
        System.out.println("당신의 체중은 " + weight + "kg입니다.");
        boolean single = scanner.nextBoolean(); // 논리 토큰 읽기
        System.out.println("당신은 독신 여부는 " + single + "입니다.");

        scanner.close(); // scanner 스트림 닫기


    }
    
}
```

#### 실행
```bash
이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.
hun seoul 23 68.5 false
당신의 이름은 hun입니다.       
당신이 사는 도시는 seoul입니다.
당신의 나이는 23살입니다.      
당신의 체중은 68.5kg입니다.
당신은 독신 여부는 false입니다.
```

---
---

## 3주차 2026/03/18
## Java Project 생성

### 프로그래밍 언어
- 컴퓨터가 실행할 프로그램을 작성하기 위한 언어
- 컴퓨터의 CPU는 이진수인 **0과 1**밖에 이해하지 못하며 이진수 명령어들로 구성된 언어를 **기계어** 라고 함
- 고급 언어는 크게 **절차 지향 언어**와 **객체 지향 언어**로 나눌 수 있으며 자바는 **객체 지향 언어**

---

### 절차 지향 언어
- 프로그램을 함수들의 흐름(순서)으로 구성
- 데이터와 함수가 분리되어 있음
- 위에서 아래로 흐르는 구조 (Top-down 방식)

### 특징
- 처리 과정이 명확해서 간단한 프로그램에 적합
- 코드 재사용성과 유지보수는 상대적으로 어려움
- 전역 변수 사용이 많아지기 쉬움
- 예시 언어: C, Pascal

### 객체 지향 언어
- 프로그램을 객체들의 상호작용으로 구성
- 데이터와 기능(메서드)을 하나로 묶음
- 현실 세계를 모델링하기 쉬움

### 특징
- 캡슐화, 상속, 다형성 같은 개념 사용
- 코드 재사용성과 확장성이 뛰어남
- 유지보수가 상대적으로 쉬움
- 예시 언어: **Java**, Python, C++

---

### 컴파일
- 컴퓨터는 c/c++나 자바와 같은 고급 언어로 작성된 소스 프로그램을 바로 이해할 수 없음
- 소스 프로그램을 기계어로 변환하는 **컴파일**과정이 필요함
- 이 소프트웨어를 컴파일러 라고 하며 각 언어마다 고유한 전용 컴파일러가 있음
- 자바의 경우 **.java**, 자바 프로그램의 경우 컴파일된 파일의 확장자는 **.class**

---

### 플랫폼 종속성
- c/c++ 등 자바 이전 프로그래밍 언어로 작성된 프로그램이 컴파일되면 실행될 컴퓨터 플랫폼, 즉 CPU와 운영체제에 종속된 기계어 코드로 변환됨
- 그러므로 c/c++ 프로그램은 실행하고자 하는 각 플랫폼을 대상으로 소스 코드를 수정하거나, 각 플랫폼에서 따로 컴파일하여 플랫폼에 맞는 기계어 프로그램을 생성하여야 함
- 자바 언어는 플랫폼에 독립적으로 설계됨, 그러므로 자바 가상 기계만 있으면 어떤 컴퓨터에서든 동일하게 실행됨 이를 **WORA** 라고 함

---

### 자바와 타 언어의 실행 차이
- c/c++는 컴파일한 목적 파일을 링크시켜 하나의 실행 파일을 만들며, 이 실행 파일 하나만 있으면 실행이 가능함
- 그리고 이 실행 파일은 컴퓨터의 CPU가 바로 실행함
- 그러나 자바의 경우 링크 과정이 없으며 자바 가상 기계가 컴파일된 **클래스 파일**을 실행함
- 자바는 컴파일된 클래스 파일들이나 이들을 하나로 압축한 jar 파일 형태로 배포함

---

### JDK와 JRE
- JDK는 자바 개발자를 위한 상업용 소프트웨어, 자바 컴파일러 등의 개발도구와 JRE로 구성됨
- JRE는 자바 응용프로그램이 실행될 때 필요한 소프트웨어들로 개발자가 활용할 수 있는 자바 API와 자바 가상 기계를 포함함

---

### bin 디렉터리
| 종류 |                    설명                      |
| :------ | :----------------------------------------|
| **javac** | 자바 컴파일러로 자바 소스를 바이트 코드로 변환 |
| **java** | 자바 프로그램 실행기, 자바 가상 기계를 작동시켜 자바 프로그램 실행|
| **javadoc** | 자바 소스로부터 **HTML** 형식의 **API** 도큐먼트 생성 |
| **jar** | 자바 클래스 파일을 압축한 자바 아카이브 파일 **(.jar)** 생성, 관리 |
| **jmod** | 자바의 모듈파일 **(.jmod)**을 만들거나 모듈 파일의 내용 출력 |
| **jlink** | 응용프로그램에 맞춘 맞춤형 **(custom)** JRE 생성 |
| **jdb** | 자바 응용프로그램의 실행 중 오류를 찾는 데 사용하는 디버거 |
| **javap** | 클래스 파일의 바이트 코드를 소스와 함께 보여주는 디어셈블러 |

---

## 자바 API
- 개발자들이 사용하도록 미리 만들어놓은 유용한 자바 클래스들의 집합
- 자바 API는 워낙 광법위하여, 개발자는 이 API를 이용하여 쉽고 빠르게 자바 프로그램을 개발할 수 있음

## 자바의 특징
### 1. 플랫폼 독립성
- 하드웨어, 운영체제 등 플랫폼에 종속되지 않는 독립적인 바이트 코드로 컴파일
- 자바 가상 기계만 있으면 하드웨어/운영체제를 막론하고 자바 프로그램의 실행이 가능

### 2. 객체 지향
- 캡슐화, 상속, 다형성 등을 지원함
- 해결할 과제를 실제 세상의 객체와 객체 간의 상호 관계로 모델링하여 인간의 사고에 가깝게 표현

### 3. 클래스로 캡슐화
- 객체 지향 언어의 캡슐화 원칙을 철저히 지켜, 변수나 메소드는 반드시 클래스 내에 구현하도록 함
- 클래스에 속하지 않은 변수나 메소드는 있을 수 없음
- 클래스 안에 새로운 클래스, 즉 **내부 클래스**를 만들 수 있음

### 4. 소스와 클래스 파일
- 자바 소스가 컴파일된 클래스 파일(.class)에는 반드시 하나의 자바 클래스만이 들어있음
- 하나의 자바 소스 파일에 여러 개의 클래스를 작성한 경우, 컴파일하면 클래스마다 별도의 클래스 파일이 생성됨

### 5. 실행 코드 배포
- 자바 응용프로그램은 한 개의 클래스 파일 또는 다수의 클래스 파일로 구성
- 다수의 클래스 파일을 jar 파일 형태로 압축하여 배포 및 실행이 가능
- 자바의 실행은 main() 메소드에서 시작됨
- 하나의 클래스 파일에 두 개 이상의 main() 메소드가 있을 수 없음
- 그러나 각 클래스 파일이 main() 메소드를 가지는 것은 상관없음

### 6. 패키지
- 서로 관련 있는 클래스는 패키지로 묶어 관리함
- 패키지는 파일 시스템의 폴더 개념과 같음

### 7. 멀티스레드
- 하나의 자바 프로그램에서 다수의 스레드가 동시에 실행할 수 있는 환경을 지원
- 운영체제의 도움 없이 멀티스레드 프로그래밍이 가능
- 멀티스레드를 지원하지 않는 운영체제에서도 자바를 이용하면 멀티스레드 프로그램 개발 가능


---
---


## 2주차 2026/03/11
## Github 용어

## Repository
- 파일을 저장하는 공간
- 프로젝트 관리

## Branch 
- 독립적인 작업 공간

---

## 처음 설정
## git init 
- git 초기화
- 현재 폴더를 Git 프로젝트로 만들기

## git add 특정 파일
- 특정 파일을 Git이 추적하도록 추가(스테이징)

## git add .
- 현재 폴더의 모든 파일을 Git에 추가

## 둘의 차이
- git add 특정 파일 **(특정 파일에만 추가)**
- git add . **(모든 파일에 추가)**

---

## 첫 커밋 만들기
## git commit -m "first commit"
- 현재 상태를 첫 저장

---

## git clone 깃주소
- 원격 저장소 복제

---

## Main branch 설정
## git branch -M main
- 기본 브랜치를 main 으로 변경

---

## 이름, 이메일 설정
## git config --global user.name "이름"
- 처음 git을 사용할 때 이름 설정
- 만약 프로젝트마다 다른 이름으로 하고싶다면 --global 빼기

## git config --global user.email "이메일"
- 처음 git을 사용할 때 이메일 설정
- 만약 프로젝트마다 다른 이메일로 하고싶다면 --global 빼기

---

## Github 저장소 연결
## git remote add origin 깃주소
- 원격 저장소 연결

## Github로 업로드
## git push -u origin main(브랜치 이름)

---

## 코드 수정 후 업로드 정리

```bash
git add .
git commit -m "수정 이유"
git push
```

- 직접 수정 이유를 적고 커밋 버튼을 누르고 업로드도 가능

---

## Github 깔끔하게 하는 법
## # 글씨
- '#' 개수가 많아질 수록 글씨 크기가 작아짐

## * 글씨 *
- 기울어진 글씨

## ** 글씨 **
- 글씨 굵게 만들기

## *** 글씨 ***
- 글씨 굵고 기울게 만들기

## - 내용
- 작은 원 리스트

## ---  
- 구분선
- 내용 구분할 때 씀

##  ` 
- 코드처럼 보이게 강조

## ```
- 여러 줄 코드
- 예시

```bash
git add .
git commit -m "수정 이유"
git push
```
---
---