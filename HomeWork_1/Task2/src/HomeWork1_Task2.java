
//Вывести все простые числа от 1 до 1000
public class HomeWork1_Task2 {
    public static void main(String[] args) {
        PrimeNumber();

    }
    static void PrimeNumber ()
    {
        System.out.print(2 + " ");

        for(int i = 3; i<1001; i++)
        {
            Boolean flag = true;
            for(int j = 2; j<i; j++)
            {
                if (i%j==0)
                {
                    flag = false;
                }
            }
            if (flag)
            {
                System.out.print(i+" ");
            }

        }
    }
}
