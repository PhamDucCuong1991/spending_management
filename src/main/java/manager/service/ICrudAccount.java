package manager.service;

import manager.model.account.Account;

import java.util.List;

public interface ICrudAccount {
    List<Account> findAll();
    Account findOne(Long id);
    void save(Account account);
    void delete(Long id);
}
