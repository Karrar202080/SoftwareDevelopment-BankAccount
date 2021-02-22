package bank;

import java.util.ArrayList;

public class BankCustomer {
    ArrayList<BankAccount> accounts = new ArrayList();

    public enum AccountType{
        BANK_ACCOUNT,
        SAVINGS_ACCOUNT,
        CHECKING_ACCOUNT


    }

    public double getTotal()
    {
        double sum = 0;

        for (BankAccount account: accounts)
        {
            sum += account.balance;
        }

        return sum;
    }

    public void addInterests()
    {
        for (BankAccount account: accounts)
        {
            if (account instanceof SavingAccount)
            {
                ((SavingAccount) account).addInterest();
            }
        }

    }

    public BankAccount createAccount(double balance, AccountType type, int ID)
    {
        return null;

    }


}
