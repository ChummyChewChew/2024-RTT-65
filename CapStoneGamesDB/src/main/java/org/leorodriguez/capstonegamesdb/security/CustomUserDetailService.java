package org.leorodriguez.capstonegamesdb.security;


import org.leorodriguez.capstonegamesdb.model.User;
import org.leorodriguez.capstonegamesdb.repository.UserRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
@Service
public class CustomUserDetailService implements UserDetailsService {

    private UserRepository userRepository;
    public CustomUserDetailService(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user != null) {
            return new org.springframework.security.core.userdetails.User(
                    user.getUsername(),
                    user.getPassword(),
                    List.of());//no roles

        } else {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
    }
}
