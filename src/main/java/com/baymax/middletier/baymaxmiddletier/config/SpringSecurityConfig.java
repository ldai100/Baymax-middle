package com.baymax.middletier.baymaxmiddletier.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/api/public/**")
                .permitAll()
                .antMatchers("/api/private/**").access("hasRole('PRIVATE_USER')")
                .anyRequest().access("hasRole('ADMIN_USER')")
                .and()
                .httpBasic()
                .and()
                .sessionManagement().disable()
                .csrf().disable()
                .cors().disable();
    }
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {


        //TODO: validate username/passowrd thru database and OAuth2
        auth.inMemoryAuthentication()
                .withUser("user")
                .password(passwordEncoder.encode("password"))
                .roles("PRIVATE_USER");

        auth.inMemoryAuthentication()
                .withUser("test1")
                .password(passwordEncoder.encode("password1"))
                .roles("ADMIN_USER");

        auth.inMemoryAuthentication()
                .withUser("test2")
                .password(passwordEncoder.encode("password2"))
                .roles("PRIVATE_USER");
    }


}
