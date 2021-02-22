package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankCustomerTest {

    BankCustomer bankCustomer;

    @BeforeEach
    void setUp() {
        bankCustomer = new BankCustomer();
    }

    @Test
    void createAccount() {
        BankAccount bankAccount = bankCustomer.createAccount(300, BankCustomer.AccountType.BANK_ACCOUNT, 202);
        assertTrue(bankAccount.balance == 300);
    }


}