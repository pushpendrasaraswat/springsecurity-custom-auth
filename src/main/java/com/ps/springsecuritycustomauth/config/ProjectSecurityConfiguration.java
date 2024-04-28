package com.ps.springsecuritycustomauth.config;



import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfiguration {

    @Bean
    SecurityFilterChain SpringSecurityCustomFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(
            requests -> requests.requestMatchers("/myAccount", "/myBalance", "/loanDetails", "/myCards")
                .authenticated()
                .requestMatchers("/contact", "/notices","/registerCustomer")
                .permitAll()
        // .denyAll()
        ).formLogin(Customizer.withDefaults()).httpBasic(Customizer.withDefaults());
        return http.build();
    }


    @Bean
    PasswordEncoder createPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
