package by.htp.library.run;
import  by.htp.library.entity.Author;
import  by.htp.library.entity.Book;
import  by.htp.library.entity.Library;
import  by.htp.library.librarian.Librarian;

public class MainApp {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
	
		Author a1 = new Author ("���������", "������", "���������", 1799);
		Author a2 = new Author ("������", "������", "�������������", 1895);
		Author a3 = new Author ("���������", "����", "�������������", 1880);
		
		
		Book b1 = new Book (1820,"��������� �������");
	    Book b2 = new Book (1823, "������� ������");
	    Book b3 = new Book (1921,"�������� ��������");
	    Book b4 = new Book (1924,"���� ���������");
	    Book b5 = new Book (1911,"������ ����");
	    Book b6 = new Book (1905,"����� � ���������� ����");
	    
	    b1.addAuthor(a1);
	    b1.addAuthor(a2);
	    b2.addAuthor(a1);
	    b3.addAuthor(a2);
	    b4.addAuthor(a2);
	    b5.addAuthor(a3);
	    b6.addAuthor(a3);
	    
	   
	    Library lib1 = new Library();
	    lib1.addBook(b1);
	    lib1.addBook(b2);
	    lib1.addBook(b3);
	    lib1.addBook(b4);
	    lib1.addBook(b5);
	    lib1.addBook(b6);
	    
	    //System.out.println(a1.getAuthorSurname());
	     
	    Librarian librarian = new Librarian();
	    librarian.printBooksAuthor(lib1, "������");
	     
	    System.out.println("=========================");
	    
	    librarian.printBook(lib1, "������", 1921, "�������� ��������");
	    
	    System.out.println("=========================");
	    
	    librarian.printAllBooks(lib1);
	    
	    System.out.println("=========================");
	    
	    librarian.printOneBook(lib1, "��������� �������");
	}
  
    
}
