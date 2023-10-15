package br.com.javarocketseat.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstRoute")
public class FirstController {

    @GetMapping("/firstMethod")
    public String firstMessage(){
        return "Funcionou";
    }

}
