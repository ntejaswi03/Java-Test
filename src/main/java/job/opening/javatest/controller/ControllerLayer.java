package job.opening.javatest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import job.opening.javatest.service.ServiceLayer;

@RestController
@RequestMapping("/javatest")
public class ControllerLayer {
	
	private static final Logger logger = LoggerFactory.getLogger(ControllerLayer.class);
	
	@Autowired
	private ServiceLayer service;
		
	// Palindrome String End Point
	@GetMapping(value="/palindromestring/{userinput}")
	public String palindromeString(@PathVariable("userinput") String userinput) {
		logger.info("UserInput: " + userinput);
		String palindromeSubString = service.palindromeSubString(userinput);
		if(palindromeSubString == null) {
			palindromeSubString = "No palindrome string found.";
		}
        return palindromeSubString;
	}
	
	// Binary Conversion
	@GetMapping(value="/binaryconversion/{userinput}")
	public String binaryConversion(@PathVariable("userinput") String userinput) {
		
		String binaryString = "";
		String binaryResult = "";
		
		if(userinput != null && !userinput.trim().matches("[0-9]+") ){
			binaryResult = "Please enter valid number.";
		}
		else {
			 binaryString = service.tobinary(userinput);
			 int Result=Integer.parseInt(binaryString,2);  
			 binaryResult = Integer.toString(Result);
		}
		
        return binaryResult;
	}
}
