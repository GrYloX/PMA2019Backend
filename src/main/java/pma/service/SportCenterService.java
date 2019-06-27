package pma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pma.model.SportCenter;
import pma.repository.SportCenterRepository;

@Service
public class SportCenterService {
	
	@Autowired
	private SportCenterRepository SportCenterRepository;
	
	public List<SportCenter> findAll(){
		return SportCenterRepository.findAll();
	}
	public SportCenter findById(Long id){
		return SportCenterRepository.findOne(id);
	}
}
