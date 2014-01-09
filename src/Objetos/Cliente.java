package Objetos;

import java.util.ArrayList;
import java.util.List;

import Objetos.*;
import Validadores.*;
import Exception.*;

public class Cliente extends Pessoa{
	
	public Cliente(String nome, int matricula) {
		super(nome, matricula);
	}

	private Medida medidas;
	private String status;
	private List<Modalidade> modalidades = new ArrayList<Modalidade>();;
	private Mensalidade mensalidade;
	private String observacoes;
	
	// modulos de todos os set's dos atributos
	
	public void setMedidas(Medida m){
		this.medidas = m;
	}
	
	public void setStatus(String status){
		this.status = status;
	}
	
	public void setModalidade(Modalidade modalidade){
		this.modalidades.add(modalidade);
	}
	
	public void setObs(String obs){
		this.observacoes = obs;
	}
	
	// modulos de todos os get's dos atributos
	
	public Medida getMedidas(){
		return this.medidas;
	}
	
	public String getStatus(){
		return this.status;
	}
	
	public List<Modalidade> getModalidade(){
		return this.modalidades;
	}
	
	public String getObs(){
		return this.observacoes;
	}	
	
	// fim da classe
}
