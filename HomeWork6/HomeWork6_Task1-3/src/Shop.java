import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Shop {

    private List<Laptop> laptopList = new ArrayList<Laptop>();
    private HashMap<String,Object> sortingCriteria = new HashMap<String,Object>();
    private Scanner scanner = new Scanner(System.in);
    Filter filter = new Filter();

    public Shop(){
        sortingCriteria.put("ram",0);
      sortingCriteria.put( "hardDiskCapacity",0);
        sortingCriteria.put("operatingSystem","non");
         sortingCriteria.put("color","non");
         sortingCriteria.put("price",0);
    }


    public void putLaptop (Laptop laptop){
        laptopList.add(laptop);
    }
    public void deleteLaptop (Laptop laptop){
        laptopList.remove(laptop);
    }

    public void setFilterCriteria() {
        String temp = "";
        System.out.println("Укажите минимальный объем оперативной памяти: ");
        sortingCriteria.put("ram",scanner.nextLine());
        System.out.println("Укажите минимальный объем жесткого диска: ");
        sortingCriteria.put("hardDiskCapacity",scanner.nextLine());
        System.out.println("Укажите операционную систему: ");
        temp = scanner.nextLine();
        if(temp.equals("/")){
            sortingCriteria.put("operatingSystem","non");

        }
        else {
            sortingCriteria.put("operatingSystem",temp);
        }
        System.out.println("Укажите цвет: ");
        temp = scanner.nextLine();
        if(!temp.equals("")){
            sortingCriteria.put("color","non");

        }
        else {
            sortingCriteria.put("color",temp);
        }

        System.out.println("Укажите минимальную стоимость: ");
        sortingCriteria.put("price",scanner.nextLine());
        System.out.println(sortingCriteria.toString());
    }


    public void filterDevaced() {
        filter.filtering( laptopList, sortingCriteria);

    }


}
