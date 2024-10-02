import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age =-1;

        while (age < 0) {
            System.out.print("나이를 입력하세요 (0 이상의 값): ");
            age = sc.nextInt();

            if (age < 0) {
                System.out.println("0 이상의 값을 입력해 주세요.");
            }
        }

        System.out.println("입력한 나이: " + age);

    }
}
