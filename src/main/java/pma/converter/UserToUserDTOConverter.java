package pma.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import pma.dto.UserDTO;
import pma.model.User;

@Component
public class UserToUserDTOConverter implements Converter<User, UserDTO> {

	@Override
	public UserDTO convert(User source) {
		if (source == null) {
			return null;
		}

		UserDTO userDTO = new UserDTO();
		userDTO.setId(source.getId());
		userDTO.setPoints(source.getPoints());
		userDTO.setCity(source.getCity());
		userDTO.setEmail(source.getEmail());
		userDTO.setFirstname(source.getFirstname());
		userDTO.setLastname(source.getLastname());
		userDTO.setPassword(source.getPassword());
		userDTO.setUsername(source.getUsername());
		return userDTO;
	}

}
