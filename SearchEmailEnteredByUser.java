package xyz;
import java.util.Scanner;
	public class SearchEmailEnteredByUser {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			   String Arr[]= {"Aishwarya117@gmail.com", "kiran117@gmail.com","Shruti117@gmail.com"};
			     String input; 
			     boolean flag=true;
			     try (Scanner sc1 = new Scanner(System.in)) {
					System.out.println("Please Enter An Email");
					 input=sc1.nextLine();
				}
			     for(int i=0;i<Arr.length;i++) {
			    	 if(Arr[i].equals(input)) {
			    		 System.out.println("Present in array");
			    		 flag=false;
			    	 }}
			     if (flag) {
			    	 System.out.println("Not Present in array");
			    	 }

		}

	}


	

	


	