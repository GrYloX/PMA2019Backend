package pma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pma.model.User;
import pma.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository UserRepository;
	
	public List<User> findAll(){
		return UserRepository.findAll();
	}
	public User findById(Long id){
		return UserRepository.findOne(id);
	}
}
