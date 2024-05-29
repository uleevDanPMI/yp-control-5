import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // Сравниваем студентов по баллам
        return student1.getScore() - student2.getScore();
    }
}

public class Student {
    private String name;
    private int score;

    
    
    public int getScore() {
        return score;
    }
}


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Максим", 80);
        Student student2 = new Student("Никита", 90);

        StudentComparator comparator = new StudentComparator();
        int result = comparator.compare(student1, student2);

        if (result < 0) {
            System.out.println(student1.getName() + " имеет меньше баллов, чем " + student2.getName());
        } else if (result > 0) {
            System.out.println(student1.getName() + " имеет больше баллов, чем " + student2.getName());
        } else {
            System.out.println(student1.getName() + " одинаково баллов с" + student2.getName());
        }
    }
}
