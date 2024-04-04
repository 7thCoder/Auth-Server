// package com.example.Server.security;

// import java.util.*; 

// import org.springframework.boot.ApplicationRunner;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;
// import org.springframework.security.web.SecurityFilterChain;

// import com.example.Server.model.user;
// // import com.example.Server.model.User;
// import com.example.Server.repository.UserRepository;
// import org.springframework.security.core.userdetails.UserDetails;

// @Configuration
// @EnableWebSecurity
// public class securityConfig {
    
//     @Bean
//     SecurityFilterChain defauSecurityFilterChain(HttpSecurity http) throws Exception{
//         return http.authorizeHttpRequests((authorize) -> authorize
//         .anyRequest().authenticated()
//         )
//         .formLogin(form -> form.loginPage("/login").permitAll()
//         )
//         .build();
//     }

//     // @Bean
//     // UserDetailsService userDetailsService(UserRepository userRepo){
//     //     return username -> userRepo.findByUsername(username);
//     // }

//     @Bean
//     public PasswordEncoder passwordEncoder(){
//         return new BCryptPasswordEncoder();
//     }

//     // @Bean
//     // public ApplicationRunner dataLoader(UserRepository repo, PasswordEncoder encoder) {
//     //  return args -> {
//     //         user h = new user("Shako","secret", "Shako", "twn", "town", "237", "61234");
//     //         repo.save(h);
//     //         // new User("tacochef", encoder.encode("password"), "ROLE_ADMIN"));
//     //     };
//     // }

//     @Bean
//     public UserDetailsService userDetailsService(PasswordEncoder encoder){
//         List<UserDetails> userList = new ArrayList<>();
//         userList.add(new User("habuma", encoder.encode("password"), Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"))));

//         return new InMemoryUserDetailsManager(userList);
//     }

// }
