package ma.emsi.bankaccountservice.web;


import ma.emsi.bankaccountservice.entities.BankAccount;
import ma.emsi.bankaccountservice.repositories.BankAccountRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

//@RestController
//@RequestMapping("/api")
public class AccountRestController {


     BankAccountRepository bankAccountRepository;

     public AccountRestController(BankAccountRepository bankAccountRepository){
         this.bankAccountRepository = bankAccountRepository;
     }

     @GetMapping("/bankAccounts")
     public List<BankAccount> bankAccounts(){
         return  bankAccountRepository.findAll();
     }

    @GetMapping("/bankAccounts/{id}")
    public BankAccount bankAccount(@PathVariable String id){
        return  bankAccountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("account not found", id)));
    }

    @PostMapping("/bankAccounts")
    public BankAccount saveAccount(@RequestBody BankAccount bankAccount){
        if(bankAccount.getId() == null) bankAccount.setId(UUID.randomUUID().toString());
               return bankAccountRepository.save(bankAccount);
    }

    @PutMapping("/bankAccounts/{id}")
    public BankAccount updateAccount(@PathVariable String id,@RequestBody BankAccount bankAccount){
         BankAccount bankAccount1 = bankAccountRepository.findById(id)
                      .orElseThrow(() -> new RuntimeException(String.format("account not found", id)));

        // Check and update fields if they are not null
        if (bankAccount.getCreatedAt() != null) {
            bankAccount1.setCreatedAt(bankAccount.getCreatedAt());
        }
        if (bankAccount.getBalance() != null) {
            bankAccount1.setBalance(bankAccount.getBalance());
        }
        if (bankAccount.getCurrency() != null) {
            bankAccount1.setCurrency(bankAccount.getCurrency());
        }
        if (bankAccount.getType() != null) {
            bankAccount1.setType(bankAccount.getType());
        }

        // Save the updated account back to the repository
        return bankAccountRepository.save(bankAccount1);
    }

    @DeleteMapping("/bankAccounts/{id}")
    public void deleteAccount(@PathVariable String id){
          bankAccountRepository.deleteById(id);
    }
}
