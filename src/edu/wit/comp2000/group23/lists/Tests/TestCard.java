package edu.wit.comp2000.group23.lists.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.wit.comp2000.group23.lists.Enums.SUIT;
import edu.wit.comp2000.group23.lists.Utils.Card;

public class TestCard {

	private Card c;

	@Before
	public void runBeforeEveryTest() {
		c = new Card(4, SUIT.Clubs);
	}

	@After
	public void runAfterEveryTest() {
		c = null;
	}

	@Test
	public void TestCardGetValue() {
		assertEquals(4, c.getValue());
	}

	@Test
	public void TestCardGetSuit() {
		assertEquals(SUIT.Clubs, c.getSuit());
	}

	@Test
	public void TestCardToString() {
		assertEquals("4 of Clubs", c.toString());
	}

	@Test
	public void TestCardToStringRoyalty() {
		c = new Card(11, SUIT.Clubs);
		assertEquals("Jack of Clubs", c.toString());
		c = new Card(12, SUIT.Clubs);
		assertEquals("Queen of Clubs", c.toString());
		c = new Card(13, SUIT.Clubs);
		assertEquals("King of Clubs", c.toString());
		c = new Card(1, SUIT.Spades);
		assertEquals("Ace of Spades", c.toString());
	}

	@Test
	public void TestCardToStringFormatted() {
		assertEquals("4C", Card.toStringFormatted(c));
		c = new Card(12, SUIT.Diamonds);
		assertEquals("QD", Card.toStringFormatted(c));
	}
}
