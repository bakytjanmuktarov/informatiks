import java.util.Scanner;

public class afirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double z = scanner.nextDouble();
        double b = scanner.nextDouble();

        double c = Math.sqrt(z * z + b * b);

        System.out.println(c);
    }
}