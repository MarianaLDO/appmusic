package appmusic;

import java.util.Calendar;

@Entity
public class Comentarios {

	@Id
	private Long id;
	private String usuario;
	private Calendar dataDePostagem;
	private long curtidas;
	private Long perfilId;
	
	
	public Comentarios(Long id, String usuario, Calendar dataDePostagem, long curtidas, Long perfilId) {
		this.id = id;
		this.usuario = usuario;
		this.dataDePostagem = dataDePostagem;
		this.curtidas = curtidas;
		this.perfilId = perfilId;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Calendar getDataDePostagem() {
		return dataDePostagem;
	}

	public void setDataDePostagem(Calendar dataDePostagem) {
		this.dataDePostagem = dataDePostagem;
	}

	public long getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(long curtidas) {
		this.curtidas = curtidas;
	}

	public Long getPerfilId() {
		return perfilId;
	}

	public void setPerfilId(Long perfilId) {
		this.perfilId = perfilId;
	}
	
	
	
}
