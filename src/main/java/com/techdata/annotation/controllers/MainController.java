package com.techdata.annotation.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.techdata.annotation.controller.beans.RegistrationForm;
import com.techdata.annotation.model.beans.User;
import com.techdata.annotation.services.MainService;

@Controller
public class MainController {
	
	
	 @Autowired(required = true)
	 MainService mainService;

	@RequestMapping(value="/page", method = RequestMethod.GET)
	protected ModelAndView getPage(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ModelAndView model = new ModelAndView("login");		
		return model;
	}
	
	 @RequestMapping(value = "/register", method = RequestMethod.POST)
	    public ModelAndView register(
	            @ModelAttribute("form") RegistrationForm form,
	            BindingResult bindingResult, Model model, HttpServletRequest request)
	             {
	       
	        User user = form.toUser();
	        System.out.println(user.getUsername()+"  "+user.getPassword());
	        
	        try {
	            mainService.register(user);
	        } catch (Exception e) {
	            System.out.println("Error registring user "+e);
	        }
	        ModelAndView mo = new ModelAndView("session");		
			return mo;

	    }
		
	}