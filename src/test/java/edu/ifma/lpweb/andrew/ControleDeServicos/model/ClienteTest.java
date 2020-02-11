package edu.ifma.lpweb.andrew.ControleDeServicos.model;


import org.hibernate.validator.constraints.br.CPF;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@SpringBootTest
//@DataJpaTest
//@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class ClienteTest {

    private static Cliente cliente;

    public static Cliente CriaCliente(){

        Cliente clienteTeste = new Cliente();

        clienteTeste.setId(4);
        clienteTeste.setCpf("14510779984");
        clienteTeste.setNome("Rayssa Liz Vieira");
        clienteTeste.setRg("300331125");
//
//            clienteTeste.setEmails(Collections.singleton("rrayssalizvieira@said.adv.br"));
//            clienteTeste.setTelefones(Collections.singleton("988166448"));
//
//            Endereco enderecoTeste = new Endereco();
//                enderecoTeste.setBairro("Lagoa");
//                enderecoTeste.setCep("650000000");
//                enderecoTeste.setComplemento("");
//                enderecoTeste.setLogradouro("Rua Rio Nilo");
//                enderecoTeste.setNumero(631);
//                Cidade cidadeTeste = new Cidade();
//                    enderecoTeste.setCidade(cidadeTeste);
//
//            clienteTeste.setEnderecos(Collections.singleton(enderecoTeste));
//
//            Orcamento orcamentoTeste = new Orcamento();
//                orcamentoTeste.setData(LocalDate.now());
//                orcamentoTeste.setValor((float) 100);
//
//                Item itemTeste = new Item();
//                    ProdutoServico produtoServicoTeste = new ProdutoServico();
//                    produtoServicoTeste.setDefinicao();
//
//                itemTeste.setProdutoServico();
//                orcamentoTeste.setItens();

//            clienteTeste.setOrcamentos(Collections.singleton(orcamentoTeste));

        return clienteTeste;
    }

    @BeforeClass
    public static void SetupInicial(){
        cliente = CriaCliente();
    }

    @Test
    public void DeveValidarNomeCliente() {

        @NotEmpty
        String nome = "Rayssa Liz Vieira";

        Assert.assertNotNull(cliente.getNome());
        Assert.assertEquals(cliente.getNome(), nome);
    }

    @Test
    public void DeveValidarRGCliente() {
        @NotNull
        String rg = "300331125";

        Assert.assertNotNull(cliente.getNome());
        Assert.assertEquals(cliente.getRg(), rg);
    }

    @Test
    public void DeveValidarCPFCliente() {
        @CPF
        String cpfCliente = "14510779984";

        Assert.assertNotNull(cliente.getCpf());

        Assert.assertEquals(cpfCliente, cliente.getCpf());
    }


}
