import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList();
        System.out.println("Введите числа");
        List = EnterNumbers();
        EvenNumbersJob(List);

    }
    public static ArrayList<Integer> EnterNumbers(){

        ArrayList<Integer> List = new ArrayList();
        while(true){
            int number = CheckNumber();
            if (number == 0 )
                return List;
            List.add(number);

        }

    }
    public static int CheckNumber(){
        Scanner num = new Scanner(System.in);
        while (true) {
            if (num.hasNextInt()) {
                int x = num.nextInt();
                return x;
            } else {
                System.out.print("Ввели не число, введите снова ");
                num.nextLine();
            }
        }
    }
    public static void EvenNumbersJob(ArrayList<Integer>List){
        int sum =0;
        for (int i =0;i < List.size();i++){

            if (List.get(i) % 2 == 0){
                 sum = sum + List.get(i) * List.get(i);
            }
        }
        System.out.println("Сумма= " + sum);
    }
}