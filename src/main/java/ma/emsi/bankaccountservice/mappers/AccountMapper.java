package ma.emsi.bankaccountservice.mappers;


import ma.emsi.bankaccountservice.dto.BankAccountRequestDTO;
import ma.emsi.bankaccountservice.dto.BankAccountResponseDTO;
import ma.emsi.bankaccountservice.entities.BankAccount;
import org.springframework.stereotype.Component;

import org.springframework.beans.BeanUtils;

@Component
public class AccountMapper {

    public BankAccountResponseDTO fromBankAccout(BankAccount bankAccount){
        BankAccountResponseDTO  bankAccountResponseDTO = new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount, bankAccountResponseDTO);
        return bankAccountResponseDTO;
    }

    public BankAccount fromBankAccountRequestDTO(BankAccountRequestDTO bankAccountRequestDTO){
        BankAccount bankAccount = new BankAccount();
        BeanUtils.copyProperties(bankAccountRequestDTO, bankAccount);
        return  bankAccount;
    }
}
