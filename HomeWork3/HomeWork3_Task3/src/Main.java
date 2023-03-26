import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        int range = 100;
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <size; i ++) {
            list.add((Integer)random.nextInt(range));
        }
        for (Integer item:list) {
            System.out.print(item+" ");

        }
        System.out.println();



        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.print(list.stream().mapToInt(a -> a).average().orElse(0));
    }
}
