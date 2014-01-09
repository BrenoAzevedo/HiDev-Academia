package Objetos;


public class Pessoa {
	
	private String nome;
	private int matricula;
	private String cpf;
	private String sexo;
	private String email;
	private String telefone;
	private String rua;
	private String bairro;
	private String cidade;
	
	//Construtor
	
	Pessoa(String nome, int matricula){
		this.nome = nome;
		this.matricula = matricula;
	}
	
	// metodos set's de todos os atributos
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
	public void setCPF(String cpf){
		this.cpf = cpf;
	}
	
	public void setSexo(String sexo){
		this.sexo =sexo;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public void setRua(String rua){
		this.rua = rua;
	}
	
	public void setBairro(String bairro){
		this.bairro = bairro;
	}
	
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	
	// metodos get's de todos os atributos
	
	public String getNome(){
		return this.nome;
	}
	
	public int getMatricula(){
		return this.matricula;
	}
	
	public String getCPF(){
		return this.cpf;
	}
	
	public String getSexo(String sexo){
		return this.sexo;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public String getTelefone(){
		return this.telefone;
	}
	
	public String getRua(){
		return this.rua;
	}
	
	public String getBairro(){
		return this.bairro;
	}
	
	public String getCidade(){
		return this.cidade;
	}
}
