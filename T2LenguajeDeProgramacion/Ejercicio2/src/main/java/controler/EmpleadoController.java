package controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import modelo.EmpleadoEntity;
import servicio.AreaService;
import servicio.EmpleadoService;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
	@Autowired
	private EmpleadoService empleadoService;
	
	@Autowired
	private AreaService areaService;

	@GetMapping("/")
	public String listarEmpleado(Model model) {
		List<EmpleadoEntity>listaEmpleado = empleadoService.listarEmpleado();
		model.addAttribute("listaempleado", listaEmpleado);
		return "listaempleado";
	}
}
