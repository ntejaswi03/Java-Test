package job.opening.javatest.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {
	
	private static final Logger logger = LoggerFactory.getLogger(ServiceLayer.class);
    
    public String palindromeSubString(String input){
    	
    	logger.info("User entered String: " + input);
        int len = input.length();
        int maxLen = 1;
        String longestSubString = null;
        
        boolean [][] dp = new boolean[len][len];
    	   
    	    for(int l=0; l<input.length(); l++){
    	        for(int i=0; i<len-l; i++){
    	            int j = i+l;
    	            if(input.charAt(i)==input.charAt(j) && (j-i<=2||dp[i+1][j-1])){
    	                dp[i][j]=true;
    	 
    	                if(j-i+1>maxLen){
    	                   maxLen = j-i+1; 
    	                   longestSubString = input.substring(i, j+1);
    	                }
    	            }
    	        }
    	    }
    	    
    	    // We can repository here to save sub string in DB
    	    // repository.addPalindromicStringToDB(longestSubString);
    	    
    	    return longestSubString;
        }


	public String tobinary(String input) {
		
		int userInput=Integer.parseInt(input);  
		String s= String.format("%8s", Integer.toBinaryString(userInput)).replace(" ", "0");
		
		String output = "";
		for (int i = s.length() - 1; i >= 0; i--) {
	        output = output + s.charAt(i);
	    }	

		return output;
	}
	
}