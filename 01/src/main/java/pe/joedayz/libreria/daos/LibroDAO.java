package pe.joedayz.libreria.daos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pe.joedayz.libreria.modelos.Libro;

public class LibroDAO {

	public List<Libro> listarLibros() {
		List<Libro> libros = new ArrayList<Libro>();
		libros.add(new Libro(2012, new ArrayList<String>(Arrays.asList("Maximo Perez", "Minimo Perez")), "Atlas", "Guia del Programador","La biblia del programador ..."));
		libros.add(new Libro(2012, new ArrayList<String>(Arrays.asList("Rudy Rails")), "RubyPeru", "Ruby on Rails", "Cree rapidamente aplicaciones web"));
		return libros;
	}
	
	public List<Libro> listarLibros(Integer numeroDePagina, Integer tamanioDePagina){
		
		List<Libro> libros = listarLibros();
		int indiceInicial = numeroDePagina * tamanioDePagina;
		int indiceFinal = indiceInicial + tamanioDePagina;
		
		indiceFinal = indiceFinal > libros.size() ? libros.size() : indiceFinal;
		indiceInicial = indiceInicial > indiceFinal ? indiceFinal : indiceInicial;
		
		return libros.subList(indiceInicial, indiceFinal);
	}

}
