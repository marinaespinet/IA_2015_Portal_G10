import java.util.*;

public class OrdenDespacho {

	private Integer idOrdenDespacho;
	private Venta venta;
	private Date fechaDespacho;
	private Estado estado;
	
	public OrdenDespacho(Integer idOrdenDespacho, Venta venta, Date fechaDespacho, Estado estado) {
		super();
		this.idOrdenDespacho = idOrdenDespacho;
		this.venta = venta;
		this.fechaDespacho = fechaDespacho;
		this.estado = estado;
	}

	public Integer getIdOrdenDespacho() {
		return idOrdenDespacho;
	}

	public void setIdOrdenDespacho(Integer idOrdenDespacho) {
		this.idOrdenDespacho = idOrdenDespacho;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Date getFechaDespacho() {
		return fechaDespacho;
	}

	public void setFechaDespacho(Date fechaDespacho) {
		this.fechaDespacho = fechaDespacho;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
}
