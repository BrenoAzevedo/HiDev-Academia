package Objetos;

import Objetos.*;
import Validadores.*;
import Exception.*;

public class Funcionario extends Pessoa{
	
	Funcionario(String nome, int matricula) {
		super(nome, matricula);
	}

	private String funcao;
	private String formacao;
	private int salario;
	private String dataContratacao;
	
	public void setFuncao(String funcao){
		this.funcao = funcao;
	}
	
	public void setFormacao(String formacao){
		this.formacao = formacao;
	}
	
	public void setSalario(int salario){
		this.salario = salario;
	}
	
	public void setDataContratacao(String data){
		this.dataContratacao = data;
	}
	
	// metodos gets para os atributos
	
	public String getFuncao(){
		return this.funcao;
	}
	
	public String getFormacao(){
		return this.formacao;
	}
	
	public int getSalario(){
		return this.salario;
	}
	
	public String getDataContratacao(){
		return this.dataContratacao;
	}
	
}
