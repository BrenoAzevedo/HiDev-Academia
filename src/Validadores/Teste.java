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
	
		c.cadastraCliente(c1);
		System.out.println("Nome: "+c.getCliente(c1));
	}
	
}
