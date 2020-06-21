package com.huke.service;

import com.huke.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AccountService {

    public List<Account> findAll();

    public  void saveAccount(Account account);
}
