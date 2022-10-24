package com.example.spring2pr;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class StartupData implements CommandLineRunner {


 private final UserRepository userRepository;

    @Autowired
    public StartupData(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) {
        createStudents();

    }

    private void createStudents(){
        User user = new User();
        user.setLogin("user");
        user.setPassword("password");
        user.setId(1L);

        User user2 = new User();
        user2.setLogin("user2");
        user2.setPassword("password2");
        user2.setId(2L);
        User user3 = new User();
        user3.setLogin("user3");
        user3.setPassword("password3");
        user3.setId(3L);
        User user4 = new User();
        user4.setLogin("user4");
        user4.setPassword("password4");
        user4.setId(4L);
        User user5 = new User();
        user5.setLogin("user5");
        user5.setPassword("password5");
        user5.setId(5L);
        User user6 = new User();
        user6.setLogin("user6");
        user6.setPassword("password6");
        user6.setId(6L);
        User user7 = new User();
        user7.setLogin("user7");
        user7.setPassword("password7");
        user7.setId(7L);
        User user8 = new User();
        user8.setLogin("user8");
        user8.setPassword("password8");
        user8.setId(8L);




        userRepository.save(user);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);
        userRepository.save(user5);
        userRepository.save(user6);
        userRepository.save(user7);
        userRepository.save(user8);


    }

}