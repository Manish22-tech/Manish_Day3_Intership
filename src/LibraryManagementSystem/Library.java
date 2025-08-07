package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book>books=new ArrayList<>();
    private List<AbstractPerson>users=new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added:"+book);
    }
    public void registerUser(AbstractPerson person){
        users.add(person);
        person.displayInfo();

    }
    public void issueBook(String title,int userId){
        for(Book book:books){
            if(book.getTitle().equalsIgnoreCase(title)){
                if(!book.isIssued()){
                    book.issueBook();
                    System.out.println("Book '"+title+ " 'issued to User Id: "+ userId);
                }else{
                    System.out.println("Book already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found");
    }
    public void returnBook(String title){
        for(Book book:books){
            if(book.getTitle().equalsIgnoreCase(title)){
                if(!book.isIssued()){
                    book.returnBook();
                    System.out.println("Book '"+title+ " 'returned.");
                }else{
                    System.out.println("Book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found");

        }
        public void showBook(){
        System.out.println("\n All Books:");
        for(Book book:books){
          System.out.println("- "+book);
        }
        }
        public void showUsers(){
        System.out.println("\n Registered Users:");
        for(AbstractPerson person:users){
            person.displayInfo();
        }
        }
}

