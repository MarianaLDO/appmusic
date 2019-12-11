package appmusic;

import java.util.ArrayList;

@Entity
public class Cantor {
	
	@Id
	private Long id;
	private String nome;
	private int idade;
	private String albuns;
	
	public Cantor(Long id, String nome, int idade, String albuns) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.albuns = albuns;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getAlbuns() {
		return albuns;
	}

	public void setAlbuns(String albuns) {
		this.albuns = albuns;
	}
	
	
}
