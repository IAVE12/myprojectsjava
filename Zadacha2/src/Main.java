import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.print("Введите число а");
        int firstNumber = enterNumber();
        System.out.print("Введите число b");
        int secondNumber = enterNumber();
        if(secondNumber > firstNumber) {
            int swap = firstNumber;
            firstNumber = secondNumber;
            secondNumber = swap;
        }
        FindMaxNMin(firstNumber, secondNumber);


    }
    public static int enterNumber(){

        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNextInt()) {
                int a = sc.nextInt();
                return a;
            } else {
                System.out.print("Ввели не число, введите снова ");
                sc.nextLine();
            }
        }
    }
    public static void FindMaxNMin(int firstNumber, int secondNumber){
        Random random = new Random();
        int num1 = random.nextInt(firstNumber - secondNumber ) + secondNumber;
        int num2 = random.nextInt(firstNumber - secondNumber ) + secondNumber;
        int num3 = random.nextInt(firstNumber - secondNumber ) +secondNumber;
        int max = Math.max(Math.max(num1, num2),num3);
        int min = Math.min(Math.min(num1, num2),num3);

        System.out.print("max =");
        System.out.print(max);
        System.out.print("\nmin =");
        System.out.print(min);
    }
}