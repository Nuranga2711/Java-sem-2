public class Book{
	private String name; //name of the book
	private Author author; //we insert the author class here
	private double price; //price of the book
	private int quantity;
	
	//we don't write default constructor here because there are no books without these variables
	
	public Book(String name, Author author, double price, int quantity){
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName(){
		return this.name;
	}
	public Author getAuthor(){
		return this.author;
	}
	public double getPrice(){
		return this.price;
	}
	public int getQuantity(){
		return this.quantity;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	//here we include "author", it is connected to the toString method in "Author" class !
	public String toString(){
		return ("Book Name : "+this.name+ '\n' + "Author : "+author+ '\n' + "Price : " + price + '\n' + "Quantity : " + quantity);
	}
}