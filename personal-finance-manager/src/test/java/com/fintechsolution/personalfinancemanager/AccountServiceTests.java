package com.fintechsolution.personalfinancemanager;

import com.fintechsolution.personalfinancemanager.models.Account;
import com.fintechsolution.personalfinancemanager.repository.AccountRepository;
import com.fintechsolution.personalfinancemanager.services.AccountService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class AccountServiceTests {

    @Autowired
    private AccountService accountService;

    @MockBean
    private AccountRepository accountRepository;

    @Test
    public void testGetAccountById() {
        Account account = new Account();
        account.setId(1L);
        account.setAccountNumber("123456");
        account.setAccountHolderName("John Doe");
        account.setBalance(1000.0);

        Mockito.when(accountRepository.findById(1L)).thenReturn(Optional.of(account));

        Account found = accountService.getAccountById(1L);
        assertThat(found.getAccountHolderName()).isEqualTo("John Doe");
    }
}
