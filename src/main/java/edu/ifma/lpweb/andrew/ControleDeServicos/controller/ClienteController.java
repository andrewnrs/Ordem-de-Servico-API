package edu.ifma.lpweb.andrew.ControleDeServicos.controller;

import edu.ifma.lpweb.andrew.ControleDeServicos.service.ClienteServices;
import edu.ifma.lpweb.andrew.ControleDeServicos.model.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteServices clienteService;

    @Autowired
    public ClienteController(ClienteServices clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> todas() {
        return clienteService.todas();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salva(@RequestBody Cliente cliente) {
        return clienteService.salva(cliente );
    }

    @GetMapping("/{id}")
    public Cliente buscaPor(@PathVariable Integer id) {
        return clienteService.buscaPor(id );
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void exclui(@PathVariable Integer id) {
        clienteService.excluiPor(id );
    }

    @PutMapping("/{id}")
    public Cliente altera(@PathVariable  Integer id, @RequestBody Cliente cliente) {
        return  clienteService.atualiza(id, cliente );
    }

}
