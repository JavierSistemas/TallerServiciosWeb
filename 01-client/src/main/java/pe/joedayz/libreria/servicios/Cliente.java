package pe.joedayz.libreria.servicios;

import java.util.List;

public class Cliente {

	public static void main(String[] args) {
		//Inicia la f�brica de proxies
		ListaLibrosService listaLibrosFactory = new ListaLibrosService();
		
		//Obtener el proxy
		ListaLibros listaLibro = listaLibrosFactory.getListaLibrosPort();
		
		//Ejecuta el m�todo remoto
		List<Libro> libros = listaLibro.listarLibros();
		
		for(Libro libro : libros) {
			System.out.println("Nombre: "+libro.getNombre());
		}
	}
	
}
