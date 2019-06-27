package pma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pma.model.Sport;
import pma.repository.SportRepository;

@Service
public class SportService {
	
	@Autowired
	private SportRepository SportRepository;
	
	public List<Sport> findAll(){
		return SportRepository.findAll();
	}
	public Sport findById(Long id){
		return SportRepository.findOne(id);
	}
}
