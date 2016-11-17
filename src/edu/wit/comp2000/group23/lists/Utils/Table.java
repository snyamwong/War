package edu.wit.comp2000.group23.lists.Utils;

import edu.wit.comp2000.group23.lists.Enums.SUIT;
import edu.wit.comp2000.group23.lists.Exceptions.EmptyDeckException;
import java.util.ArrayList;

//Owner: Jeffrey Conner

public class Table {
	private Card player1;
	private Card player2;
	private Card player3;
	private Card player4;
	private int numberOfPlayers;
	private Pile spoils;
	private int spoilsWinner;
	
	public Table(){
		
	}

	
	public Table(int numOfPlayers){
		numberOfPlayers=numOfPlayers;
		spoils = new Pile();
	}
	
	public Pile getSpoils(){
		return spoils;
		
	}
	
	//Returns true if a winner is determined returns false if a war is required
	
	public int takeTurn(int numOfPlayers){
		if(numOfPlayers==2){
			
			//Player2 wins
			
			if(player1.compareTo(player2)<0){
				return 2;
			}
			
			//Player1 wins
			
			else if(player1.compareTo(player2)>0){
				return 1;
			}	
				//A war:
				
			 else if(player1.compareTo(player2)==0){
				return 0;
			}
		} else if(numOfPlayers==4){
			
			//Player1 wins
			
			if((player1.compareTo(player2)>0) && (player1.compareTo(player3)>0) && (player1.compareTo(player3)>0) && player1.compareTo(player4)>0){
				return 1;
			}
			
			//Player2 wins
			
			else if((player2.compareTo(player1)>0) && (player2.compareTo(player3)>0) && (player2.compareTo(player4)>0)){
				return 2;
			}
			
			//Player3 wins
			
			else if((player3.compareTo(player1)>0) && (player3.compareTo(player2)>0) && (player3.compareTo(player4)>0)){
				return 3;
			}
			
			//Player4 wins
			
			else if((player4.compareTo(player1)>0) && (player4.compareTo(player2)>0) && (player4.compareTo(player3)>0)){
				return 4;
			}
		}
		return 0;
	}
	
}
