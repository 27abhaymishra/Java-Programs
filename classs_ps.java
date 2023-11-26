class Libaray{
    String[] books;
    int no_of_books;
    Libaray(){
        this.books= new String[100];
        this.no_of_books=0;
    }
    void addBook(String book)
    {
        this.books[no_of_books]= book;
        no_of_books++;
        System.out.println(book+" has been added!");
    }
    void showAvailableBooks(){
        System.out.println("Available Books are:");
        for (String book: this.books
             ) {
            if (book == null) {
                continue;
            }
            System.out.println("* "+ books);
        }
    }
    void issueBook(String books){
        for (int i = 0; i <this.books.length ; i++) {
            if (this.books[i].equals(books) ) {
                System.out.println("The book has been issued!");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }
    void returnBook(String books){
        addBook(books);
    }
}


public class classs_ps {
    public static void main(String[] args) {
        Libaray centralLibaray= new Libaray();
        centralLibaray.addBook("Think and Grow Rich");
        centralLibaray.addBook("Algorthims");
        centralLibaray.addBook("C++");
        centralLibaray.showAvailableBooks();


        centralLibaray.issueBook("C++");
        centralLibaray.showAvailableBooks();
        centralLibaray.returnBook("C++");
        centralLibaray.showAvailableBooks();
    }
}
