package com.example.jpajava.service;

import com.example.jpajava.entity.CustomUserDetails;
import com.example.jpajava.entity.User;
import com.example.jpajava.entity.UserRole;
import com.example.jpajava.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return loadUser(username);
    }

    private UserDetails loadUser(String username) {
        User user = userRepository.findByUserName(username);
        System.out.println(user);
        System.out.println(username);

        if (user == null) {
            throw new UsernameNotFoundException("Sai");
        }

        Collection<GrantedAuthority> grantedAuthoritySet = new HashSet<>();

        Set<UserRole> roles = user.getUserRoles();

        for (UserRole userRole : roles) {
            grantedAuthoritySet.add(new SimpleGrantedAuthority(userRole.getRole().getName()));
            return new CustomUserDetails(user, grantedAuthoritySet);
        }

        return null;
    }
}
