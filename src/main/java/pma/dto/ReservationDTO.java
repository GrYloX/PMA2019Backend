package pma.dto;

import javax.persistence.Column;

public class ReservationDTO {
	
	private Long id;
	private Long userId;
	private Long sportCenterId;
	private String date;
	private String text;
	private Double price;
	
	public ReservationDTO() {
		
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
