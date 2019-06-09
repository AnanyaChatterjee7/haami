

//***********************************************************************************************************



package com.dineshonjava.controller;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Dinesh Rajput
 *
 */
@Controller

public class HelloWorldController extends Testexternal {
	
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHelloWorld(ModelMap model) {
		
		model.addAttribute("message", "Spring 3.0 MVC Framework Hello World Example!");
		model.addAttribute("auther", "DineshOnJava");
		
		System.out.println("Testing Ananya on Dinesh Project");
		
		return "hello";
	}
	
	 @RequestMapping(value = "/helloc", method = RequestMethod.GET)
	 
	public void TestMethod() {
		 
        System.out.println("This is a new method");
        Testexternal ex=new Testexternal();
        ex.TestExternalmethod();
        // TODO Auto-generated constructor stub
         
    }
	 /*
	 public void TestExternalmethod(){
			System.out.println("This is an external method");
		}
		
		*/
	 
}

//*****************************************************************************************

//NOTES: Method call using controller . we dont create object to call method. we put/define a method directly to call/work.
