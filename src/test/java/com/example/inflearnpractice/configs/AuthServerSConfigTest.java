package com.example.inflearnpractice.configs;

import com.example.inflearnpractice.accounts.Account;
import com.example.inflearnpractice.accounts.AccountRepository;
import com.example.inflearnpractice.accounts.AccountRole;
import com.example.inflearnpractice.accounts.AccountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class AuthServerSConfigTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    AccountService accountService;

    @Autowired
    AccountRepository accountRepository;

    private String email;
    private String password;

    @BeforeEach
    void setUp() {
        this.email = "yin.yim@email.com";
        this.password = "yong";
        Account yong = Account.builder()
                .email(email)
                .password(password)
                .roles(Arrays.asList(AccountRole.ADMIN, AccountRole.USER))
                .build();
        accountRepository.save(yong);
    }

    @Test
    @DisplayName("")
    void getAuthToken() throws Exception {
        this.mockMvc.perform(post("/oauth/token")
                .with(httpBasic("yongClientId", "yongClientSecret"))
                .param("username", email)
                .param("password", password)
                .param("grant_type", "password"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("access_token").exists());

    }
}
