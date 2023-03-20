package bank;

import client.Client;
import client.UsingATM;

import java.util.Scanner;

public class ATM  implements UsingATM {
    public long card;
    public String pinCode;
    Bank bank = new Bank();

    @Override
    public void putCard() {
        //Client client = new Client();

        System.out.println("Введите номер карты: ");
        card = useScanner().nextLong();
        checkPinCode();

    }

    @Override
    public void checkBalance() {
        System.out.println("Ваш баланс: " + bank.getBankAccount().get(card));
    }

    @Override
    public void topUpBalance() {

    }

    public void returnCard() {

    }

    private Scanner useScanner() {
        return new Scanner(System.in);
    }

    private void checkPinCode() {
        System.out.println("Введите пин-код карты:");
        pinCode = useScanner().nextLine();
        if (card == bank.getCards().get(pinCode)) {
            showMenu();
        }
        else {
            System.out.println("Пин-код неверен, попробуйте ещё раз!");
            checkPinCode();
        }
    }

    private void showMenu() {
        System.out.println("Выберите действие: " +
                "\n 1.Проверить баланс" +
                "\n 2.Пополнить баланс" +
                "\n 3.Забрать карту");
        int userChoice = useScanner().nextInt();

        switch (userChoice){
            case 1 -> checkBalance();
            case 2 -> topUpBalance();
            case 3 -> returnCard();
        }
    }
}
