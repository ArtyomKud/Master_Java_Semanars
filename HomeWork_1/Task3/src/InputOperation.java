import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InputOperation {

    private String operation;
    private String [] array = new String[] {"*-умножить", "/-разделить", "+-сложить", "--вычесть", "s-стереть", "q-выход","p-вывести результат"};
    private String [] array2 = new String[] {"*", "/", "+", "-", "s", "q","p"};
    private ArrayList<String> operations = new ArrayList<String>(Arrays.asList(array2));
    private Boolean flag = true;
    private Scanner scanner = new Scanner(System.in);

    public String InputUserOperation ()
    {
        while (flag) {
            System.out.println("Введите операцию");
            for (String item : array) {
                System.out.print(item+" ");
            }
            operation = scanner.nextLine();
            if (operations.contains(operation)) {
                flag = false;
            }
            else {
                System.out.println("Введена неизвестная команда, повторите попытку");
            }
        }
        flag = true;
        return operation;


    }

}
