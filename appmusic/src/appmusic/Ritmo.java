package appmusic;

@Entity
public class Ritmo {

	@Id
	private Long id;
	private String nome;
	private String maisOuvidas;
	
	public Ritmo(Long id, String nome, String maisOuvidas) {
		this.id = id;
		this.nome = nome;
		this.maisOuvidas = maisOuvidas;
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

	public String getMaisOuvidas() {
		return maisOuvidas;
	}

	public void setMaisOuvidas(String maisOuvidas) {
		this.maisOuvidas = maisOuvidas;
	}
	
	
}
