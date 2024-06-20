package Problem1;
public class CollegeStudent extends Student{
    protected int MyYear;
    protected String MyMajor;

    public CollegeStudent(String name, int age, String gender, String IdNum, double gpa, int year, String major){
        super(name, age, gender, IdNum, gpa);
        MyYear = year;
        MyMajor = major;
    }

    public void setYear(int year){
        MyYear = year;
    }

    public void setMajor(String major){
        MyMajor = major;
    }

    public int getYear(){
        return MyYear;
    }

    public String getMajor(){
        return MyMajor;
    }

    public String toString(){
        return MyName +", Age: " +MyAge+", Gender: "+MyGender+", Year: "+MyYear+", Major: "+MyMajor+", GPA: "+MyGPA+", Student ID: "+MyIdNum;
    }
}
