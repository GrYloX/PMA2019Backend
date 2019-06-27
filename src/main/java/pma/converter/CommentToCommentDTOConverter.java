package pma.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import pma.dto.CommentDTO;
import pma.model.Comment;

@Component
public class CommentToCommentDTOConverter implements Converter<Comment, CommentDTO> {

	@Override
	public CommentDTO convert(Comment source) {
		if(source == null){
			return null;
		}
		
		CommentDTO commentDTO = new CommentDTO();
		commentDTO.setId(source.getId());
		commentDTO.setSportCenterId(source.getSportCenterId());
		commentDTO.setUserId(source.getUserId());
		commentDTO.setText(source.getText());
		commentDTO.setCommentDate(source.getText());
		return commentDTO;
	}

	
}
