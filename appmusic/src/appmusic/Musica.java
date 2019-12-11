package appmusic;

@Entity
public class Musica {
	
	@Id
	private Long id;
	private String nome;
	private int vezesEscutadas;
	private String compositor;
	private Long cantorId;
	private Long ritmoId;
	
	public Musica(Long id, String nome, int vezesEscutadas, String compositor, Long cantorId, Long ritmoId) {
		this.id = id;
		this.nome = nome;
		this.vezesEscutadas = vezesEscutadas;
		this.compositor = compositor;
		this.cantorId = cantorId;
		this.ritmoId = ritmoId;
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

	public int getVezesEscutadas() {
		return vezesEscutadas;
	}

	public void setVezesEscutadas(int vezesEscutadas) {
		this.vezesEscutadas = vezesEscutadas;
	}

	public String getCompositor() {
		return compositor;
	}

	public void setCompositor(String compositor) {
		this.compositor = compositor;
	}

	public Long getCantorId() {
		return cantorId;
	}

	public void setCantorId(Long cantorId) {
		this.cantorId = cantorId;
	}

	public Long getRitmoId() {
		return ritmoId;
	}

	public void setRitmoId(Long ritmoId) {
		this.ritmoId = ritmoId;
	}
	
	
}
