package edu.ifma.lpweb.andrew.ControleDeServicos.controller;

import edu.ifma.lpweb.andrew.ControleDeServicos.model.*;
import edu.ifma.lpweb.andrew.ControleDeServicos.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;
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
    public ResponseEntity<?> cria(@Validated @RequestBody Cliente cliente, HttpServletResponse response) {

        for(Orcamento orcamento : cliente.getOrcamentos()){
            orcamento.setCliente(cliente);
        }

        for(Endereco endereco : cliente.getEnderecos()){
            endereco.setCliente(cliente);
        }

        Cliente clienteSalvo = clienteService.salva(cliente );

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(clienteSalvo.getId())
                .toUri();

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(clienteSalvo );
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
    public ResponseEntity<Cliente> atualiza(@PathVariable Integer id, @Validated @RequestBody Cliente cliente ) {
        Cliente clienteManager = clienteService.atualiza(id, cliente );
        return ResponseEntity.ok(clienteManager );
    }

}
