import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    //Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,6,7,8,9};
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < array.length; i++){
            list.add(array[i]);
        }
        for (Integer item: list) {
            System.out.print(item+" ");
        }
        LinkedList<Integer> list2 = flipList(list);

        System.out.println();

        for (Integer item: list2) {
            System.out.print(item+" ");
        }


    }

    private static LinkedList flipList(LinkedList<Integer> list) {
        int temp;
        int steps = list.size()/2;
        LinkedList listOut= new LinkedList<>(list);
        for(int i = 0, j= listOut.size()-1; i <= steps; i++,j--){
            temp = (int) listOut.get(j);
            listOut.set(j,listOut.get(i));
            listOut.set(i,temp);
        }
        return listOut;
    }
}
