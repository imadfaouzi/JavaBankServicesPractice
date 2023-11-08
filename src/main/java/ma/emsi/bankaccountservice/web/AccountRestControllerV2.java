package ma.emsi.bankaccountservice.web;


import ma.emsi.bankaccountservice.dto.BankAccountRequestDTO;
import ma.emsi.bankaccountservice.dto.BankAccountResponseDTO;
import ma.emsi.bankaccountservice.entities.BankAccount;
import ma.emsi.bankaccountservice.repositories.BankAccountRepository;
import ma.emsi.bankaccountservice.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class AccountRestControllerV2 {

     AccountService accountService;

     public AccountRestControllerV2(AccountService accountService){
         this.accountService = accountService;
     }


    @PostMapping("/bankAccounts")
    public BankAccountResponseDTO saveAccount(@RequestBody BankAccountRequestDTO bankAccountRequestDTO){
          return accountService.addAccount(bankAccountRequestDTO);
    }

}
