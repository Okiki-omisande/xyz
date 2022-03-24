public class bankaccount
{
private String name;
private double balance;
private double withdrawal;

    public bankaccount(String name, double balance, double withdrawal)
    {
        this.name = name;

        if (balance > 0.0)
            this.balance = balance;

        if (withdrawal <= balance)
            this.withdrawal = withdrawal;

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
