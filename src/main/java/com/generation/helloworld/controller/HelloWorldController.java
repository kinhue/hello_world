package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gen")
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!!!";
	}

	@GetMapping("/bsm")
	public String bsm() {
		return "----MENTALIDADES----\r\n"
				+ "Persistência\r\n"
				+ "Mentalidade de Crescimento\r\n"
				+ "Orientação ao Futuro\r\n"
				+ "Responsabilidade Pessoal\r\n"
				+ "-----------------------------\n"
				+ "HABILIDADES COMPORTAMENTAIS\r\n"
				+ "Trabalho em Equipe\r\n"
				+ "Comunicação e Comunicação Não-Violenta\r\n"
				+ "Atenção para Detalhes\r\n"
				+ "Proatividade\r\n"
				+ "-----------------------------\n"
				+ "HABILIDADES PARA O EMPREGO\r\n"
				+ "Presença Digital e Networking\r\n"
				+ "Desenvolvimento de Carreira\r\n"
				+ "Currículo e Busca de Emprego\r\n"
				+ "Processo Seletivo e Entrevista";
	}
	
	@GetMapping("/obj")
	public String objetivos() {
		return "---Objetivo semanal---\r\n"
				+ "1- Estudar mais a respeito do String e de novos assuntos\r\n"
				+ "2- Aprender sobre o Insomnia\r\n"
				+ "3- Intensificar os estudos com JPA";
		
		}
}


