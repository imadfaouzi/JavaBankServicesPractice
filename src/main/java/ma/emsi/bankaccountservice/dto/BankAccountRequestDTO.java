package ma.emsi.bankaccountservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.bankaccountservice.enums.AccoutType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;


@AllArgsConstructor @NoArgsConstructor @Data
public class BankAccountRequestDTO {

    private Double balance;
    private String currency;
    private AccoutType type;

}
