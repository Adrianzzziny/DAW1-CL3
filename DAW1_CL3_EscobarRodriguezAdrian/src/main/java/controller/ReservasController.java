package controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import models.Reserva;
import repository.ICarreraRepository;
import repository.IReservaRepository;

@Controller
public class ReservasController {

	@Autowired
	private ICarreraRepository repoc;
	
	@Autowired
	private IReservaRepository repor;
	
	@GetMapping("/reservas/cargar")
	public String abrirpag(Model model) {
		model.addAttribute("pelicula",new Reserva());	
		//Combo Carreras
		model.addAttribute("lstCarreras",repoc.findAll());
		
		return "index";
	}
	
	@PostMapping("/reservas/actualizar")
	public String actualizarpag(@ModelAttribute Reserva reserva, Model model) {
		System.out.println(reserva);
		
		repor.save(reserva);
		model.addAttribute("mensaje","Producto Actualizado");
		
		model.addAttribute("lstCarreras",repoc.findAll());
		
		return "index";
	}
	
	@GetMapping("/reservas/listar")
	public String listadoReservas(Model model) {
		
		model.addAttribute("lstReservas",repor.findAll());
		return "listado";
	}
}
