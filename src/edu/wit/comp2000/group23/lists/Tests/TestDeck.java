package edu.wit.comp2000.group23.lists.Tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.wit.comp2000.group23.lists.Enums.SUIT;
import edu.wit.comp2000.group23.lists.Exceptions.EmptyDeckException;
import edu.wit.comp2000.group23.lists.Utils.Card;
import edu.wit.comp2000.group23.lists.Utils.Deck;

public class TestDeck {
	Deck d;

	@Before
	public void runBeforeEveryTest() {
		d = new Deck();
	}

	@After
	public void runAfterEveryTest() {
		d = null;
	}

	@Test
	public void TestDeckGetId() {
		assertEquals(2, d.getID());
		d = new Deck();
		assertEquals(3, d.getID());
	}

	@Test
	public void TestDeckDealCard() throws EmptyDeckException {
		Card c = d.deal();
		assertEquals(c.getValue(), 1);
		assertEquals(c.getSuit(), SUIT.Hearts);
	}

	@Test
	public void TestDeckShuffle() throws EmptyDeckException {
		//d.shuffle();
		//Card c = d.deal();
		//Card c2 = d.deal();
		//Card c3 = d.deal();
		
		//Figure out proper assertion for shuffling
		assertEquals(true, true);
	}
}
