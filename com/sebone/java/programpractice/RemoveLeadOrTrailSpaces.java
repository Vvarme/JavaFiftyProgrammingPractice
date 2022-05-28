	package com.sebone.java.programpractice;
    
	/**
	 * class name-RemoveLeadOrTrailSpaces 
	 * @author Vinod Varme
	 *objective-main objective of this class is to remove all the lead and trail spaces from string.
	*/
	public class RemoveLeadOrTrailSpaces {

		public static void main(String[] args) {
			RemoveLeadOrTrailSpaces removeSpacesObj=new RemoveLeadOrTrailSpaces();
			
			
			String string="  we are the part of sebone technology bangalore  ";
			String withoutSpace=removeSpacesObj.getRemoveSpacesString(string);
			System.out.println("After removing lead and trail spaces string is:"+withoutSpace);

		}
		/**
		 * method name- getRemoveSpacesString
		 * @author Vinod Varme
		 * input parameter-one string
		 * objective-this method removes all beginning and ending spaces present in a give string and return string without lead and trail spaces.
		*/
		public String getRemoveSpacesString(String string) {
	       String tempString="";
	     //  String newString="";
	       StringBuilder sb=new StringBuilder(" ");
			for(int index=0;index<string.length()-1;index++) {
				if(string.charAt(index)!=' '&& string.charAt(string.length()-index)!=' ') {
				  	tempString=tempString+string.charAt(index);
				}
				//newString=newString+tempString;
				//tempString="";
			}
         return tempString;
		}

	}
	
