import java.util.ArrayList;
import java.util.Arrays;

public class Calculate {
    private String [] array2 = new String[] {"*", "/", "+", "-"};
    private ArrayList<String> operations = new ArrayList<String>(Arrays.asList(array2));

    public int CalculateOperations (int number1, String operation, int number2)
    {
        if (operations.contains(operation)) {

            if(operation.equals("*")){
                return number1 * number2;
            }
            if(operation.equals("/")){
                return number1 / number2;
            }
            if(operation.equals("+")){
                return number1 + number2;
            }
            if(operation.equals("-")){
                return number1 - number2;
            }



        }
        return 0;


    }

}
