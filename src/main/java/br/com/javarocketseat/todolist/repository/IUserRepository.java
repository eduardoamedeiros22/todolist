package br.com.javarocketseat.todolist.repository;

import br.com.javarocketseat.todolist.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IUserRepository extends JpaRepository<UserModel, UUID> {

    public UserModel findByUsername(String username);

}
