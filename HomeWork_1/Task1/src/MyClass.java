import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        System.out.print("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int factorialNumber = FactorialNumber(inputNumber);
        System.out.println(factorialNumber);

    }
    public static int FactorialNumber(int x)
    {
        int outNumber = 1;
        if (x==0)
        {
            return 1;
        }
        if (x == 1) {
            return 1;
        }
        outNumber  = x*FactorialNumber((x-1));
        return outNumber;

    }

}

