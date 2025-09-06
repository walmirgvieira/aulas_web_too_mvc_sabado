package com.example.primeiro_projeto.service;

import com.example.primeiro_projeto.model.Mensagem;
import org.springframework.stereotype.Service;

@Service
public class MensagemService {

    public Mensagem getMensagem() {
        return new Mensagem("Olá, Mundo! Esta é minha primeira aplicação");
    }

}
