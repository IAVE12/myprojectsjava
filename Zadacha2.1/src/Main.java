import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Введите два набора целых чисел");
        System.out.println("Введите 1");
        int []numbers1 = EnterNumbers(n);
        System.out.println("Введите 2");
        int []numbers2 = EnterNumbers(n);
        FindSameNumbers(numbers1, numbers2);

    }
    public static int[] EnterNumbers(int N){
        int []numbers = new int[N];
        for(int i = 0;i < N;i++){
            numbers[i]=CheckNumber();
        }
        return numbers;

    }
    public static int CheckNumber(){
        Scanner number = new Scanner(System.in);
        while (true) {
            if (number.hasNextInt()){
                int x = number.nextInt();
                return x;
            }
            else{
                System.out.print("Ввели не число, попробуйте снова");
                number.nextLine();
            }
        }
    }
    public static void FindSameNumbers(int[] Numbers1, int[]Numbers2){
        int count = 0,c = 0, ind = 0,x = 0;
        ArrayList<Integer> newSameList1 = new ArrayList<>(5);
        for(int i = 0;i < Numbers1.length;i++){
            for (int j = i;j < Numbers2.length;j ++){
                if(Numbers1[i] == Numbers2[j]){
                    x = Numbers1[i];
                    if(newSameList1.contains(x)){
                    }
                    else {
                        newSameList1.add(x);
                    }
                }
            }
        }
        System.out.print("Получили:");
        for(int i = 0; i <newSameList1.size();i++ ) {
            System.out.print(newSameList1.get(i));
        }
    }
}