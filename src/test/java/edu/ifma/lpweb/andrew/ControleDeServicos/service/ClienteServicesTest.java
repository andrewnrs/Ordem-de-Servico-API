//package edu.ifma.lpweb.andrew.ControleDeServicos.service;
//
//import edu.ifma.lpweb.andrew.ControleDeServicos.model.Cliente;
//import edu.ifma.lpweb.andrew.ControleDeServicos.repository.ClienteRepository;
//import org.junit.Assert;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.Optional;
//
//@SpringBootTest
//@DataJpaTest
//@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
//public class ClienteServicesTest {
//
//    @Autowired
//    private ClienteServices clienteServices;
//
//    private static Cliente cliente1;
//    private static Cliente cliente2;
//    private static Cliente cliente3;
//
//    public static Cliente CriaCliente1(){
//
//        Cliente clienteTeste1 = new Cliente();
//
//        clienteTeste1.setId(4);
//        clienteTeste1.setCpf("14510779984");
//        clienteTeste1.setNome("Rayssa Liz Vieira");
//        clienteTeste1.setRg("300331125");
//
//        return clienteTeste1;
//    }
//
//    public static Cliente CriaCliente2(){
//
//        Cliente clienteTeste2 = new Cliente();
//
//        clienteTeste2.setId(4);
//        clienteTeste2.setCpf("06249645900");
//        clienteTeste2.setNome("Henry Julio Porto");
//        clienteTeste2.setRg("114222599");
//
//        return clienteTeste2;
//    }
//
//    public static Cliente CriaCliente3(){
//
//        Cliente clienteTeste3 = new Cliente();
//
//        clienteTeste3.setId(4);
//        clienteTeste3.setCpf("36703822670");
//        clienteTeste3.setNome("Julio Lorenzo Guilherme da Cunha");
//        clienteTeste3.setRg("238946344");
//
//        return clienteTeste3;
//    }
//
//    @BeforeClass
//    public static void SetupInicial(){
//        cliente1 = CriaCliente1();
//        cliente2 = CriaCliente2();
//        cliente3 = CriaCliente3();
//    }
//
//    @Test
//    public void deveSalvarCliente1() {
//        clienteServices.salva(cliente1);
//        Cliente clienteRecuperado = clienteServices.buscaPor(cliente1.getId());
//        Assert.assertEquals(cliente1, clienteRecuperado);
//    }
//
//
//    @Test
//    public void DeveAtualizarCliente2() {
//        clienteServices.salva(cliente2);
//
//        Cliente clienteRecuperado = clienteServices.buscaPor(cliente2.getId());
//
//        clienteRecuperado.setNome("Henry Julio Porto Ribeiro");
//
//        clienteServices.salva(clienteRecuperado);
//
//        Cliente clienteAtualizado =  clienteServices.buscaPor(cliente2.getId());
//
//        Assert.assertEquals(clienteAtualizado, clienteRecuperado);
//    }
//
//
//    @Test
//    public void DeveExcluirCliente3() {
//        clienteServices.salva(cliente3);
//
//        Cliente clienteRecuperado = clienteServices.buscaPor(cliente3.getId());
//
//        clienteServices.excluiPor(cliente3.getId());
//
//        Cliente clienteDeletado =  clienteServices.buscaPor(cliente3.getId());
//
//        Assert.assertEquals(null, clienteDeletado);
//    }
//}
