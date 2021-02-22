package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingAccountTest {

    SavingAccount savingAccount;

    @BeforeEach
    void setUp() {
        savingAccount = new SavingAccount("OWNER", 1, 1000, 0.02);
    }

    @Test
    void addInterest() {
        assertEquals(savingAccount.addInterests(), 1020);
    }

    @Test
    void addInterest2() {
        savingAccount.balance = 2000;
        assertEquals(savingAccount.addInterests(), 2040);
    }
}