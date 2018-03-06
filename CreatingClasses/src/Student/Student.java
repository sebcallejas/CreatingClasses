/*
* Sebastian Callejas
* Period 2
* Project: Student
*/

package Student;

/**
 *
 * @author 18051
 */
public class Student {
//Lets get it done
    private int id;
    private int gpa;
    private int gradeLevel;
    
    public Student(int i, int g, int gL){
        id = i;
        gpa = g;
        gradeLevel = gL;
    }
    
    public int getID(){
        return id;
    }
    
    public int getGPA(){
        return gpa;
    }
    
    public int getGradeLevel(){
        return gradeLevel;
    }
    
    public void setID(int pID){
        id = pID;
    }
    
    public void setGPA(int pGPA){
        gpa =pGPA;
    }
    
    public void setGradeLevel(int pGradeLevel){
        gradeLevel = pGradeLevel;
    }
    public String toString(){
        return "Student ID number is: "+id+". Grade level: "+gradeLevel+
                ". GPA: "+gpa+".";
    }
}
