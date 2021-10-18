/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Classroom mariesClassroom = new Classroom(27);
        System.out.println("Name of the 14th student is: " + mariesClassroom.getStudent(13).getName());
        System.out.println("History grade of the 14th student: " + mariesClassroom.getStudent(13).getGrades()[5]);
    }
}