package Problem1;
public class Student extends Person {
    protected String MyIdNum;
    protected double MyGPA;

    public Student(String name, int age, String gender, String IdNum, double gpa){
        super(name, age, gender);
        MyIdNum = IdNum;
        MyGPA = gpa;
    }

    public void setGPA(double gpa){
        MyGPA = gpa;
    }

    public void setIdNum(String IdNum){
        MyIdNum = IdNum;
    }

    public double getGPA(){
        return MyGPA;
    }

    public String getIdNum(){
        return MyIdNum;
    }

    public String toString(){
        return MyName +", Age: " +MyAge+", Gender: "+MyGender+", GPA: "+MyGPA+", Student ID: "+MyIdNum;
    }
}
