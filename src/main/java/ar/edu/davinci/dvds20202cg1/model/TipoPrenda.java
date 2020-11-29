package ar.edu.davinci.dvds20202cg1.model;

/**
 * Tipo de Prendas
 */

public enum TipoPrenda {

	SACO("Saco"),
	PANTALON("Pantalón"),
	CAMISA("Camisa"),
	CAMPERA("Campera"),
	MEDIAS("Medias"),
	TAPADO("Tapado"),
	CHAQUETA("Chaqueta");

	private String descripcion;

	TipoPrenda(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public static TipoPrenda buscar(String descripcion) {
		
		return TipoPrenda.valueOf(descripcion);
	}
}
