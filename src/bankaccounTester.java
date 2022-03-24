import java.util.Scanner;

public class bankaccounTester
{
    public static void main(String[] args)
    {
   //constructor
    bankaccount acct1 = new bankaccount("OKIKI", 10.00, 0.0);
    bankaccount acct2 = new bankaccount("TOPE", 20.00,0.0);

     //initial value
        System.out.printf("Initial details in acct1 is:%s %.2f%n", acct1.getName(),acct1.getBalance());
        System.out.printf("Initial details in acct2 is:%s %.2f%n%n", acct2.getName(),acct2.getBalance());

     //scanner declaration
        Scanner input = new Scanner(System.in);

     //user deposit input for acct1
        System.out.println("Please enter deposit amount:");
        double Deposit1 = input.nextDouble();
        acct1.Deposit(Deposit1);
        System.out.printf("%n adding %.2f to balance %n", Deposit1);
     //display balance
        System.out.printf("%n%s %.2f",acct1.getName(),acct1.getBalance());
        System.out.printf("%n%s %.2f%n%n",acct2.getName(),acct2.getBalance());

     //user deposit for acct2
        System.out.println("Please enter deposit amount:");
        double Deposit2 = input.nextDouble();
        acct2.Deposit(Deposit2);
        System.out.printf("%n adding %.2f to balance %n", Deposit2);

     //display balance
        System.out.printf("%n%s %.2f",acct1.getName(),acct1.getBalance());
        System.out.printf("%n%s %.2f%n%n",acct2.getName(),acct2.getBalance());

     //user withdrawal request for acct1
        System.out.println("Please enter withdrawal amount:");
        double withdrawal1 = input.nextDouble();
        acct1.setWithdrawal(withdrawal1);
        System.out.printf("%n withdrawing %.2f from balance %n", withdrawal1);

    //display balance
        System.out.printf("%n%s %.2f",acct1.getName(),acct1.getBalance());
        System.out.printf("%n%s %.2f",acct2.getName(),acct2.getBalance());

    //user withdrawal request for acct2
        System.out.println("Please enter withdrawal amount:");
        double withdrawal2 = input.nextDouble();
        acct2.setWithdrawal(withdrawal2);
        System.out.printf("%n withdrawing %.2f from account %n", withdrawal2);

    //display balance
        System.out.printf("%n%s %.2f",acct1.getName(),acct1.getBalance());
        System.out.printf("%n%s %.2f",acct2.getName(),acct2.getBalance());
    }



}
