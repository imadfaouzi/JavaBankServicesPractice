package ma.emsi.bankaccountservice.repositories;

import ma.emsi.bankaccountservice.entities.BankAccount;
import ma.emsi.bankaccountservice.enums.AccoutType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;


@RepositoryRestResource(path = "accounts")

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
     @RestResource(path = "/ByType")
      List<BankAccount> findByType(@Param("t") AccoutType type);
}
