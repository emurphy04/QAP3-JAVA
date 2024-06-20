package Problem1;
public class Person {
    protected String MyName; // Student Name
    protected int MyAge; // Student Age
    protected String MyGender; // Student Gender | M, F, or X

    public Person(String name, int age, String gender){
        MyName = name;
        MyAge = age;
        MyGender = gender;
    }

    public void setName(String name){
        MyName = name;
    }

    public void setAge(int age){
        MyAge = age;
    }

    public void setGender(String gender){
        MyGender = gender;
    }

    public String getName(){
        return MyName;
    }

    public int getAge(){
        return MyAge;
    }

    public String getGender(){
        if(MyGender == "M" || MyGender == "m"){
            return "Male";
        } else if(MyGender == "F" || MyGender == "f"){
            return "Female";
        } else {
            return "Undisclosed";
        }
    }

    public String toString(){
        return MyName +", Age: " +MyAge+", Gender: "+MyGender;
    }
}
