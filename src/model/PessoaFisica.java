package model;

public class PessoaFisica {
	String nome, endereco, bairro, cidade, uf, telefone, celular, rg, cpf;
	char sexo;
	
	
	// Método GET e SET para nome
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	// Método GET e SET para endereço
	public String getEndereco(){
		return endereco;
	}
		
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	// Método GET e SET para bairro
	public String getBairro(){
		return bairro;
	}
		
	public void setBairro(String bairro){
		this.bairro = bairro;
	}
	
	
	// Método GET e SET para cidade
	public String getCidade(){
		return cidade;
	}
		
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	
	// Método GET e SET para UF
	public String getUF(){
		return uf;
	}
		
	public void setUF(String uf){
		this.uf = uf;
	}
	
	// Método GET e SET para telefone
	public String getTelefone(){
		return telefone;
	}
		
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	// Método GET e SET para telefone
	public String getCelular(){
		return celular;
	}
		
	public void setCelular(String celular){
		this.celular = celular;
	}
	
	// Método GET e SET para Sexo
	public char getSexo(){
		return sexo;
	}
		
	public void setSexo(char sexo){
		this.sexo = sexo;
	}
	
	// Método GET e SET para RG
	public String getRG(){
		return rg;
	}
		
	public void setRG(String rg){
		this.rg = rg;
	}
	
	// Método GET e SET para CPF
	public String getCPF(){
		return cpf;
	}
		
	public void setCPF(String cpf){
		this.cpf = cpf;
	}
	
}
