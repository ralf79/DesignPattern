package org.kosta;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(7);
		bookShelf.appendBook(new Book("book1"));
		bookShelf.appendBook(new Book("book2"));
		bookShelf.appendBook(new Book("book3"));
		bookShelf.appendBook(new Book("book4"));
		bookShelf.appendBook(new Book("book5"));
		bookShelf.appendBook(new Book("book6"));
		bookShelf.appendBook(new Book("book7"));
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()){
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
