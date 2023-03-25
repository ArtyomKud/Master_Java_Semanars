import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numberOfElements =10;
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
            numberOfSortedItems++;
        }

    }
}
