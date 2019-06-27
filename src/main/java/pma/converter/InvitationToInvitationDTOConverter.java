package pma.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import pma.dto.InvitationDTO;
import pma.model.Invitation;

@Component
public class InvitationToInvitationDTOConverter implements Converter<Invitation, InvitationDTO> {

	@Override
	public InvitationDTO convert(Invitation source) {
		if (source == null) {
			return null;
		}

		InvitationDTO invitationDTO = new InvitationDTO();
		invitationDTO.setId(source.getId());
		invitationDTO.setAccepted(source.getAccepted());
		invitationDTO.setReservationId(source.getReservationId());
		invitationDTO.setUserId(source.getUserId());
		return invitationDTO;
	}

}
