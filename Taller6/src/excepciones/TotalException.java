package excepciones;

public class TotalException {

	public void precioSuperior(double precio) throws Exception {
		
		if(precio<=150000) {
			throw new Exception("El precio total del pedido supera los 150.000. Intente de nuevo");
		}
	}
}
