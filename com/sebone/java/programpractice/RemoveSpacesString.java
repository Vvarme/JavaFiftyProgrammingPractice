	/**
 * 
 */
	package com.sebone.java.programpractice;
	
	/**
	 * class name-RemoveSpacesString 
	 * @author Vinod Varme
	 *objective-main objective of this class is to remove all spaces from string.
	*/
	public class RemoveSpacesString {

		public static void main(String[] args) {
			
			RemoveSpacesString removeSpacesString=new RemoveSpacesString();
			String string="we are the part of sebone technology bangalore";
			String withoutSpace=removeSpacesString.getWithoutSpaceString(string);
			System.out.println("After removing spaces string is:"+withoutSpace);
           
		}
		/**
		 * method name- getWithoutSpaceString
		 * @author Vinod Varme
		 * input parameter-one string
		 * objective-this method removes all spaces present in a give string and return string without spaces.
		*/
		public String getWithoutSpaceString(String string) {
	       String tempString="";
	       String newString="";
			for(int index=0;index<string.length();index++) {
				if(string.charAt(index)!=' ') {
				  	tempString=tempString+string.charAt(index);
				}
				newString=newString+tempString;
				tempString="";
			}
         return newString;
		}
}