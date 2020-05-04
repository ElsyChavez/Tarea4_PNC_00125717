package com.uca.capas.tarea4.controller;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.tarea4.domain.Producto;

public class MainController {
	
	@RequestMapping("/producto")
	public ModelAndView producto() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto", new Producto());
		mav.setViewName("producto");
		return mav;
		
	}

	@RequestMapping("/guardar")
	public ModelAndView guardar(@Valid @ModelAttribute Producto producto, BindingResult result) {
		
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName("producto");
		}
		else {
			mav.addObject("product", producto.getNombreP());
			mav.setViewName("result");
		}
		
		return mav;
		
	}
	
}
