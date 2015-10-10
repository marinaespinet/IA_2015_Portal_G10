
public class Busqueda {

	private Integer idBusqueda;
	private Criterio criterio;
	
	public Busqueda(Integer idBusqueda, Criterio criterio) {
		super();
		this.idBusqueda = idBusqueda;
		this.criterio = criterio;
	}

	public Integer getIdBusqueda() {
		return idBusqueda;
	}

	public void setIdBusqueda(Integer idBusqueda) {
		this.idBusqueda = idBusqueda;
	}

	public Criterio getCriterio() {
		return criterio;
	}

	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}
	
	

}
