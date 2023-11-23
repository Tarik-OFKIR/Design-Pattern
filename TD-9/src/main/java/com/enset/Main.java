package com.enset;

import com.enset.entities.BankAccount;
import com.enset.repository.AccountRepositoryImpl;
import com.enset.util.JsonSerializer;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        JsonSerializer<BankAccount> bankAccountJsonSerializer = new JsonSerializer<>();

        //Singleton
        AccountRepositoryImpl accountRepository = AccountRepositoryImpl.getInstance();
        for (int i = 0; i < 10;i++) {
            new Thread(accountRepository::populateData).start();
        }
        System.out.println("Type a character");
        System.in.read();
        List<BankAccount> bankAccounts = accountRepository.findAll();
//        List<BankAccount> bankAccounts = accountRepository.searchAccounts(bankAccount ->
//                (bankAccount.getAccountType().equals(AccountType.SAVING_ACCOUNT)) && (Objects.equals(bankAccount.getCurrency(), "USD")));
        bankAccounts.stream()
                .map(bankAccountJsonSerializer::toJson)
                .forEach(System.out::println);

/*        System.out.println("=====================================");
        BankAccount account = accountRepository.findById(1L).orElse(null);
        if (account != null) {
            System.out.println(bankAccountJsonSerializer.toJson(account));
        }*/

    }
}
