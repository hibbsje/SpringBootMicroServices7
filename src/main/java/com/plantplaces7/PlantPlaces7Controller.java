package com.plantplaces7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PlantPlaces7Controller {
	
	/** 
	 * Handle The /start endpoint
	 * @return
	 */
	@RequestMapping("/start")
	public String start() {
		return "start";
	}
	

	@RequestMapping("/")
	public String index() {
		return "start";
	}

}
