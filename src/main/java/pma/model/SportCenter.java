package pma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SportCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 100)
	private String name;
	
	@Column(length = 300)
	private String adress;
	
	@Column(length = 300)
	private String workingHours;
	
	@Column(length = 300)
	private String sports;
	
	@Column
	private Integer image;
	
	
	public SportCenter() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public String getWorkingHours() {
		return workingHours;
	}


	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}


	public String getSports() {
		return sports;
	}


	public void setSports(String sports) {
		this.sports = sports;
	}


	public Integer getImage() {
		return image;
	}


	public void setImage(Integer image) {
		this.image = image;
	}
	
	
	
}
