package Jobsheet11;

import java.util.Collection;

public class AccountRepository {
    void save(Account account);
    Account findByNumber(String accountNumber);
    Collection<Account> findAll();
}
