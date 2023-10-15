package br.com.javarocketseat.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/")
    public UserModel create(@RequestBody UserModel userModel){
        UserModel userverify = userRepository.findByUsername(userModel.getUsername());

        if(userverify != null){
            System.out.println("Usuário já existe");
            return null;
        }
        return this.userRepository.save(userModel);
    }
}
