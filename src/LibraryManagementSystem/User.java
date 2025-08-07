package LibraryManagementSystem;

public class User extends AbstractPerson {
    public User(String name,int id){
        super(name,id);
    }
    public void displayInfo(){
        System.out.println("User:"+name+" (ID: "+id+")");

    }

}
