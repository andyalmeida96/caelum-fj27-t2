package br.com.alura.forum.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping
	public String index() {
		System.out.println("realmente cheguei no index");

		return "Olá cheguei ao site";
	}

}
