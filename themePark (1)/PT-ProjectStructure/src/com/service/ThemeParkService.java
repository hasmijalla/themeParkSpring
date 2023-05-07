package com.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.model.ThemeParkBean;

@Service
public class ThemeParkService {
	
	private static Map<String, Double> rides=new HashMap<String,Double>();
	private static Map<String,Double> shows=new HashMap<String,Double>();
	public Map<String, Double> getRides() {
		Rides();
		return rides;
	}
	public Map<String, Double> getShows() {
		Shows();
		return shows;
	}
	
	public Double calculateTotalCost(ThemeParkBean themeParkBean) {
		Integer tickets=themeParkBean.getNoOfTickets();
		Double ride=rides.get(themeParkBean.getRideName());
		Double show=shows.get(themeParkBean.getShowName());
		if(themeParkBean.getIsCameraIncluded().equals("yes")) {
			return tickets*(ride+show)+500.0;
			
		}
		
		else{
			return tickets*(ride+show);
		}
		
	}
	
	static void Rides() {
		rides.put("tilt-a-whirl", 500.0);
		rides.put("Scrambler", 600.0);
		rides.put("spinning TeaCups", 450.0);
		rides.put("Flying bobs", 550.0);
	}
	static void Shows() {
		shows.put("Fantasmic", 700.0);
		shows.put("WaterWorld", 650.0);
		shows.put("Festival of the lion King",550.0);
		shows.put("Rivers Of the light", 500.0);
	}
	
}
