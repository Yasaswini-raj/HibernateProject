package com.it.HybernateDemo;

import java.util.Scanner;


public class App 
{
	 public static void main( String[] args )
	    {
	    	
		 AppDao dao = new AppDao();
			
			System.out.println("Welcome....choose Your Option");
			System.out.println("1.Enter Student details\n2.View Student Details\n3.view All Students Data");
			Scanner s= new Scanner(System.in);
			int op=Integer.parseInt(s.nextLine());
			
			switch(op) {
			case 1:System.out.println("Enter Student RollNumber(ex:101,102...integer only)");
			     int id=Integer.parseInt(s.nextLine());
			     System.out.println("Enter Student Name");
			     String name=s.nextLine();
			     System.out.println("Enter Student phn no.");
			     String ph=s.nextLine();
				Student sb = new Student();
				sb.setStudentId(id);
				sb.setStudentName(name);
				sb.setStudentPhoneNumber(ph);
				
				dao.saveStudentData(sb);
				 
				
				break;
			case 2:
				System.out.println("Enter Student id");
				int r=s.nextInt();
				dao.getStudentData(r);
				break;
			case 3:
				dao.getStudentDataBasedonPrimaryKeys();
				break;
				default:System.out.println("Please enter Valid option");
			}
			
			
		 
	    }
}
