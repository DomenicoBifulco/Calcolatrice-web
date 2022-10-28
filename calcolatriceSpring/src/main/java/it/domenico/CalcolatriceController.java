package it.domenico;

import java.util.Map;
import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalcolatriceController {
	Calcolatrice cal = new Calcolatrice();
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(@ModelAttribute Calcolatrice cal, Map<String,Object> model) {
		model.put("num1", this.cal.getNum1());
		model.put("num2", this.cal.getNum2());
		this.cal = new Calcolatrice();
		return "calcolatrice";
	}
	
	@RequestMapping(value="/", method = RequestMethod.POST)
	public String homePost(@ModelAttribute Calcolatrice cal, Map<String,Object> model) {
		Scanner sc1 = new Scanner(cal.getNum1());
		Scanner sc2 = new Scanner(cal.getNum1());
		this.cal=cal;
		if(sc1.hasNextInt()==false || sc2.hasNextInt()==false || Integer.parseInt(cal.getNum1())<0 || Integer.parseInt(cal.getNum2())<0)
		{
			return "redirect:/";
		}
		
		return "redirect:risultato";
	}
	
	@RequestMapping(value="/risultato", method=RequestMethod.GET)
	public String submitDati(@Validated @ModelAttribute Calcolatrice cal, BindingResult result, Map<String,Object> model) {
		model.put("num1", this.cal.getNum1());
		model.put("num2", this.cal.getNum2());
		int somma=Integer.parseInt(this.cal.getNum1())+Integer.parseInt(this.cal.getNum2());
		System.out.println(somma);
		model.put("somma", somma);
		return "risultato";
	}

}
