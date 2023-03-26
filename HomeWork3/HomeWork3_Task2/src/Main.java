import java.util.ArrayList;
import java.util.List;

public class Main {
    //Пусть дан произвольный список целых чисел, удалить из него чётные числа
    public static void main(String[] args) {
        int [] arr = {1,4,7,4,9,6,7,4,6,8,3,5,3,9,6};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        for (Integer item: list) {
            System.out.print(item+" ");
        }

        list = removingEvenNumbers(list);

        System.out.println();
        for (Integer item: list) {
            System.out.print(item+" ");
        }


    }

    private static ArrayList removingEvenNumbers(List list) {
        int temp;
        ArrayList<Integer> listOut = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            temp = (int) list.get(i);
            if (temp % 2 != 0) {
                listOut.add((Integer) list.get(i));

            }
        }
        return listOut;
    }



}
