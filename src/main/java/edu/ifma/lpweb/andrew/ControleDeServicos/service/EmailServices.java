package edu.ifma.lpweb.andrew.ControleDeServicos.service;

import edu.ifma.lpweb.andrew.ControleDeServicos.model.Email;
import edu.ifma.lpweb.andrew.ControleDeServicos.repository.EmailRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmailServices {

    private final EmailRepository emailRepository;

    @Autowired
    public EmailServices(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    @Transactional(readOnly = true)
    public List<Email> todas() {
        return emailRepository.findAll();
    }

    @Transactional
    public Email salva(Email categoria) {
        return emailRepository.save(categoria );
    }

    @Transactional(readOnly = true)
    public Email buscaPor(Integer id) {
        return emailRepository.findById(id).get();
    }

    @Transactional
    public void excluiPor(Integer id) {
        emailRepository.deleteById(id );
    }

    @Transactional
    public Email atualiza(Integer id, Email email) {

        Email emailSalvo = this.buscaPor(id);
        BeanUtils.copyProperties(email, emailSalvo, "id");

        return emailSalvo;
    }
}
