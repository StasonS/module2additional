import java.util.Scanner;

/**
 * Created by user on 29.06.17.
 */
public class BiggestOfFourNumbers {

    public static void main(String[] args) {
        System.out.println("Введите 4 числа:");
        int[] i = fourNumbers();
        System.out.println("Наибольшее число: " + biggest(i));
    }

    public static int input(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        return i;
    }

    public static int[] fourNumbers(){
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++){
            arr[i] = input();
        }
        return arr;
    }

    public static int biggest(int[] ints){
        int a = ints[0];
        for (int i : ints){
            if (i > a){
                a = i;
            }
        }
        return a;
    }
}
