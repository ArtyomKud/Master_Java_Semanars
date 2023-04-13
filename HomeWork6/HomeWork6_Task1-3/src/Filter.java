import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
    public void filtering(List<Laptop> list, HashMap criteria){
        criteria.remove("operatingSystem","non");
         List <Laptop> criterian = list.stream().filter(
                        x -> x.getRam()>=Integer.parseInt((String) criteria.get("ram"))&&
                                x.getHardDiskCapacity()>=Integer.parseInt((String) criteria.get("hardDiskCapacity"))&&
                        x.getPrice()>=Integer.parseInt((String) criteria.get("price"))&&
                                x.getOperatingSystem().equals(criteria.get("operatingSystem"))
                                ).collect(Collectors.toList());
        for (Laptop s:criterian) {
            System.out.println(s.toString());

        }






        }

    }

