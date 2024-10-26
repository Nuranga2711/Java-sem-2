public class Student {
    private String name;
    private int age;
    private String address;

    public Student(){
        this.name = "Name";
        this.age = 0;
        this.address = "Address";
    }

    public Student(String name, int age, String addess) {
        this.name = name;
        this.age = age;
        this.address = addess;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }

    public String getAdress() {
        return this.address;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return("Student name is "+ name + " age is "+age+" address is "+address);
    }
}


