package pma.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import pma.dto.ReservationDTO;
import pma.model.Reservation;

@Component
public class ReservationToReservationDTOConverter implements Converter<Reservation, ReservationDTO> {

	@Override
	public ReservationDTO convert(Reservation source) {
		if (source == null) {
			return null;
		}

		ReservationDTO reservationDTO = new ReservationDTO();
		reservationDTO.setId(source.getId());
		reservationDTO.setDate(source.getDate());
		reservationDTO.setPrice(source.getPrice());
		reservationDTO.setUserId(source.getUserId());
		reservationDTO.setSportCenterId(source.getSportCenterId());
		reservationDTO.setText(source.getText());
		return reservationDTO;
	}

}
