import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.*;
import java.io.IOException;

public class Task3 {
    static {System.setProperty("java.util.logging.SimpleFormatter.format",
            "%1$tF %1$tT [%4$-7s] %3$s - %5$s %n");}
    static java.util.logging.Logger log = java.util.logging.Logger.getLogger(Task3.class.getName());

    public static void main(String[] args) {

        try {
            Handler faleHandler = new FileHandler("logging.log", 100* 1024, 3, true);
            faleHandler.setFormatter(new SimpleFormatter());
            log.addHandler(faleHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }

        InputNumber number = new InputNumber();
        Calculate calculate = new Calculate();
        InputOperation inputOperation = new InputOperation();
        Boolean flag = true;
        int tempNumber = number.InputUserNumber();
        log.setLevel(Level.INFO);
        log.info(String.valueOf(tempNumber));
        int tempNumber2 = 0;
        int result = 0;
        String operation;


        while (flag) {

            while (flag) {
                operation = inputOperation.InputUserOperation();
                log.setLevel(Level.INFO);
                log.info(String.valueOf(operation));
                if (operation.equals("-") | operation.equals("+") | operation.equals("*") | operation.equals("/")) {

                    tempNumber2 = number.InputUserNumber();
                    log.setLevel(Level.INFO);
                    log.info(String.valueOf(tempNumber2));
                    if (tempNumber2 == 0 & operation.equals("/")) {
                        System.out.println("На ноль делить нельзя!!!");
                        log.setLevel(Level.INFO);
                        log.info(String.valueOf("На ноль делить нельзя!!!"));
                        break;
                    }
                    result = calculate.CalculateOperations(tempNumber, operation, tempNumber2);
                    log.setLevel(Level.INFO);
                    log.info(String.valueOf("Результат = "+result));

                } else if (operation.equals("s")) {
                    tempNumber = number.InputUserNumber();
                    tempNumber2 = 0;
                    result = 0;
                    log.setLevel(Level.INFO);
                    log.info(String.valueOf("Стерли"));
                } else if (operation.equals("q")) {
                    flag=false;
                    log.setLevel(Level.INFO);
                    log.info(String.valueOf("Выход"));
                    break;
                } else if (operation.equals("p")) {
                    log.setLevel(Level.INFO);
                    log.info(String.valueOf("Вывод результата"+result));
                    System.out.println(result);
                }

            }
        }

    }
}
