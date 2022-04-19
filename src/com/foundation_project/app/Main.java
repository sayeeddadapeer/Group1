package com.foundation_project.app;
import java.util.Scanner;
//import com.foundation_project.sql_configuration.MySqlAccess;
import com.revature.foundation_project.doa.Admin;
import com.revature.foundation_project.menu.Menu;

public class Main {

	public static void main(String[] args) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		 
		 //MySqlAccess sql=new MySqlAccess();
		Admin admin=new Admin();
		
		int flag=0;
		
		do
		{
			
			if(flag==0) 
			{
				System.out.print("\nEnter LoginID: ");
				String loginId=scan.next();
				System.out.print("\nEnter Password: ");
				String password=scan.next();
				
				if(admin.checkLogin(loginId,password)) 
				{
					flag=1;
				}
				else 
				{
					System.out.println("Sorry! Invalid UserId (or) Password");
					continue;
				}
			}
			
			Menu.mainMenu();
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			admin.addNewUser();
			break;
		case 2:
			admin.updateUser();
			break;
		case 3:
			admin.removeUser();
			break;
		case 4:
			admin.displayUser();
			break;
		case 5:
			System.exit(0);
		default:
			System.out.println("Sorry, I can't get you.....!   :( ");
			break;
			
		}
	}while(true);
	}
	
		
	
}
