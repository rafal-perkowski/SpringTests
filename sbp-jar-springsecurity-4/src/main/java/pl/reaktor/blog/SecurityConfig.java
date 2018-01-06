package pl.reaktor.blog;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import pl.reaktor.blog.controller.TestController;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		TestController.traceCounter(" IN: SecurityConfig configure(" + http + ")");
		
		http
			.authorizeRequests()
				.antMatchers("/").permitAll()
				.anyRequest().authenticated()
			.and()
			.formLogin()
				.loginPage("/loginform")
			.permitAll();
		
		TestController.traceCounter("OUT: SecurityConfig configure(" + http + ")");
	}
}
