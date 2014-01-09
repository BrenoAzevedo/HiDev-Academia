package Validadores;

import javax.swing.JOptionPane;
import Objetos.*;
import Validadores.*;
import Exception.*;

public class Validar {
	
	public void exibirMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

	public String lerString(String msg) {
		String valor = "";
		do {
			valor = JOptionPane.showInputDialog(null, msg);
			if (valor.length() < Constantes.TAM_MINIMO)
				exibirMsg("Valor deve ter no minimo ");

		} while (valor.length() < Constantes.TAM_MINIMO);
		return valor;
	}

	public Integer lerInteiro(String msg) {
		return Integer.parseInt(lerString(msg));
	}

	
}
