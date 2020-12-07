package ar.edu.davinci.dvds20202cg1.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ar.edu.davinci.dvds20202cg1.model.Venta;

public interface VentaService {
	
	public List<Venta> listAll();
	public Page<Venta> list(Pageable pageable);
	public Venta findById(Long id);
	public Venta save(Venta venta);
	public void delete(Venta venta);
	public long count();
	public void delete(Long id);

}
