import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class PedidoTest {

	Pedido pedido = new Pedido("Maicol","Carrera");
	ProductoMenu producto = new ProductoMenu("papas",3000,250);
	Combo combo = new Combo(10,"Comboprueba");
	Ingrediente ingre = new Ingrediente("salsa",1000,200);
	Bebida bebida = new Bebida("agua",2000,100);


	@Test
	void testAgregarProducto() {
		pedido.agregarProducto(producto);
		assumeTrue(pedido!=null);
	}

	@Test
	void testAgregarCombo() {
		pedido.agregarCombo(combo);
		assumeTrue(pedido!=null);
	}

	@Test
	void testAgregarIngrediente() {
		pedido.agregarIngrediente(ingre);
		assumeTrue(pedido!=null);
	}

	@Test
	void testAgregarBebida() {
		pedido.agregarBebida(bebida);
		assumeTrue(pedido!=null);
	}

	@Test
	void testGuardarFactura() throws IOException {
		pedido.guardarFactura();
	}

}
