public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int num = 1; num <= 6; num++) {
            sum += num;
            System.out.println("Num is " + num + ", sum is " + sum);
        }
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + sum);
    }
}
