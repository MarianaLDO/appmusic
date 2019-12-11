package appmusic;

@Entity
public class Perfil {

	@Id
	private Long id;
	private String nome;
	private int idade;
	private String musicaFavorita;
	private String email;
	private String cantorPreferido;
	private Long cep;
	
	
	public Perfil(Long id, String nome, int idade, String musicaFavorita, String email, String cantorPreferido,
			Long cep) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.musicaFavorita = musicaFavorita;
		this.email = email;
		this.cantorPreferido = cantorPreferido;
		this.cep = cep;
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
	public String getMusicaFavorita() {
		return musicaFavorita;
	}
	public void setMusicaFavorita(String musicaFavorita) {
		this.musicaFavorita = musicaFavorita;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCantorPreferido() {
		return cantorPreferido;
	}
	public void setCantorPreferido(String cantorPreferido) {
		this.cantorPreferido = cantorPreferido;
	}
	public Long getCep() {
		return cep;
	}
	public void setCep(Long cep) {
		this.cep = cep;
	}
	
	
	
}
