import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите сумму цифр, не меньше 1, не больше 27");
        int sum = enterNumber();
        FindNumbers(sum);

    }
    public static int enterNumber(){
        int x;
        Scanner num = new Scanner(System.in);
        while(true){
            if(num.hasNextInt()){
                x = num.nextInt();
                if(x>0 & x<28){
                    return x;
                }else {
                    System.out.println("Ввели число не из диапозона");
                    System.out.println("Введите сумму цифр, не меньше 1, не больше 27");
                    num.hasNextLine();
                }
            } else {
                System.out.println("Ввели не число");
                System.out.println("Введите сумму цифр, не меньше 1, не больше 27");
                num.nextLine();
            }

        }
    }
    public static void FindNumbers(int number){
        int sum = 0;
        for(int i = 100;i < 1000; i++){
            sum = i / 100 + i % 100 / 10 + i % 10;
            if (sum == number){
                System.out.println(i);
            }
        }
    }
}