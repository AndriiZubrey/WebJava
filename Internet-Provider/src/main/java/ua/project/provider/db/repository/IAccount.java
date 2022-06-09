package ua.project.provider.db.repository;

import ua.project.provider.db.entity.Account;


public interface IAccount extends IEntity<Account> {
    long newNumberContract();
}
