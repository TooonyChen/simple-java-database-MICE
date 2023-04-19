package Class;

public class Person
{
    private int ID;
    private String Name;
    private String Email;

    //constructors
    public Person(int ID, String name, String email)
    {
        this.ID = ID;
        this.Name = name;
        this.Email = email;
    }

    public Person() {
    }
    //getter and setter
    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
