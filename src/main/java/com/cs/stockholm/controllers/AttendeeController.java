package com.cs.stockholm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cs.stockholm.domain.Attendee;
import com.cs.stockholm.services.AttendeeService;

@Controller
public class AttendeeController {
	@Autowired
	private AttendeeService attendeeService;

	@RequestMapping("/")
	public String ViewHomePage() {
		return "index";
	}

	@RequestMapping("/event")
	public String ShowEvnetLink(Model model) {
		Attendee attendee = new Attendee();
		model.addAttribute("attendee", attendee);
		return "event";

	}

	@RequestMapping("/contact")
	public String ContactPage() {
		return "contact";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("attendee") Attendee attendee, BindingResult bindingResult) {
		attendeeService.save(attendee);

		return "redirect:/";
	}

	/*
	 * @PostMapping("/save") public String attendeeValidation1(@Valid Attendee
	 * attendee, BindingResult bindingResult) {
	 * 
	 * if (bindingResult.hasErrors()) {
	 * 
	 * return "event"; }
	 * 
	 * return "redirect:/index"; }
	 */

}
