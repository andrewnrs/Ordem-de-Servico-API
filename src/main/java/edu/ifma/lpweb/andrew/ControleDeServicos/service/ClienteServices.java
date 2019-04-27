package edu.ifma.lpweb.andrew.ControleDeServicos.service;

import edu.ifma.lpweb.andrew.ControleDeServicos.repository.ClienteRepository;
import edu.ifma.lpweb.andrew.ControleDeServicos.model.Cliente;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServices {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteServices(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Transactional(readOnly = true)
    public List<Cliente> todas() {
        return clienteRepository.findAll();
    }

    @Transactional
    public Cliente salva(Cliente categoria) {
        return clienteRepository.save(categoria );
    }

    @Transactional(readOnly = true)
    public Cliente buscaPor(Integer id) {
        return clienteRepository.findById(id).get();
    }

    @Transactional
    public void excluiPor(Integer id) {
        clienteRepository.deleteById(id );
    }

    @Transactional
    public Cliente atualiza(Integer id, Cliente categoria) {

        Cliente categoriaSalva = this.buscaPor(id);
        BeanUtils.copyProperties(categoria, categoriaSalva, "id");

        return categoriaSalva;
    }

}
