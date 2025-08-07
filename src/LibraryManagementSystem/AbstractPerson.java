package LibraryManagementSystem;

public  abstract class AbstractPerson {
    protected String name;
    protected int id;

    public  AbstractPerson(String name,int id){
        this.name=name;
        this.id=id;

    }

    public abstract  void displayInfo();

    public int getId(){
        return id;
    }
}
