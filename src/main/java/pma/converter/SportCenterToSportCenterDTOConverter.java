package pma.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import pma.dto.SportCenterDTO;
import pma.model.SportCenter;

@Component
public class SportCenterToSportCenterDTOConverter implements Converter<SportCenter, SportCenterDTO> {

	@Override
	public SportCenterDTO convert(SportCenter source) {
		if (source == null) {
			return null;
		}

		SportCenterDTO sportCenterDTO = new SportCenterDTO();
		sportCenterDTO.setId(source.getId());
		sportCenterDTO.setAdress(source.getAdress());
		sportCenterDTO.setImage(source.getImage());
		sportCenterDTO.setName(source.getName());
		sportCenterDTO.setWorkingHours(source.getWorkingHours());
		sportCenterDTO.setSports(source.getSports());
		return sportCenterDTO;
	}

}
