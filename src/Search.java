public class Search {
    public Student search(Student[] students, String name){
        for (Student student : students){
            if (student.getName() == name){
                return student;
            }
        }
        return null;
    }
    public Student[] sort(Student[] students){
        int min;
        Student temp;
        for (int i= 0; i < students.length-1; i++)
        {
            min = i;
            for (int j = i+1; j < students.length; j++)
                if (students[j].getID() < (students[min]).getID())
                    min = j;
            temp = students[min];
            students[min] = students[i];
            students[i] = temp;
        }
        return students;
    }
}