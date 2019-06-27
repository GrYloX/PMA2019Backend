package pma.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import pma.dto.SportDTO;
import pma.model.Sport;

@Component
public class SportToSportDTOConverter implements Converter<Sport, SportDTO> {

	@Override
	public SportDTO convert(Sport source) {
		if (source == null) {
			return null;
		}

		SportDTO sportDTO = new SportDTO();
		sportDTO.setId(source.getId());
		sportDTO.setName(source.getName());
		return sportDTO;
	}

}
