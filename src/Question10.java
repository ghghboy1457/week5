import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("숫자를 입력하세요: ");
            int n = sc.nextInt();
            sum += n;

            if (sum >= 100) {
                System.out.println("합이 100 이상입니다. 합: " + sum);
                break; // 합이 100 이상일 때 종료
            }
        }
    }
}
