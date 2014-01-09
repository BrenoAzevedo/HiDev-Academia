package Validadores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Objetos.Cliente;

public class Cadastra {
	
	List<Cliente> clientes = new ArrayList<Cliente>();
	HashMap<Integer, Cliente> mapaClientes = new HashMap<Integer, Cliente>(); 
	
	/**
	 * O codigo do cadastra cliente é baseado no put do HashMap. O objeto cliente é adicionado  
	 * no mapa tendo como key a sua matricula; Lembrar da Exception;
	 */	
	
	public void cadastraCliente(Cliente c1){
		clientes.add(c1);
		mapaClientes.put(c1.getMatricula(), c1);
		System.out.println("Cliente: "+c1.getNome());
	}
	
	/**
	 * O codigo do cadastra getcliente é o retorno do objeto cliente. O objeto cliente é recebido
	 * e com a funcao nativa do mapa (get) é possivel pegar o elemento se esse o estiver no mapa;
	 * Lembrar da Exception;
	 */
	public String getCliente(Cliente c){
		return mapaClientes.get(c.getMatricula()).getNome();
	}
	
}
