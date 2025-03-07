class Book {

public String bookTitle;

public String bookAuthor;

public int bookYearOfPublication;

public void title() {

System.out.println("Book Title");

}

// Method to print book author

public void author() {

System.out.println("Book Year of Publishing");

}

public static void main(String[] args) {

Book book1 = new Book();

book1.bookTitle = "Harry potter and the philosopher stone";

book1.bookAuthor = "J.K.Rowling";

book1.bookYearOfPublication = 1997;

book1.title();

book1.author();

System.out.println("Book title is: " + book1.bookTitle);

System.out.println("Book author is: " + book1.bookAuthor);

System.out.println("Book year of publication is: " + book1.bookYearOfPublication);

Book book2 = new Book();

book2.bookTitle = "Sherlock homes";

book2.bookAuthor = "Sir Arthur Conan Doyle";

book2.bookYearOfPublication = 1892;

book2.title();

book2.author();

System.out.println("Book title is: " + book2.bookTitle);

System.out.println("Book author is: " + book2.bookAuthor);

System.out.println("Book year of publication is: " + book2.bookYearOfPublication);

}

}