import java.util.ArrayList;
import java.util.Arrays;

public class Calculate {
    private String [] array2 = new String[] {"*", "/", "+", "-"};
    private ArrayList<String> operations = new ArrayList<String>(Arrays.asList(array2));

    public int CalculateOperations (int number1, String operation, int number2)
    {
        if (operations.contains(operation)) {

            switch (operation) {
                case "*":
                    return number1 * number2;
                case "/":
                    if (number2 == 0) {
                        return 0;
                    }
                    return number1 / number2;
                case "+":
                    return number1 + number2;
                case "-":
                    return number1 - number2;
            }
        }
        return 0;

    }

}
