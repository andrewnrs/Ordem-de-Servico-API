//package edu.ifma.lpweb.andrew.ControleDeServicos.repository;
//import edu.ifma.lpweb.andrew.ControleDeServicos.model.Cliente;
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
//public class ClienteRepositoryTest {
//
//    @Autowired
//    private ClienteRepository repository;
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
//        repository.save(cliente1);
//        Optional<Cliente> clienteRecuperado = repository.findById(cliente1.getId());
//
//        Assert.assertEquals(cliente1, clienteRecuperado);
//    }
//
//
//    @Test
//    public void DeveAtualizarCliente2() {
//        repository.save(cliente2);
//
//        Cliente clienteRecuperado = repository.getOne(cliente2.getId());
//
//        clienteRecuperado.setNome("Henry Julio Porto Ribeiro");
//
//        repository.save(clienteRecuperado);
//
//        Cliente clienteAtualizado = repository.findById(cliente2.getId()).get();
//
//        Assert.assertEquals(clienteAtualizado, clienteRecuperado);
//    }
//
//
//    @Test
//    public void DeveExcluirCliente3() {
//        repository.save(cliente3);
//
//        Cliente clienteRecuperado = repository.getOne(cliente3.getId());
//
//        repository.deleteById(cliente3.getId());
//
//        Optional<Cliente> clienteDeletado = repository.findById(cliente3.getId());
//
//        Assert.assertEquals(null, clienteDeletado);
//    }
//}
