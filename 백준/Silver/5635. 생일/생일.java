import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            students.add(new Student(name, day, month, year));
        }

        students.sort((s1, s2) -> {
            if (s1.year != s2.year) {
                return Integer.compare(s1.year, s2.year);
            }
            if (s1.month != s2.month) {
                return Integer.compare(s1.month, s2.month);
            }
            return Integer.compare(s1.day, s2.day);
        });

        System.out.println(students.get(n - 1).name);

        System.out.println(students.get(0).name);
    }
}

class Student {
    String name;
    int day, month, year;

    public Student(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
