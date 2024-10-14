package servicio;

import java.util.List;

import modelo.EmpleadoEntity;

public interface EmpleadoService {
	List<EmpleadoEntity>listarEmpleado();
	void crearEmpleado(EmpleadoEntity empleadoEntity);

}
