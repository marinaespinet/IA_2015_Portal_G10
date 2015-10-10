
public class Accion {

	private Integer idAccion;
	private AccionRealizada accionRealizada;
	private Integer cantidad;
	private Articulo articulo;
	
	public Accion(Integer idAccion, AccionRealizada accionRealizada, Integer cantidad, Articulo articulo) {
		super();
		this.idAccion = idAccion;
		this.accionRealizada = accionRealizada;
		this.cantidad = cantidad;
		this.articulo = articulo;
	}

	public Integer getIdAccion() {
		return idAccion;
	}

	public void setIdAccion(Integer idAccion) {
		this.idAccion = idAccion;
	}

	public AccionRealizada getAccionRealizada() {
		return accionRealizada;
	}

	public void setAccionRealizada(AccionRealizada accionRealizada) {
		this.accionRealizada = accionRealizada;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	
	

}
