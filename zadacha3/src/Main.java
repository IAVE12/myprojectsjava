import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i =0;
        int end = 0;
        int even = 0;
        int []Numbers1 = EnterNumbers();
        FindSum(Numbers1);
    }
    public static int[] EnterNumbers(){
        int n = 0, i =0;
        System.out.print("Введите число N\n  ");
        n = EnterNumber();
        int Numbers[] = new int[n];
        for (i = 0;i < n;i++) {
            System.out.print("Введите число:\n");
            Numbers[i] = EnterNumber();
        }
        return Numbers;


    }
    public static void FindSum (int Numbers1[]){
        int sum = 0,i =0;
        for(i = 0;i < Numbers1.length ;i++){
            if (Numbers1[i] % 2 == 0){
                sum = sum + Numbers1[i];
            }
        }
        System.out.print(sum);
    }
    public static int EnterNumber(){
        Scanner chislo = new Scanner(System.in);
        while (true) {
            if (chislo.hasNextInt()) {
                int x = chislo.nextInt();
                if (x < 0) {
                    System.out.print("Ввели не натуральное число, введите снова ");
                    chislo.nextLine();
                }
                else{
                    return x;
                }
            } else {
                System.out.print("Ввели не число, попробуйте снова");
                chislo.nextLine();
            }
        }

    }

}