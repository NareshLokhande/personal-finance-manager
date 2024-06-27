package com.fintechsolution.personalfinancemanager.controllers;

import com.fintechsolution.personalfinancemanager.models.Account;
import com.fintechsolution.personalfinancemanager.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping
    public String getAllAccounts(Model model) {
        List<Account> accounts = accountService.getAll();
        model.addAttribute("accounts", accounts);
        return "accounts";
    }

    @GetMapping("/{id}")
    public String getAccountById(@PathVariable Long id, Model model) {
        Account account = accountService.getAccountById(id);
        model.addAttribute("account", account);
        return "account";
    }

    @PostMapping
    public String createAccount(@ModelAttribute Account account) {
        accountService.saveAccount(account);
        return "redirect:/accounts";
    }

    @PutMapping("/{id}")
    public String updateAccount(@PathVariable Long id, @ModelAttribute Account account) {
        account.setId(id);
        accountService.saveAccount(account);
        return "redirect:/accounts";
    }

    @DeleteMapping("/{id}")
    public String deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
        return "redirect:/accounts";
    }
}

