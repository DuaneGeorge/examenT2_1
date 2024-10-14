package servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.AreaEntity;
import repository.AreaRepository;
import servicio.AreaService;

@Service
public class AreaServiceImpl implements AreaService{
	
	@Autowired
	private AreaRepository areaRepository;
	
	@Override
	public List<AreaEntity> listarArea(){
		return areaRepository.findAll();
	}
}
