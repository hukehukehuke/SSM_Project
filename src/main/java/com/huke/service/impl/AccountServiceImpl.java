package com.huke.service.impl;

import com.huke.dao.AccountDao;
import com.huke.domain.Account;
import com.huke.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有的用户");
        return this.accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {


    }
}
