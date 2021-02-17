import java.util.Scanner;
public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 0;
        if (operation.equals("sum"))
            result = a + b;
        else if(operation.equals("sub"))
            result = a - b;
        System.out.println("Result: " + result);
    }
}