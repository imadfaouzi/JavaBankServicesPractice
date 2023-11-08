package ma.emsi.bankaccountservice;

import ma.emsi.bankaccountservice.entities.BankAccount;
import ma.emsi.bankaccountservice.enums.AccoutType;
import ma.emsi.bankaccountservice.repositories.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class BankAccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAccountServiceApplication.class, args);
    }


    // @Bean
    CommandLineRunner start(BankAccountRepository bankAccountRepository){

        return  args -> {
            for (int i=0; i< 5; i++){
                BankAccount bankAccount = BankAccount.builder()
                        .id(UUID.randomUUID().toString())
                        .balance(1000 + Math.random() * 9980)
                        .type(Math.random() > 0.5? AccoutType.CURRENT_ACCOUNT : AccoutType.SAVING_ACCOUNT)
                        .createdAt(new Date())
                        .currency("MAD")
                        .build();
                bankAccountRepository.save(bankAccount);
            }
        };

    }
}
