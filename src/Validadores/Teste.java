package Validadores;

import java.util.HashMap;

import javax.swing.JOptionPane;

import Objetos.*;
import Validadores.*;
import Exception.*;

public class Teste {
	
	public static HashMap<Integer, Cliente> mapeamentoDeCliente;
	
	public static void main (String[] args){
			    
		Cadastra c = new Cadastra();
		Cliente c1 = new Cliente("Breno",1);
		Cliente c2 = new Cliente("Ruan",2);
		Cliente c3 = new Cliente("Pedro",3);
		c.cadastraCliente(c1);
		c.cadastraCliente(c3);
		c.cadastraCliente(c1);

	}
	
}
