package com.schoppen.schoppenerp.control;


import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoppen.schoppenerp.dao.MesasRepository;
import com.schoppen.schoppenerp.model.Mesas;

@Controller
@RequestMapping("/api/mesas")
public class MesasController {

	@Autowired
	private MesasRepository mesasRepo;
	
	/*							U R L S
	 * "/api/mesas" 							.GET 		=>		Todas las mesas
	 * "/api/mesas/[num_mesa]" 					.GET 		=>		Mesa [num_mesa]
	 * "/api/mesas/[num_mesa]"					.DELETE		=>		Borra la [num_mesa]
	 * "/api/mesas/[num_mesa]"					.POST		=>		Nueva mesa
	 * "/api/mesas/[num_mesa]?"		...			.PUT		=>		Da de baja la [num_mesa]
	 */
	
	// Obtener todas las mesas
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Set<Mesas> getAll() {
		return mesasRepo.findAll();
	}	
	
	// Obtener mesa
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Mesas getOne(@PathVariable("id") Long id) {
		return mesasRepo.findOne(id);
	}
	
	// Borrar mesa
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Mesas delete(@PathVariable("id") Long id) {
		Mesas mesa = null;
		try {
			mesa = mesasRepo.findOne(id);
		} catch (Exception ex) {
			return mesa;
		}
		mesasRepo.delete(mesa);
		return mesa;
	}
	
	// Crear nueva mesa
	@RequestMapping(value="/{id}", method = RequestMethod.POST)
	public @ResponseBody Mesas create(@PathVariable("id") Long id){
		Mesas mesa = null;
		try {
			mesa = new Mesas();
			mesa.setNum_mesa(id);
			mesasRepo.save(mesa);
		} catch (Exception ex) {
			return null;
		}
		mesasRepo.delete(mesa);
		return mesa;
	}
	
	
	
	
	// PRUEBA PARA CARGAR IMAGENES
/*	public void pruebaImagen() {
		
		Items item = new Items();
		
		;
		
		try {
			ImageIO.read(item.getOrig_img().getBinaryStream());
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	
}
