import sun.misc.Launcher;

import java.io.IOException;
import java.rmi.Remote;
import java.util.Random;
import java.util.logging.*;

public class Main {
    static {System.setProperty("java.util.logging.SimpleFormatter.format",
            "%1$tF %1$tT [%4$-7s] %3$s - %5$s %n");}
    static java.util.logging.Logger log = java.util.logging.Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        try {
            Handler faleHandler = new FileHandler("logging.log", 100* 1024, 3, true);
            faleHandler.setFormatter(new SimpleFormatter());
            log.addHandler(faleHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }




        int numberOfElements =20;
        int rangeNumberArray = 20;
        int[] arrayIsNotSorted = new int[numberOfElements];
        int[] arrayIsSorted = new int[arrayIsNotSorted.length];
        randomFilling(arrayIsNotSorted, rangeNumberArray);
        sortingBubbleArray(arrayIsNotSorted, arrayIsSorted);
        for (int item: arrayIsNotSorted
        ) {
            System.out.print(item+ " ");

        }
        System.out.println();
        for (int item: arrayIsSorted
        ) {
            System.out.print(item+ " ");

        }

    }
    public static void randomFilling(int[] arrayInput, int range)
    {
        Random random = new Random();
        for(int i = 0; i < arrayInput.length; i++)
        {
            arrayInput[i] = random.nextInt(range);
        }
    }
    public static void sortingBubbleArray(int[] arrayOriginal, int[] arraySortable)
    {
        for(int i = 0; i < arrayOriginal.length; i++)
        {
            arraySortable[i] = arrayOriginal[i];
        }
        StringBuilder str = new StringBuilder();
        int temp;
        int numberOfSortedItems = 1;
        for(int i = 0; i < arraySortable.length; i++)
        {
            for(int j = 0; j < arraySortable.length-numberOfSortedItems; j++)
            {
                if(arraySortable[j]>arraySortable[j+1])
                {
                    temp = arraySortable[j+1];
                    arraySortable[j+1] = arraySortable[j];
                    arraySortable[j] = temp;
                }




            }
            for (int item: arraySortable
                 ) {
                str.append(item+" ");

            }
            log.setLevel(Level.INFO);
            log.info(String.valueOf(str));
            str.delete(0,str.length());
            numberOfSortedItems++;
        }

    }


}
