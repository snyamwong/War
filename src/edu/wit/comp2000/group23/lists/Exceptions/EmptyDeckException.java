package edu.wit.comp2000.group23.lists.Exceptions;

public class EmptyDeckException extends Exception {
	/**
	 * I don't know what this is but Eclipse forced me to add it?
	 */
	private static final long serialVersionUID = 1L;
	public EmptyDeckException(){
		super();
	}
	public EmptyDeckException(String message){
		super(message);
	}
}
