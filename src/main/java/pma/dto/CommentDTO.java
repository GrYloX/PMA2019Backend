package pma.dto;

public class CommentDTO {
	private Long id;
	private Long userId;
	private Long sportCenterId;
	private String commentDate;
	private String text;
	
	public CommentDTO() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getSportCenterId() {
		return sportCenterId;
	}

	public void setSportCenterId(Long sportCenterId) {
		this.sportCenterId = sportCenterId;
	}

	public String getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(String commentDate) {
		this.commentDate = commentDate;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	
	
}
