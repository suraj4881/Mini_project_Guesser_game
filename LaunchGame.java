
import java.util.Scanner;



class Guesser{
	
	int gussNum;
	
	int gussNum(){
		Scanner scan = new 	Scanner (System.in);
		System.out.println("!!!Guesser kindaly guess the number 1 To 100 !!!");
		gussNum =scan.nextInt();
		
		return gussNum;
	}
            
}

class Player1{
	
         int gussNum;
         
	     int gussNum()
	     {
		Scanner scan = new 	Scanner (System.in);
		System.out.println("!Player1 kindaly guess the number!");
		gussNum =scan.nextInt();
		return gussNum;
	}
	     
}

class Player2{
	
    int gussNum;
    
    int gussNum()
    {
	Scanner scan = new 	Scanner (System.in);
	System.out.println("!!Player2 kindaly guess the number!!");
	gussNum =scan.nextInt();
	return gussNum;
}
}

class Player3{
	
    int gussNum;
    
    int gussNum()
    {
	Scanner scan = new 	Scanner (System.in);
	System.out.println("!!!Player3 kindaly guess the number!!!");
	gussNum =scan.nextInt();
	return gussNum;
}
}

class Player4{
	
    int gussNum;
    
    int gussNum()
    {
	Scanner scan = new 	Scanner (System.in);
	System.out.println("!!!!Player4 kindaly guess the number!!!!");
	gussNum =scan.nextInt();
	return gussNum;
}
}

class Umpire{
	boolean flag=false,temp=false,free=false;
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int numFromPlayer4;
	
	 void collectNumFromGuesser(){
		  
		  
		Guesser g= new Guesser();
		numFromGuesser=g.gussNum();
		if(numFromGuesser>=0 && numFromGuesser<=100) {
			System.out.println("!!Enter Valid Guesser number!!");
			System.out.println();
			flag=true;
		}
		else {
			System.out.println("!!!Invalid Guesser Number!!!");
			System.out.println();
			
		}
	}
	 
	
	 void collectNumFromPlayer(){
		 if(flag==true){
		 Player1 p1= new Player1();
		 Player2 p2= new Player2();
		 Player3 p3= new Player3();
		 Player4 p4= new Player4();
		 numFromPlayer1 =p1.gussNum();
		 numFromPlayer2 =p2.gussNum();
		 numFromPlayer3 =p3.gussNum();
		 numFromPlayer4 =p4.gussNum();
	 }
		
	 }
	 
	 
void superOver()
{
	 Player1 p1= new Player1();
	 Player2 p2= new Player2();
	 Player3 p3= new Player3();
	 Player4 p4= new Player4();
		  
	    
		   
			while(temp==true){ 
			
			if(numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer1) 
			{
				numFromPlayer1 =p1.gussNum();
				numFromPlayer3 =p3.gussNum();
				    
				 
				if(numFromGuesser==numFromPlayer3) {
					System.out.println("!!!Player3 Won The Match!!!");
				}
				else {
					System.out.println("!Player1 Won The Match!");
				    
				}
				break;
			}
			else if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer1) {
				numFromPlayer1 =p1.gussNum();
				numFromPlayer2 =p2.gussNum();
				
			if(numFromGuesser==numFromPlayer2) 
			{
					System.out.println("!!Player2 Won The Match!!");
			}
				else {
					System.out.println("!Player1 Won The Match!");
				    
				}
			break;
			}
			else if(numFromGuesser==numFromPlayer4 && numFromGuesser==numFromPlayer1)
			{
				numFromPlayer1 =p1.gussNum();
				numFromPlayer4 =p4.gussNum();
				
				if(numFromGuesser==numFromPlayer4) {
					System.out.println("!!!!Player4 Won The Match!!!!");
				}
				else {
					System.out.println("!!!Player1 Won The Match!!!");
				    
				}
				break;
			}
			else if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) {
				numFromPlayer2 =p2.gussNum();
				numFromPlayer3 =p3.gussNum();
				
				if(numFromGuesser==numFromPlayer2) {
					System.out.println("!!Player2 Won The Match!!");
				}
				else {
					System.out.println("!!!Player3 Won The Match!!!");
				    
				}
				break;
			}
			else if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer4)
			{
				numFromPlayer2 =p2.gussNum();
				numFromPlayer4 =p4.gussNum();
				
				if(numFromGuesser==numFromPlayer2) {
					System.out.println("!!Player2 Won The Match!!");
				}
				else {
					System.out.println("!!!!Player4 Won The Match!!!!");
				    
				}
				break;
			}
			else if(numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4) {
				numFromPlayer3 =p3.gussNum();
				numFromPlayer4 =p4.gussNum();
				
			if(numFromGuesser==numFromPlayer3) {
					System.out.println("!!!Player3 Won The Match!!!");
				}
				else {
					System.out.println("!!!!Player4 Won The Match!!!!");
				   
				}
			 break; 
			}
			
			}
			System.out.println();
			System.out.println("$$Match Was Completed$$");		
			
}
	 
void compare()
{
	      
	if(numFromGuesser==numFromPlayer1 )
	{ 
		while(flag==true) {
		if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4 && temp==false )
		{
			System.out.println("All Player won the game ");
			 break;
			       
		}
		if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3  )
		{
			System.out.println(" !Player1 && !!Player2 && !!!Player3 Win The Game");
			break;
		}
		if(numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4 )
		{
			System.out.println(" !Player1 && !!!Player3 && !!!!Player4 Win The Game");
			break;
			       
		}
		if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer4 )
		{
			System.out.println(" !Player1 && !!Player2 && !!!!Player4 Win The Game");
			break;
		}
		else if (numFromGuesser==numFromPlayer3 )
{
			
			System.out.println("!!!Player1 && Player3 Match Between Tie The Game!!! ");
			      System.out.println();
			      System.out.println("@@Super Over Match Will be Start@@");
				    System.out.println();
				     temp=true;
			          superOver();
			         break;
			          
		}
        else if (numFromGuesser==numFromPlayer2 ) 
        {
			
			System.out.println("!Player1 && !!Player2 Match Between Tie The Game##");
			 System.out.println();
			 System.out.println("@@Super Over Match Will be Start@@");
			    System.out.println();
			    temp=true;
			         superOver();
			        break;
		}
         else if (numFromGuesser==numFromPlayer4  )   {
			
			System.out.println("!Player1 && !!!!Player4 Match Between Tie The Game## ");
			 System.out.println();
			 System.out.println("@@Super Over Match Will be Start@@");
			    System.out.println();
			    temp=true;
			  superOver();
			  break;
		}
         else  {
        	 
		System.out.println("Player1 won the game ");
	      break;
         }
		
		}
	}
	else if(numFromGuesser==numFromPlayer2  ) 
	{ 
		if(numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4  )
		{
			System.out.println(" !!Player2 && !!!Player3 && !!!!Player4 Win The Game");
			       
		}
		if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("!!Player2 && !!!Player3 Match Between Tie The Game## ");
			 System.out.println();
			 System.out.println("@@Super Over Match Will be Start@@");
			    System.out.println();
			    temp=true;
			     superOver();
			
		}
        else if (numFromGuesser==numFromPlayer4  ) {
			
			System.out.println("!!Player2 && !!!!Player4 Match Between Tie The Game## ");
			 System.out.println();
			 System.out.println("@@Super Over Match Will be Start@@");
			    System.out.println();
			    temp=true;
			     superOver();
			 
		}
        else {
        	
		System.out.println("!!Player2 won the game!! ");
	      }
	}
	
	else if(numFromGuesser==numFromPlayer3 ) {
		
		if(numFromGuesser==numFromPlayer4  )
		{
			System.out.println("!!!Player3 && !!!!Player4 Match Between Tie The Game## ");
			 System.out.println();
			 System.out.println("@@Super Over Match Will be Start@@");
			    System.out.println();
			    temp=true;
			     superOver();
			
		}
		else {
			
		System.out.println("!!!Player3 won the game!!! ");
	     
		}
	}
	else if(numFromGuesser==numFromPlayer4 ) 
	{
		System.out.println("!!!!Player4 won the game!!!! ");
	}
	else {
		System.out.println("Game lost!");
		}
	


}
	 
} 
	 
	 


public  class LaunchGame {

	public static void main(String[] args) 
	{
		
         Umpire u=new Umpire();
        
         u.collectNumFromGuesser();
         u.collectNumFromPlayer();
         u.compare();
         u.superOver();
         
         
	}

}




