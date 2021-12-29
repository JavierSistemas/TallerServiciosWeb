package pe.joedayz.libreria.servicios;

import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import pe.joedayz.libreria.daos.LibroDAO;
import pe.joedayz.libreria.modelos.Libro;
//Todos los métodos public , serán los del servicio.

@WebService  //JAX-WS
public class ListaLibros {

	@WebResult(name = "libro")
	public List<Libro> listarLibros() {
		LibroDAO libroDAO = obtenerDAO();
		return libroDAO.listarLibros();
	}
	
	public List<Libro>  listarLibros(int numeroDePagina, int  tamanioDePagina){
		LibroDAO libroDao = new LibroDAO();
		return libroDao.listarLibros(numeroDePagina, tamanioDePagina);
	}
	
	private LibroDAO obtenerDAO() {
		return new LibroDAO();
	}

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/libros", new ListaLibros());
		System.out.println("Servicio inicializado!");
	
	}

}
