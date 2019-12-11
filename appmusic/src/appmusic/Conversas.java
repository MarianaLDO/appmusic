package appmusic;

@Entity
public class Conversas {

	@Id
	private Long id;
	private String remetente;
	private String destinatario;
	private long mensagensRecebidas;
	private long mensagensEnviadas;
	
	public Conversas(Long id, String remetente, String destinatario, long mensagensRecebidas, long mensagensEnviadas) {
		this.id = id;
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.mensagensRecebidas = mensagensRecebidas;
		this.mensagensEnviadas = mensagensEnviadas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public long getMensagensRecebidas() {
		return mensagensRecebidas;
	}

	public void setMensagensRecebidas(long mensagensRecebidas) {
		this.mensagensRecebidas = mensagensRecebidas;
	}

	public long getMensagensEnviadas() {
		return mensagensEnviadas;
	}

	public void setMensagensEnviadas(long mensagensEnviadas) {
		this.mensagensEnviadas = mensagensEnviadas;
	}
	
	
	
}
