package br.com.dev.guerber.ioc_di;

import org.springframework.stereotype.Service;

/**
 * MeuComponent
 */
@Service
public class MeuComponent {

    public String chamarMeuComponent(){
        return "Chamado meu component";
    }
}