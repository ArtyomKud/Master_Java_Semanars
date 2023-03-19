import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        InputNumber number = new InputNumber();
        Calculate calculate = new Calculate();
        InputOperation inputOperation = new InputOperation();
        Boolean flag = true;
        int tempNumber = number.InputUserNumber();
        int tempNumber2 = 0;
        int result = 0;
        String operation;


        while (flag) {

            while (flag) {
                operation = inputOperation.InputUserOperation();
                if (operation.equals("-") | operation.equals("+") | operation.equals("*") | operation.equals("/")) {

                    tempNumber2 = number.InputUserNumber();
                    if (tempNumber2 == 0 & operation.equals("/")) {
                        System.out.println("На ноль делить нельзя!!!");
                        break;
                    }
                    result = calculate.CalculateOperations(tempNumber, operation, tempNumber2);

                } else if (operation.equals("s")) {
                    tempNumber = number.InputUserNumber();
                    tempNumber2 = 0;
                    result = 0;
                } else if (operation.equals("q")) {
                    flag=false;
                    break;
                } else if (operation.equals("p")) {
                    System.out.println(result);
                }

            }
        }

    }
}
