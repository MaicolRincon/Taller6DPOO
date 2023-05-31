import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ComboTest {

	Combo combo = new Combo(10,"ComboPrueba");
	ProductoMenu producto = new ProductoMenu("papas",3000,250);

	@Test
	void testAgregarItemACombo() {
		
		combo.agregarItemACombo(producto);
		assumeTrue(combo!=null);
	}

	@Test
	void testGetCalorias() {
		assertEquals(combo.getCalorias(), 250);
	}

	@Test
	void testGetProductos() {
		ArrayList<ProductoMenu> productos = combo.getProductos();
		ArrayList<ProductoMenu> productoPrueba= new ArrayList<ProductoMenu>();
		productoPrueba.add(producto);
		
		assertEquals(productos, productoPrueba);
	}

}
