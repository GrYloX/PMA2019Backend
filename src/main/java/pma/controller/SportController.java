package pma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pma.service.SportService;

@RestController
@RequestMapping(value = "/sport")
public class SportController {
	
	@Autowired
	private SportService sportService;
	
}
