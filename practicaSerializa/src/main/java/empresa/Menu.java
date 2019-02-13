package empresa;

import java.util.ArrayList;
import java.util.Collection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import com.esotericsoftware.jsonbeans.Json;
import com.esotericsoftware.jsonbeans.OutputType;

import serializadores.GestorSerializador;
import serializadores.SerializarCliente;


@SuppressWarnings("unused")
public class Menu {

	static String rutaJson = "datos/clientes.json";
	static Collection <Cliente> clientesEmpresa = new ArrayList<>();
	public static void main(String[] args) {
//		Json json = new Json();
//		Collection <Cliente> clientesEmpresa = new ArrayList<>();
		GestorSerializador gestor = new GestorSerializador();
	
		Cliente cliente1 = new Cliente("11111111A", "nombre1", 911111111, "direcc1", 1000);
		Cliente cliente2 = new Cliente("22222222B", "nombre2", 911111112, "direcc2", 2000);
		anadirCliente(cliente1, gestor);
		
		anadirCliente(cliente2, gestor);
		System.out.println(clientesEmpresa);
	}
	
	public static void anadirCliente (Cliente c, GestorSerializador gestor) {
//		Collection<Cliente> clientesEmpresa = gestor.getClientes(rutaJson);
	
		if(clientesEmpresa.isEmpty()) {
			clientesEmpresa.add(c);
			gestor.guardarClienteEnJson(c, rutaJson);
			
		}else{
		clientesEmpresa = gestor.getClientes(rutaJson);
			
			for (Cliente cliente : clientesEmpresa) {
				System.out.println(clientesEmpresa);
				if(cliente.getNIF().equals(c.getNIF())){
					System.out.println("El cliente ya se encuentra entre los clientes de la empresa.");
				}else {
					clientesEmpresa.add(c);
					gestor.guardarClienteEnJson(c, rutaJson);
					System.out.println("Cliente nuevo añadido.");
				}
			}
		}
//			if (contiene(c, clientesEmpresa)) {
//				
//			}else{
//				clientesEmpresa.add(c);
//				gestor.guardarListaClientesEnJson(clientesEmpresa, rutaJson);
//				
//			}
//			
//		clientesEmpresa.clear();
		
	}
	
	public static boolean contiene (Cliente c, Collection<Cliente> clientes) {
		boolean respuesta = false;
		for (Cliente cliente : clientes) {
			if(cliente.getNIF().equals(c.getNIF())) {
				
				respuesta=true;
			}
		}
			
		return respuesta;
	}
	
	public static void listarClientes(String ruta, GestorSerializador gestor) {
		
		Collection<Cliente> clientesEmpresa = gestor.getClientes(ruta);

		for (Cliente cliente : clientesEmpresa) {
			System.out.println(gestor.getClientes(ruta));
		}
	}
//	
//	public static Cliente buscarCliente (String NIF, GestorSerializador gestor) {
//		Collection<Cliente> clientesEmpresa = new ArrayList<>();
//		clientesEmpresa = gestor.getClientes(rutaJson);
//	
//		Cliente clienteBuscado = new Cliente();
//		
//		
//		for (Cliente cliente : clientesEmpresa) {
//			if(cliente.getNIF().equals(NIF)){
//				clienteBuscado = cliente;
//				System.out.println("Cliente encontrado en su lista de clientes");
//			}else {
//				clienteBuscado = null;
//				System.out.println("Cliente no encontrado");
//			}
//		}
//		return clienteBuscado;
//	}
//	
//	public static void borrarCliente (Cliente clienteABorrar, GestorSerializador gestor) {
//		Json json = new Json();
//		SerializarCliente sc = new SerializarCliente();
//		json.setSerializer(Cliente.class, sc);
//		
//		for (Cliente cliente : clientesEmpresa) {
//			if(sc.getCliente(rutaJson).contains(clienteABorrar))
//				clienteABorrar=null;
//		}
//		sc.guardarListaClientesEnJson(clientesEmpresa, rutaJson);//Se debe hacer esto para actualizar??
//	
	
//	leer, desserializar, contine, incluyo todos menos el que quiero borrar en un Array aux. Y este Array lo guardo.	
	
	
//		}
		
}
