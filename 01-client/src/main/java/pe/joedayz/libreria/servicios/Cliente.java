package pe.joedayz.libreria.servicios;

import java.util.List;

public class Cliente {

	public static void main(String[] args) {
		//Inicia la fábrica de proxies
		ListaLibrosService listaLibrosFactory = new ListaLibrosService();
		
		//Obtener el proxy
		ListaLibros listaLibro = listaLibrosFactory.getListaLibrosPort();
		
		//Ejecuta el método remoto
		List<Libro> libros = listaLibro.listarLibros();
		
		for(Libro libro : libros) {
			System.out.println("Nombre: "+libro.getNombre());
		}
	}
	
}
