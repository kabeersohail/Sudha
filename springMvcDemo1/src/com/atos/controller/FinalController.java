package com.atos.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FinalController {
	@RequestMapping("/final")
	public String finalpage() {
	return "final";

}
}
