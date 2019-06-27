package pma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pma.service.SportCenterService;

@RestController
@RequestMapping(value = "/sportCenter")
public class SportCenterController {
	
	@Autowired
	private SportCenterService sportCenterService;
	
}
