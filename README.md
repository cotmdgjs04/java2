# JAVA2
# 202330231 채승헌

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