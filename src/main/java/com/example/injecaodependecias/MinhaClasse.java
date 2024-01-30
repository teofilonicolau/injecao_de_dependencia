package com.example.injecaodependecias;

import jakarta.inject.Inject;

public class MinhaClasse {

    @Inject
    private TraducaoService traducaoService;

    public void meuMetodo() {
        String mensagem = traducaoService.getMensagem("fr");
        System.out.println(mensagem);
    }
}

