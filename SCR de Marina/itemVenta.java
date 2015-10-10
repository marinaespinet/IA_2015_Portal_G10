
public class itemVenta {

	private Integer idItemVenta;
	private Articulo articulo;
	private Float precio;
	private Integer cantidad;
	private Estado estado;
	
	public itemVenta(Integer idItemVenta, Articulo articulo, Float precio, Integer cantidad, Estado estado) {
		super();
		this.idItemVenta = idItemVenta;
		this.articulo = articulo;
		this.precio = precio;
		this.cantidad = cantidad;
		this.estado = estado;
	}

	public Integer getIdItemVenta() {
		return idItemVenta;
	}

	public void setIdItemVenta(Integer idItemVenta) {
		this.idItemVenta = idItemVenta;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	

}
