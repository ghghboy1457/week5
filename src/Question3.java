import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("1 이상의 정수를 입력하세요: ");
            number = sc.nextInt();
        } while (number < 1);
        System.out.println("입력한 값:"+number);
    }
}
