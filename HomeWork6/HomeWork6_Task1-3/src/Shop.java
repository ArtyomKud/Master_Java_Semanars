import java.util.*;


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
        Integer temp2 = 0;
        System.out.println("Укажите минимальный объем оперативной памяти: ");
        try {
            temp2 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            temp2 = -1;
        }
        sortingCriteria.put("ram",temp2);
        System.out.println("Укажите минимальный объем жесткого диска: ");
        try {
            temp2 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            temp2 = -1;
        }
        sortingCriteria.put("hardDiskCapacity",temp2);
        System.out.println("Укажите операционную систему: ");
        temp = scanner.nextLine();
        if(temp.equals("")){
            sortingCriteria.put("operatingSystem","non");

        }
        else {
            sortingCriteria.put("operatingSystem",temp.toLowerCase());
        }
        System.out.println("Укажите цвет: ");
        temp=scanner.nextLine();
        if(temp.equals("")){
            sortingCriteria.put("color","non");

        }
        else {
            sortingCriteria.put("color",temp.toLowerCase());
        }

        System.out.println("Укажите минимальную стоимость: ");
        try {
            temp2 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            temp2 = -1;
        }
        sortingCriteria.put("price",temp2);
    }


    public void filterDevaced() {
        filter.filtering( laptopList, sortingCriteria);

    }


}
