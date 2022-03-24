//create a bank that allows user to deposit,withdraw and check balance

public class bankaccount
{
private String name;
private double balance;

    public bankaccount(String name, double balance, double withdrawal)
    {
        this.name = name;

        if (balance > 0.0)
            this.balance = balance;

        double withdrawal1;
        if (withdrawal <= balance)
            withdrawal1 = withdrawal;

    }

    public void Deposit(double DepositAmount)
    {
       if (DepositAmount > 0.0)
           balance = balance + DepositAmount;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWithdrawal(double withdrawal)
    {
        if (withdrawal <= balance)
            balance = balance - withdrawal;
    }
}
