package br.com.dev.guerber.primeiroprojetospringboot.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
@RequestMapping("/primeiroController")
public class PrimeiroController {
    
    @GetMapping("/primeiroMetodo/{id}")
    public String primeiroMetodo(@PathVariable String id){
        return "Meu primeiro metodo api rest " + id;
    }

    @GetMapping("/metodoComQueryParams")
    public String metodoComQueryParams(@RequestParam String id){
        return "O paramétro com metodoComQueryParams é " + id;
    }

    @PostMapping("/metodoComBodyParams")
    public String metodoComBodyParams(@RequestBody Usuario usuario){
        return "metodoComBodyParams " + usuario.username;
    }

    record Usuario(String username){

    }

    @PostMapping("/metodoComHeaders")
    public String metodoComHeaders(@RequestHeader String name){
        return "metodoComHeaders " + name;
    }

    @PostMapping("/metodoComListaHeaders")
    public String metodoComListaHeaders(@RequestHeader Map<String,String> headers){
        return "metodoComHeaders " + headers;
    }

    @GetMapping("/metodoResponseEntity")
    public ResponseEntity<Object> metodoResponseEntity(){
        return ResponseEntity.status(400).body("Mensagem de erro");
    }

}
