import java.util.Date;

public class Articulo {
	
		private Integer idArticulo;
		private String nombre;
		private String marca;
		private String origen;
		private String fichaTecnica;
		private String urlFoto;
		private String descripcion;
		private Float precio;
		private Date fechaAlta;
		private Categoria categoria;
		private Integer stock;
		private Integer ranking;
		
		public Integer getIdArticulo() {
			return idArticulo;
		}

		public void setIdArticulo(Integer idArticulo) {
			this.idArticulo = idArticulo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getOrigen() {
			return origen;
		}

		public void setOrigen(String origen) {
			this.origen = origen;
		}

		public String getFichaTecnica() {
			return fichaTecnica;
		}

		public void setFichaTecnica(String fichaTecnica) {
			this.fichaTecnica = fichaTecnica;
		}

		public String getUrlFoto() {
			return urlFoto;
		}

		public void setUrlFoto(String urlFoto) {
			this.urlFoto = urlFoto;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public Float getPrecio() {
			return precio;
		}

		public void setPrecio(Float precio) {
			this.precio = precio;
		}

		public Date getFechaAlta() {
			return fechaAlta;
		}

		public void setFechaAlta(Date fechaAlta) {
			this.fechaAlta = fechaAlta;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}

		public Integer getStock() {
			return stock;
		}

		public void setStock(Integer stock) {
			this.stock = stock;
		}

		public Integer getRanking() {
			return ranking;
		}

		public void setRanking(Integer ranking) {
			this.ranking = ranking;
		}

		public Articulo(Integer idArticulo, String nombre, String marca, String origen, String fichaTecnica,
				String urlFoto, String descripcion, Float precio, Date fechaAlta, Categoria categoria, Integer stock,
				Integer ranking) {
			super();
			this.idArticulo = idArticulo;
			this.nombre = nombre;
			this.marca = marca;
			this.origen = origen;
			this.fichaTecnica = fichaTecnica;
			this.urlFoto = urlFoto;
			this.descripcion = descripcion;
			this.precio = precio;
			this.fechaAlta = fechaAlta;
			this.categoria = categoria;
			this.stock = stock;
			this.ranking = ranking;
		}


}
