import java.util.InputMismatchException;
import java.util.Scanner;

 class InputNumber {
    private Boolean flag = true;
    private Scanner scanner = new Scanner(System.in);
    private int inputNumber;

    public int  InputUserNumber() {
        go:
        while (flag) {
            System.out.print("Введите число:");
            try {
                inputNumber = scanner.nextInt();
            } catch (InputMismatchException exp) {
                String i = scanner.nextLine();
                System.out.println("Введено неверное число");
                continue go;

            }
            flag = false;
        }
        flag = true;
        return inputNumber;
    }
}
