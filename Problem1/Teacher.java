package Problem1;
public class Teacher extends Person{
    protected String MySubject;
    protected double MySalary;

    public Teacher(String name, int age, String gender, String subject, double salary){
        super(name, age, gender);
        MySubject = subject;
        MySalary = salary;
    }

    public void setSalary(double salary){
        MySalary = salary;
    }

    public void setSubject(String subject){
        MySubject = subject;
    }

    public double getSalary(){
        return MySalary;
    }

    public String getSubject(){
        return MySubject;
    }

    public String toString(){
        return MyName +", Age: " +MyAge+", Gender: "+MyGender+", Salary: "+MySalary+", Subject: "+MySubject;
    }
}
