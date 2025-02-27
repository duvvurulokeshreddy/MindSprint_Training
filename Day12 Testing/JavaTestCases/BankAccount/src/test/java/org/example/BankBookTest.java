package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankBookTest {
    private BankBook account;
    @BeforeEach
    public void setUp() {
        account = new BankBook(1000.0);
    }

    @Test
    public void testCredit() {
        account.credit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    @Test
    public void testDebit() {
        account.debit(200.0);
        assertEquals(800.0, account.getBalance());
    }

    @Test
    public void testDebitInsufficientFunds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.debit(1200.0);
        });
        assertEquals("Insufficient funds", exception.getMessage());
    }
}

