package com.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;


public class ThemeParkBean {

	private String rideName;
	private String showName;
	private String isCameraIncluded="no";
	@NotNull(message="may not be null")
	@Range(min=1,max=10,message="range should be between 1 to 10")
	private Integer noOfTickets;
	public String getRideName() {
		return rideName;
	}
	public void setRideName(String rideName) {
		this.rideName = rideName;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getIsCameraIncluded() {
		return isCameraIncluded;
	}
	public void setIsCameraIncluded(String isCameraIncluded) {
		this.isCameraIncluded = isCameraIncluded;
	}
	public Integer getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(Integer noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	
	
}
