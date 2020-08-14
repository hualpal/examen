package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;

public class WebSecurityConfig implements WebSecurityConfigurer {

	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/pass").permitAll().antMatchers("/welcome")
				.hasAnyRole("USER", "ADMIN").antMatchers("/getEmployees").hasAnyRole("USER", "ADMIN")
				.antMatchers("/addNewEmployee").hasAnyRole("ADMIN").anyRequest().authenticated().and().formLogin()
				.loginPage("/login").permitAll().and().logout().permitAll();

		http.csrf().disable();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
		authenticationMgr.inMemoryAuthentication().withUser("admin").password("admin").authorities("ROLE_USER");
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/*.css");
		web.ignoring().antMatchers("/*.js");
	}

	@Override
	public void init(SecurityBuilder builder) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configure(SecurityBuilder builder) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
