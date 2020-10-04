
public class Main {
    public static void main(String []args){

        Student[] students = {
                new Student("Иванов",18,241,4.2),
                new Student("Кузнецов",23, 123,4.6),
                new Student("Воробьёв",19,154,3.7),
                new Student("Петров",21,278,5.0)
        };

        Search search = new Search();
        System.out.println(search.search(students, "Воробьёв").toString()+"\n");//поиск студента
        students = search.sort(students);

        for (Student student : students){
            System.out.println(student.toString());
        }


    }
}