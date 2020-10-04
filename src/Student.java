class Student implements Comparable <Student>{
    private String name;
    private int age,ID;
    private double gpa;

    public Student(String name, int age, int ID, double gpa) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.gpa = gpa;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student k) {
        if (this.getName() == k.getName()){
            return 1;
        }
        else return -1;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", iDNumber = " + ID +
                ", gpa = " + gpa +
                '}';
    }
}