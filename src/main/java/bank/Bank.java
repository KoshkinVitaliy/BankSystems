package bank;

import java.util.ArrayList;
import java.util.HashMap;

public class Bank {
    private final HashMap<Long, Double> bankAccount = new HashMap<>();
    private final HashMap<String, Long> cards = new HashMap<>();

    public HashMap<Long, Double> getBankAccount() {
        fillBankAccount();
        return bankAccount;
    }

    public HashMap<String, Long> getCards() {
        fillCards();
        return cards;
    }



    private void fillBankAccount() {
        int max = 100000;
        int min = 0;
        for (int i=0; i < 10; i++) {
            double randomAmount = (Math.random() * ++max) + min;
            bankAccount.put(2200582600000000L + i, randomAmount);
        }
    }

    private void fillCards() {
        for (int i=0; i < 10; i++) {
            cards.put("000" + i, 2200582600000000L + i);
        }
    }
}
