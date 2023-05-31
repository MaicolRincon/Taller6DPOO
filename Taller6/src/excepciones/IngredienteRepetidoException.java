package excepciones;

import java.util.ArrayList;

public class IngredienteRepetidoException extends HamburguesaException{

	@Override
	public void repetido(ArrayList<String> productos) throws Exception {
		int count=0;
		for(int i=0;i<productos.size();i++) {
			for(int a=0;a<productos.size();a++) {
				if(productos.get(i).equals(productos.get(a))) {
					count +=1;
					
				}
			}
		}
		
		if(count>productos.size()) {
			throw new Exception("Existen ingredientes con el mismo nombre");
		}
		
	}

}
