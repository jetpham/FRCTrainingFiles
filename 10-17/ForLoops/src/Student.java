/**
 * student
 */
public class Student {
    private String name;
    private double[] grades = new double[6];
    /*
    english
    math
    spanish
    pltw
    science
    history
    */

    public Student(String name,double[] grades){
        this.name = name;
        this.grades = grades;
    }
    public double[] getGrades() {
        return grades;
    }
    public String getName() {
        return name;
    }
    public void setGrades(double grade, int index) {
        this.grades[index] = grade;
    }
}