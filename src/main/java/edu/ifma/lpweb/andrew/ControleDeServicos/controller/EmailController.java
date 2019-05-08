package edu.ifma.lpweb.andrew.ControleDeServicos.controller;

import edu.ifma.lpweb.andrew.ControleDeServicos.model.Email;
import edu.ifma.lpweb.andrew.ControleDeServicos.service.EmailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emails")
public class EmailController {

    private final EmailServices emailServices;

    @Autowired
    public EmailController(EmailServices emailServices) {
        this.emailServices = emailServices;
    }

    @GetMapping
    public List<Email> todas() {
        return emailServices.todas();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Email salva(@RequestBody Email email) {
         
        return emailServices.salva(email );
    }

    @GetMapping("/{id}")
    public Email buscaPor(@PathVariable Integer id) {
        return emailServices.buscaPor(id );
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void exclui(@PathVariable Integer id) {
        emailServices.excluiPor(id );
    }

    @PutMapping("/{id}")
    public Email altera(@PathVariable  Integer id, @RequestBody Email cliente) {
        return  emailServices.atualiza(id, cliente );
    }
}
