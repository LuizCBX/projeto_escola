package br.com.drummond.escola;

public class Aluno {

	public String ra;
	public String nome;
	public String email;
	public String cpf;
	
	public void cadastrar(Aluno aluno) {
		System.out.println("RA="+aluno.ra);
		System.out.println("NOME="+aluno.nome);
		System.out.println("EMAIL="+aluno.email);
		System.out.println("CPF="+aluno.cpf);
	}
	

}
