class Employees{
    int id;
    String name;
    double salary;
    public Employees() {
        id =  12;
        name = "Taimoor";
        salary = 0.8;
    }
    public Employees(int myId) {
        id =  myId;
        name = "Taimoor";
        salary = 0.8;
    }
    public Employees(int myId,String myName) {
        id = myId ;
        name = myName;
        salary = 0.8;
    }
    public Employees(int myId,String myName,double mySalary) {
        id = myId ;
        name = myName;
        salary = mySalary;
    }
    public Employees(String myName) {
        id =  12;
        name = myName;
        salary = 0.8;
    }
    public Employees(double mySalary) {
        id =  12;
        name = "Taimoor";
        salary = mySalary;
    }
}

public class Constructors {

    public static void main(String[] args) {
        Employees Taimoor = new Employees(2101235,"Taimoor",0.8);
 //       System.out.println(emp.Employees());
        System.out.print("I am "+Taimoor.name);
        System.out.print(", my employee ID is "+Taimoor.id);
        System.out.println(" and my monthly salary is "+Taimoor.salary+"M.");
        Employees Zoona = new Employees(2100901,"Zoona",2);
        System.out.print("I am "+Zoona.name);
        System.out.print(", my employee ID is "+Zoona.id);
        System.out.println(" and my monthly salary is "+Zoona.salary+"M.");

        Employees Adnan = new Employees(2101186,"Adnan",.02);
        System.out.print("I am "+Adnan.name);
        System.out.print(", my employee ID is "+Adnan.id);
        System.out.println(" and my monthly salary is "+Adnan.salary+"M.");
    }
}
