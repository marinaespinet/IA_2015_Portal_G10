import java.util.*;

public class Despacho {

	private Integer idDespacho;
	private List<Despacho> ordenesDespacho;
	
	public Despacho(Integer idDespacho, List<Despacho> ordenesDespacho) {
		super();
		this.idDespacho = idDespacho;
		this.ordenesDespacho = ordenesDespacho;
	}

	public Integer getIdDespacho() {
		return idDespacho;
	}

	public void setIdDespacho(Integer idDespacho) {
		this.idDespacho = idDespacho;
	}

	public List<Despacho> getOrdenesDespacho() {
		return ordenesDespacho;
	}

	public void setOrdenesDespacho(List<Despacho> ordenesDespacho) {
		this.ordenesDespacho = ordenesDespacho;
	}

	
	
}
