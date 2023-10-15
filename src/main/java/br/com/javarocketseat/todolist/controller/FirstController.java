package br.com.javarocketseat.todolist.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    public String primeiraMensagem(){
        return "Funcionou";
    }

}
