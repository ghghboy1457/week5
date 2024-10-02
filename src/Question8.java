public class Question8 {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        while (num2 <= 100){
            num1 += num2;
            num2 +=2;
        }

            System.out.println("1부터 100 까지의 홀수 합의 출력:" + num1);
    }
}
