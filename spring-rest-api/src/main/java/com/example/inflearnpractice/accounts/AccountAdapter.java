package com.example.inflearnpractice.accounts;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class AccountAdapter extends User {
    public AccountAdapter(Account account) {
        super(account.getEmail(), account.getPassword(), authorities(account.getRoles()));
    }

    private static Collection<? extends GrantedAuthority> authorities(List<AccountRole> roles) {
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority("ROLE_"+role.name()))
                .collect(Collectors.toList());
    }
}
