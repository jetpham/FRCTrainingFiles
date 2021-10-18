
/**
 * classroom
 */
import java.util.Random;

public class Classroom {
    private Student[] students;

    public double generateRandomGrade() {
        return Math.random() * 4;
    }

    public String generateRandomString() {
        // create a string of all characters
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 7;

        for (int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(alphabet.length());

            // get character specified by index
            // from the string
            char randomChar = alphabet.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }

        return sb.toString();
    }

    public Classroom(int classroomPopulation) {
        students = new Student[classroomPopulation];
        for (int i = 0; i < students.length; i++) {
            double[] gradesList = new double[6];
            for (int j = 0; j < gradesList.length; j++) {
                gradesList[j] = generateRandomGrade();
            }
            students[i] = new Student(generateRandomString(), gradesList);
        }
    }

    public Student getStudent(int index) {
        return students[index];
    }
}