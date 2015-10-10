import java.util.*;

public class Venta {

	private Integer idVenta;
	private Date fecha;
	private List <itemVenta> items;
	private Cliente cliente;
	private Estado estado;
	
	public Venta(Integer idVenta, Date fecha, List<itemVenta> items, Cliente cliente, Estado estado) {
		super();
		this.idVenta = idVenta;
		this.fecha = fecha;
		this.items = items;
		this.cliente = cliente;
		this.estado = estado;
	}

	public Integer getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<itemVenta> getItems() {
		return items;
	}

	public void setItems(List<itemVenta> items) {
		this.items = items;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	

}
