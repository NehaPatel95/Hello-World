package algorithmprograms;
import java.util.*;
import java.util.Scanner;
public class TicToc
{
   private static final boolean isEmpty = false;
private static final boolean X = false;
private Object player;

public static void main(String[] args)
     {
	TicToc t = new TicToc();
	Scanner s = new Scanner(System.in);
	    int x=0 , y=0 ; 
	    boolean isEmpty;
		do
	    {
	    	System.out.println( t.player=X?"Player X turn" : "Player O turn");
	    	System.out.println("Enter x and y places");
	    	x=s.nextInt();
	        y=s.nextInt();
	        
	        t.putSign(x,y);
	        System.out.println(t.toString());
	        System.out.println("---------------");
	        t.DisplayWin();
	   }
     
    while(t.isEmpty);

	    }

private void DisplayWin() {
	// TODO Auto-generated method stub
	
}

private void putSign(int x, int y) {
		// TODO Auto-generated method stub
		
	}

class tictoc
{
	public static final int X=1,O=-1;
	public static final int Empty=0;
	public int player=X;
	private int[][] board = new int[3][3];
    public boolean isEmpty = false;
    
    public void putString(int x,int y) 
    {
	
	if(x<0 || x>2 ||  y<0 || y>2)
	System.out.println(" Invalid bord position");
    	return;
    	}
    	public boolean isWin(int player)
{
    return(board[0][0] + board[0][1] + board[0][2] == player*3 ||
    		board[0][0] + board[1][0] + board[2][0] == player*3||
    		board[0][0] + board[1][1] + board[1][2] == player*3||
    		board[2][0] + board[2][1] + board[2][2] == player*3||
    		board[0][2] + board[1][1] + board[2][0] == player*3||
    		board[0][2] + board[1][2] + board[2][2] == player*3||
    		board[0][1] + board[1][1] + board[2][1] == player*3||
    		board[1][0] + board[1][1] + board[1][2] == player*3);		
}

    	
    		public void DisplayWin()
    		{
    		if (isWin(X))
    		System.out.println(" X Player Win");
    		isEmpty=false;
    		{
    		
    		if (isWin(O))
    	{
    		System.out.println("O Player win");
    	}
    		else
    		{
    			if (isEmpty)
    		{
    		System.out.println("Its tie ");
    		}
          }
    	}
    		}
    	  public String toString()
    	  {
    	StringBuilder s = new StringBuilder();
    	      boolean isEmpty=false;
    	{
    	    int j;
			for(int i=0;i<3; i++)
    	    {
    		for(j=0;j<3;j++)
    		{
    	}
    	   int i1;
		switch(board[i1][j])
    	{
    	         case X :
    	         {
    	         s.append("X");
    	         }
    	         break;
    			case O:
    				s.append("O");
    				break;
    	}
    				//{
    		//case isEmpty
    			//	s.append(" ");
    				//isEmpty = true;
    				//break;
    				//}
    				if(j<2) 
    				
    					s.append("|");
    				}
    				break;
    	            }
    			int i;
				if(i<2)
    					{	
    	         s.append("\n ---\n");
    			  }
    			{
    			return s.toString();
    	    }
    	}
    	  }
}
   
	
    	   
    	  

    			
    			
    		
 
			
	
    