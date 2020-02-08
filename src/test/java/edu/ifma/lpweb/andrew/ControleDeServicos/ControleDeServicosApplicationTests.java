package edu.ifma.lpweb.andrew.ControleDeServicos;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ControleDeServicosApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void inicio(){
		Assert.isTrue(true, "Certo");
	}
}
