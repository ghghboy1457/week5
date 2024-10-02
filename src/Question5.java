public class Question5 {
    public static void main(String[] args) {
        int num1;
        for (num1 = 1; num1 <= 10; num1++) {
            if (num1 % 2 == 1) {
                continue;
            }
            System.out.println("짝수만 출력:"+num1);
        }
    }
}
