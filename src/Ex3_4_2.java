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
