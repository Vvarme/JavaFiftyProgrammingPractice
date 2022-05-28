/**
 * 
 */
	package com.sebone.java.exception;

	/**
	 * @author Vinod Verme
	 *
	*/
	public class MyData {
		int myId;
		String myName;
		int myAge;
		
		/**
		 * @return the myId
		 */
		public int getMyId() {
			return myId;
		}
		/**
		 * @param myId the myId to set
		 */
		public void setMyId(int myid) {
			this.myId = myid;
		}
		/**
		 * @return the myName
		 */
		public String getMyName() {
			return myName;
		}
		/**
		 * @param myName the myName to set
		 */
		public void setMyName(String myname) {
			this.myName = myname;
		}
		/**
		 * @return the myAge
		 */
		public int getMyAge() {
			return myAge;
		}
		/**
		 * @param myAge the myAge to set
		 */
		public void setMyAge(int myage)throws AgeOutOfBoundException {
			if(myage>18) {
				throw new AgeOutOfBoundException("age should be less than 18");
			}
			this.myAge = myage;
		}
		
		
	}
