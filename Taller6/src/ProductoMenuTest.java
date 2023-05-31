import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductoMenuTest {
	
	ProductoMenu producto = new ProductoMenu("papas",3000,250);

	@Test
	void testGetNombre() {
		String nombre = producto.getNombre();
		assertEquals(nombre, "papas");
	}

	@Test
	void testGetPrecioBase() {
		int precio = producto.getPrecioBase();
		assertEquals(precio, 3000);
	}

	@Test
	void testGetCalorias() {
		int calorias = producto.getCalorias();
		assertEquals(calorias, 250);
	}

}
