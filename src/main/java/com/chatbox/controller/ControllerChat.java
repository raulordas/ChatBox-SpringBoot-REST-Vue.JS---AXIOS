package com.chatbox.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerChat {
	private String inputAtoB;
	private String inputBtoA;
	
	
	//Método que recibe el mensaje de A como parámetro y se lo asigna al atributo inputAtoB
	@RequestMapping(value = "/atob/{input}", method = RequestMethod.POST)
	public void postAtoB(@PathVariable(value="input") String input) {
	System.out.println(input);
	this.inputAtoB = input;
	}
	
	//Método que retorna el mensaje de A para B
	@RequestMapping(value = "/atob", method = RequestMethod.GET)
	public String getAtoB() {
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return inputAtoB;
	}
	
	//Método que recibe el mensaje de B como parámetro y se lo asigna al atributo inputAtoB
	@RequestMapping(value = "/btoa/{input}", method = RequestMethod.POST)
	public void postBtoA(@PathVariable(value="input") String input) {
	System.out.println(input);
	this.inputBtoA = input;
	}
	
	//Método que retorna el mensaje de B para A
	@RequestMapping(value = "/btoa", method = RequestMethod.GET)
	public String getBtoA() {
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return inputBtoA;
	}
	
}
