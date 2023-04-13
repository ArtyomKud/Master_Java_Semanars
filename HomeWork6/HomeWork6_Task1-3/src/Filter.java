import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
    public void filtering(List<Laptop> list, HashMap criteria){
         List <Laptop> criterian = list.stream().filter(
                        x -> x.getRam()>=(Integer)(criteria.get("ram"))&&
                                x.getHardDiskCapacity()>=(Integer)criteria.get("hardDiskCapacity")&&
                                x.getPrice()>=(Integer)criteria.get("price")&&
                                (criteria.get("operatingSystem").equals("non")||x.getOperatingSystem().equals(criteria.get("operatingSystem")))&&
                                (criteria.get("color").equals("non")||x.getColor().equals(criteria.get("color")))

                                ).collect(Collectors.toList());
        for (Laptop s:criterian) {
            System.out.println(s.toString());

        }






        }

    }

