package com.controller;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.ThemeParkBean;
import com.service.ThemeParkService;

@Controller
public class ThemeParkController {
	
	@Autowired
	private ThemeParkService themeParkService;
	
	@RequestMapping(value="showpage.html",method=RequestMethod.GET)
	public ModelAndView showPage() {
		return new ModelAndView("bookpage","obj",new ThemeParkBean());
	}
	
	@RequestMapping(value="displayitems.html",method=RequestMethod.GET)
	public ModelAndView displayItems() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("viewItems");
		mav.addObject("rideListobj", themeParkService.getRides());
		mav.addObject("showListobj", themeParkService.getShows());
		return mav;
	}
	
	@ModelAttribute("rideList")
	public Set<String> getRides(){
		Set<String> set= new HashSet<String>();
		set=themeParkService.getRides().keySet();
		return set;
		
	}
	
	@ModelAttribute("showList")
	public Set<String> getshows(){
		Set<String> set= new HashSet<String>();
		set=themeParkService.getShows().keySet();
		return set;
		
	}
	
	@RequestMapping(value="booktickets.html",method=RequestMethod.POST)
	public ModelAndView bookTickets(@Valid @ModelAttribute("obj")ThemeParkBean bean,BindingResult result) {
		ModelAndView mav=new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("bookpage");
		}
		else {
			Double cost = themeParkService.calculateTotalCost(bean);
			mav.setViewName("successpage");
			mav.addObject("message", "Thank you for using our service. you need to pay Rs."+cost+" have a great time");
		}
		return mav;
	}
	
}
