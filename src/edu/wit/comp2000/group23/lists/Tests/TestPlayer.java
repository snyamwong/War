package edu.wit.comp2000.group23.lists.Tests;

import org.junit.Test;

import edu.wit.comp2000.group23.lists.Enums.SUIT;
import edu.wit.comp2000.group23.lists.Utils.Card;
import edu.wit.comp2000.group23.lists.Utils.Hand;
import edu.wit.comp2000.group23.lists.Utils.Pile;
import edu.wit.comp2000.group23.lists.Utils.Player;
import junit.framework.Assert;

public class TestPlayer {
	@Test
	/**
	 * to do later (hand needs to be implemented)
	 */
	public void testPlayer(){
		Player player = new Player(0, new Hand(), new Pile());
		String expected = "Player's playerID: 0 \nPlayer's hand: ";
		Assert.assertEquals(expected, player.toString());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void drawsCard(){
		Player player = new Player(0, new Hand(), new Pile());
		Card c1 = new Card(1, SUIT.Clubs);
		player.addToHand(c1);
		player.drawsCard();
		String expected = c1.toString();
		String actual = player.getCurrentCard().toString();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testShuffle(){
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testPutCardInPile(){
		Player player = new Player(0, new Hand(), new Pile());
		Card c1 = new Card(1, SUIT.Clubs);
		player.setCurrentCard(c1);
		player.putCardInPile();
		boolean playerEmptyHand = player.getHand().isEmpty();
		Assert.assertEquals(true, playerEmptyHand);
	}
}
