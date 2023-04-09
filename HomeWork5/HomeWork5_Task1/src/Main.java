import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.addSubscriber("Вася","+79237105685");
        telephoneDirectory.addSubscriber("Петя","+79237605685");
        telephoneDirectory.addNumberToTheSubscriber("Петя","+78905678943");
        telephoneDirectory.printSubscriberInformation("Петя");



    }
}
