package LibraryManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library=new Library();
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("Welcome to the Library Management System\n");
        do{
            System.out.println("\n1. Add Book");
            System.out.println("2. Register User");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. View All Book");
            System.out.println("6. View All Users");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                   System.out.print("Enter book title: ");
                   String bTitle=sc.nextLine();
                   System.out.print("Enter author: ");
                   String bAuthor=sc.nextLine();
                   library.addBook(new Book(bTitle,bAuthor));
                    break;
                case 2:
                    System.out.print("Enter user name: ");
                    String uName=sc.nextLine();
                    System.out.print("Enter user Id: ");
                    int uId=sc.nextInt();
                    sc.nextLine();
                    library.registerUser(new User(uName,uId));
                    break;
                case 3:
                    System.out.print("Enter book title to issue: ");
                    String iTitle=sc.nextLine();
                    System.out.print("Enter User ID: ");
                    int iUserId=sc.nextInt();
                    sc.nextLine();
                    library.issueBook(iTitle,iUserId);
                    break;
                case 4:
                    System.out.print("Enter book title to return: ");
                    String rTitle=sc.nextLine();
                    library.returnBook(rTitle);
                    break;
                case 5:
                    library.showBook();
                    break;
                case 6:
                    library.showUsers();
                    break;
                case 0:
                    System.out.println("Exiting System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid input.Try again.");
            }
        }while (choice !=0);
        sc.close();
    }
}
