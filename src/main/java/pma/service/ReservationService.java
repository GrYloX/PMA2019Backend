package pma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pma.model.Reservation;
import pma.repository.ReservationRepository;

@Service
public class ReservationService {
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	public List<Reservation> findAll(){
		return reservationRepository.findAll();
	}
	public Reservation findById(Long id){
		return reservationRepository.findOne(id);
	}
}
