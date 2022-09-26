
import java.util.Scanner;

public class Main {
private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount();
           while(true){
               commands();
               switch (button().trim()) {
                   case "1" -> bankAccount.deposit(in.nextDouble());
                   case "2" -> System.out.println(bankAccount.getAmount());
                   case "3" -> bankAccount.withDraw(in.nextInt());
                   default -> System.out.println("Мындай кнопка жок!");
               }
           }
        }
    static void commands(){
        System.out.println("При вводе числа 1 вы можете положить на счет максимально 60000 сом.");
        System.out.println("При вводе числа 2 можете увидеть остаток на счете.");
        System.out.println("При вводе числа 3 можете снять максимально 55000 сом.");
    }
    static String button(){
        System.out.println("Выберите команду: \n");
         return in.nextLine();
    }
}