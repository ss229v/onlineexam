package net.springboot.javaguides;

import net.springboot.javaguides.helper.UserFoundException;
import net.springboot.javaguides.model.Role;
import net.springboot.javaguides.model.User;
import net.springboot.javaguides.model.UserRole;
import net.springboot.javaguides.model.exam.Quiz;
import net.springboot.javaguides.repo.QuizRepository;
import net.springboot.javaguides.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class CapgeminionlineApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public QuizRepository quizRepository;

    public static void main(String[] args) {


        SpringApplication.run(CapgeminionlineApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {
    	 System.out.println("Project Running");
//       User user=new User();
//       user.setfName("Vaubhav");
//       user.setLname("Agarwal");
//       user.setEmail("agarwalvaibhav041@gmail.com");
//       user.setPassword("ABC@123");
//       user.setUserName("avaibhav54");
//       user.setPhone("7906544082");
//       user.setProfile("default.png");
//
//       Role role = new Role();
//       role.setRoleId(44L);
//       role.setRoleName("ADMIN");
//       Set<userRole> userRoleSet=new HashSet<>();
//       userRole userRole=new userRole();
//       userRole.setRole(role);
//       userRole.setUser(user);
//       userRoleSet.add(userRole);
//       User user1 = this.userService.createUser(user,userRoleSet);
//       System.out.println(user1);
   }

}
