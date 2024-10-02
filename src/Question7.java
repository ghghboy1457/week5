import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("팩토리얼 계산할 숫자을 입력: ");
        num1 = sc.nextInt();

        long factorial = 1;

        for (num2=1; num2<=num1; num2++) {
            factorial *= num2;
        }
        System.out.println(num1+"의 팩토리얼은: "+factorial);
    }
}
