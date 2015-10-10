
public class Resultado {

	private Integer idResultado;
	private Boolean resultado;
	private String mensaje;
	
	public Resultado(Integer idResultado, Boolean resultado, String mensaje) {
		super();
		this.idResultado = idResultado;
		this.resultado = resultado;
		this.mensaje = mensaje;
	}

	public Integer getIdResultado() {
		return idResultado;
	}

	public void setIdResultado(Integer idResultado) {
		this.idResultado = idResultado;
	}

	public Boolean getResultado() {
		return resultado;
	}

	public void setResultado(Boolean resultado) {
		this.resultado = resultado;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
