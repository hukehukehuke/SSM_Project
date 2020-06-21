package com.huke.controller;

import com.huke.domain.Account;
import com.huke.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping(value = "/account")
public class AccountController {


    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/findAll")
    public String findAll() {
        System.out.println("表现层，查询所有账户信息");
        accountService.findAll();
        return "list";
    }

    @RequestMapping(value = "/findAll")
    public String saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return "list";
    }
}
