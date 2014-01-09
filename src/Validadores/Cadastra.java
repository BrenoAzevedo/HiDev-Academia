package Validadores;

import java.util.HashMap;

import Objetos.*;
import Validadores.*;
import Exception.*;

public class Cadastra {
	
	public HashMap<Integer, Cliente> mapeamentoDeCliente; 
	
	/**
	 * O codigo do cadastra cliente é baseado no put do HashMap. O objeto cliente é adicionado  
	 * no mapa tendo como key a sua matricula; Lembrar da Exception;
	 */	
	public void cadastraCliente(Cliente c1){
		mapeamentoDeCliente = new HashMap<Integer, Cliente>();
		mapeamentoDeCliente.put(c1.getMatricula(),c1);
	}
	
	/**
	 * O codigo do cadastra getcliente é o retorno do objeto cliente. O objeto cliente é recebido
	 * e com a funcao nativa do mapa (get) é possivel pegar o elemento se esse o estiver no mapa;
	 * Lembrar da Exception;
	 */
	public Cliente getCliente(Cliente c1){
		return mapeamentoDeCliente.get(c1);
	}
	
}
