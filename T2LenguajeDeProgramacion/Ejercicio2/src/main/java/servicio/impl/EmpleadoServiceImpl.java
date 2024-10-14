package servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.EmpleadoEntity;
import repository.AreaRepository;
import repository.EmpleadoRepository;
import servicio.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	public List<EmpleadoEntity> listarEmpleado() {
		// TODO Auto-generated method stub
		return empleadoRepository.findAll();
	}


	@Override
	public void crearEmpleado(EmpleadoEntity empleadoEntity) {
		// TODO Auto-generated method stub
		empleadoRepository.save(empleadoEntity);
		
	}

	
	
}
