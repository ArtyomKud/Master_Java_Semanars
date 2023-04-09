import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TelephoneDirectory {

    private HashMap<String, ArrayList<String>> telephoneDirectory = new HashMap<>();


    /** Добавить абонента*/
    public void addSubscriber (String name, String phoneNumber ){
        if (!telephoneDirectory.containsKey(name)) {
            telephoneDirectory.put(name, new ArrayList<String>());
            telephoneDirectory.get(name).add(phoneNumber);
            System.out.println("Абонент добавлен");
        }
        else {
            System.out.println("Абонент с таким именем уже существует");
        }
    }

    /** Удалить абонента*/
    public void removeSubscriber (String name){
        if (telephoneDirectory.containsKey(name)) {
            telephoneDirectory.remove(name);
            System.out.println("Абонент удален");
        }
        else {
            System.out.println("Абонент с таким именем не найден");
        }
    }


    /** Добавить абоненту номер*/
    public void addNumberToTheSubscriber (String name, String phoneNumber){
        if (telephoneDirectory.containsKey(name)){
            if(!telephoneDirectory.get(name).contains(phoneNumber)){
                telephoneDirectory.get(name).add(phoneNumber);
                System.out.println("Номер добавлен абоненту");
            }
            else {
                System.out.println("Такой номер уже существует у данного абонента");
            }

        }
        else {
            System.out.println("Абонент не найден");
        }
    }

    /** Удалить у  абонента номер*/
    public void deleteNumberFromSubscriber (String name, String phoneNumber){
        if (telephoneDirectory.containsKey(name)){
            if(telephoneDirectory.get(name).contains(phoneNumber)){
                telephoneDirectory.get(name).remove(phoneNumber);
                System.out.println("Номер удален");
            }
            else {
                System.out.println("Такой номер не существует у данного абонента");
            }

        }
        else {
            System.out.println("Абонент не найден");
        }
    }

    /** Распечатать список абонентов*/
    public void prinTheListOfSubscribers(){
        for(Object item: telephoneDirectory.entrySet()) {
            System.out.println(item);

        }
    }

    /** Распечатать информацию об абоненте*/
    public void printSubscriberInformation(String name){
        if (telephoneDirectory.containsKey(name)){
            System.out.println(name+telephoneDirectory.get(name));
            }

        else {
            System.out.println("Абонент не найден");
        }
    }



}
