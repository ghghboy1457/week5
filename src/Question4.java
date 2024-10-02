public class Question4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i==50) {
                System.out.println("숫자 50을 찾았습니다");
                break;
            }
            System.out.println("멈춘 숫자:"+i);
        }
    }
}
