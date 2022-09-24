
import java.util.Scanner;
//testing
public class BankingApplication {
    public static void main(String[] args) {
        Bankaccount obj1 = new Bankaccount("sandeep", "015");
        obj1.showMenu();
        
    }
    
}
class Bankaccount{
    int balance;
    int previoustransition;
    String customerName;
    String customerId;

    Bankaccount(String cname , String cId){
        customerName = cname;
        customerId = cId;

    }

    void deposit(int amount){
        if(amount !=0){

            balance = balance+amount;
            previoustransition = amount;

        }
    }
    void withdraw(int amount){
        if(amount !=0){ 

        balance = balance - amount;
        previoustransition = - amount;
        
    }
      }

      void getprevioustransition(){
        if(previoustransition > 0){
            System.out.println("Deposited  :"+previoustransition);
        }
        else if(previoustransition < 0) {
            System.out.println("withdrawn :"+ Math.abs(previoustransition));

        }
        else{
            System.out.println("No transition occured");
        }
      }

      void showMenu(){
        char option ='\0';
        Scanner scanner = new Scanner(System.in);
System.out.println("Welcome" +customerName);
System.out.println("Your ID is:"+customerId);
System.out.println("\n");
System.out.println("A.CheckBlance");
System.out.println("B.Deposit");
System.out.println("C.withdraw");
System.out.println("D.Previoustransition");
System.out.println("E.Exit");

do{
    System.out.println("=============================================================");
    System.out.println("Enter an option");
    System.out.println("=============================================================");
    option = scanner.next().charAt(0);
    System.out.println("\n");

    switch(option){
        case'A':
        System.out.println("----------------------------");
        System.out.println("Balance ="+balance);
        System.out.println("----------------------------");
        System.out.println("\n");
        break;

        case 'B':

        System.out.println("---------------------------");
        System.out.println("Enter an amount to deposit");
        System.out.println("-----------------------------");
        int amount = scanner.nextInt();
        deposit(amount);
        System.out.println("\n");
        break;

        case 'C':

        System.out.println("--------------------------");
        System.out.println("Enter an amount to withdraw");
        System.out.println("----------------------------");
        int amount2 = scanner.nextInt();
        withdraw(amount2);
        System.out.println("\n");
        break;

        case 'D':
        System.out.println("--------------------------");
        getprevioustransition();
        System.out.println("-------------------------");
        System.out.println("\n");
        break;

        case 'E':
        System.out.println("*****************************************");
        break;

        default:
        System.out.println("Invalid option!! please try again");
        break;

    }
}while(option != 'E');
System.out.println("Thankyou for using our service");


      }
    
}
