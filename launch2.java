  
//import java.util.*;
//
//public class launch2 {
//	public static void main(String args[]){
//		
//	String s1="iNeuron";
//	String s2="";
//		for(int i=(s1.length()-1); i>=0;i--) {
//			s2=s2+s1.charAt(i);
//	}
//		System.out.println(s2);
//		
//	*************************	
//		 
//		String s3="Think Twice";
//		String s4="";
//		String a[]=s3.split("");
//		for(int i=(s3.length()-1); i>=0;i--) {
//			s4=s4+s3.charAt(i);
//		}
//		System.out.println(s4);
//		
//	*************************
//		
//		Scanner sc=new Scanner(System.in);
//		String str1=new String();
//		String str2=new String();
//		System.out.println("Enter Two Strings");  
//		str1=sc.nextLine();
//		str2=sc.nextLine();   
//	    str1 = str1.toLowerCase();  
//	    str2 = str2.toLowerCase();  
//	  
//	          
//	        if (str1.length() != str2.length()) {  
//	            System.out.println("Both the strings are not anagram");  
//	        }  
//	        else {  
//	            
//	            char[] string1 = str1.toCharArray();  
//	            char[] string2 = str2.toCharArray();  
//	  
//	             
//	            Arrays.sort(string1);  
//	            Arrays.sort(string2);  
//	  
//	             
//	            if(Arrays.equals(string1, string2) == true) {  
//	                System.out.println("Both the strings are anagram");  
//	            }  
//	            else {  
//	                System.out.println("Both the strings are not anagram");  
//	            }  
//	        } 
//	   ********************
//	       
//	        		String strr;
//	        		
//	               System.out.println("Enter the string : ");
//	        		strr = sc.nextLine();
//	        		int j = 0;
//	        		char temp = 0;
//	        		char[] chars = strr.toCharArray();
//	        		for (int i = 0; i < chars.length; i++) {
//	        				for (j = 0; j < chars.length; j++) {
//	        						if (chars[j] > chars[i]) {
//	        								temp = chars[i];
//	        								chars[i] = chars[j];
//	        								chars[j] = temp;
//	        						}
//	        				}
//	        		}
//	        	System.out.println("The sorted string is : ");
//	        	for (int i = 0; i < chars.length; i++) {
//	        		System.out.print(chars[i]);
//	        		}
//	        	
//	        	
//	  *******************
//	        	int vCount = 0, cCount = 0;  
//	        	
//	            String str = "This is a really simple sentence";  
//	            
//	            
//	            str = str.toLowerCase();  
//	              
//	            for(int i = 0; i < str.length(); i++) {  
//	                  
//	                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {  
//	                    //Increments the vowel counter  
//	                    vCount=vCount+1;  
//	                }  
//	                //Checks whether a character is a consonant  
//	                else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {    
//	                    //Increments the consonant counter  
//	                    cCount=cCount+1;  
//	                }  
//	            }  
//	            System.out.println("Number of vowels: " + vCount);  
//	            System.out.println("Number of consonants: " + cCount);  
//	        } 
//	
//    *********************
	
//    String str = "Nasir@gmail.com";
//    int upper = 0, lower = 0, number = 0, special = 0;
//
//    for(int i = 0; i < str.length(); i++)
//    {
//        char ch = str.charAt(i);
//        if (ch >= 'A' && ch <= 'Z')
//            upper++;
//        else if (ch >= 'a' && ch <= 'z')
//            lower++;
//        else if (ch >= '0' && ch <= '9')
//            number++;
//        else
//            special++;
//    }
//
//    System.out.println("Lower case letters : " + lower);
//    System.out.println("Upper case letters : " + upper);
//    System.out.println("Number : " + number);
//    System.out.println("Special characters : " + special);
//}
//
//
//	        	}
//	        
//	     	            
//	        
//	     
		
		
		
		
			
		
		
	


