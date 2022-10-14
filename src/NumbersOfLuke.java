import java.util.Scanner;

/**клас NumbersOfLuke із полями значеня {@link NumbersOfLuke#size} кількість елементів та {@link NumbersOfLuke#numbers} масив чисел
 * @author Дикун Яна*/
public class NumbersOfLuke {
    /** Кількість елементів в масиві Люка*/
    private int size;
    /** масив чисел люка*/
    private long[] numbers;


    /**
     * Конструктор з параметром
     * @param N - розмір масиву*/
    public NumbersOfLuke(int N)
    {
        this.size=N;
    }

    /** конструктор класу*/
    public NumbersOfLuke()
    {
        Set();
    }

    /**Ввід з клавіатури розміру масиву*/
    public void Set()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Введіть розмір ");
        int N= s.nextInt();
        if(N < 0)
        {
            System.out.print("Невірно введені дані");
            System.exit(1);
        }
        this.size=N;
    }

    /** метод заповнення масиву класу
     * Функція не повертає значення*/
    public void LukeNumsArray() {
        long[] LukeNums = new long[this.size];
        LukeNums[0] = 2;
        LukeNums[1] = 1;

        for (int i = 2; i < this.size; i++) {
            LukeNums[i] = LukeNums[i - 1] + LukeNums[i - 2];
        }
        numbers = LukeNums;
    }

    /**Метод визначення які серед чисел Люка можна задати у формі w^2+1
     * Функція не повертає значення*/
    public void IsTheSqare(){
        for (int i = 0; i < this.size; i++) {
            long num = numbers[i]-1;
            if((Math.sqrt(num) % 1) == 0)
                System.out.println("Число на один більше ніж певний квадрат " + numbers[i]);
        }
    }

    public void EvenAndOddNumbers ()
    {
        int m=0, n=0;
        for (int i = 0; i < this.size; i++) {
            long num = numbers[i];
            if (num % 2 == 0)
                m++;
            else
                n++;
    }
        System.out.println("Кількість парних чисел " + m);
        System.out.println("Кількість непарних чисел " + n);
    }
}
