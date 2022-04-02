package com.studentems.models;

/**
 *
 * @author STM Developer
 */
public class Course {
    private int id;
    
    public void createClassObj()//does not return a value
    {
        System.out.println("Create Class");
    }
    
    public String getClassNaming() //returns a value
    {
        return "Course";
    }
    
    public long calculateScores(long assessment1, long assessment2)//Same method name, 
    {
        return (assessment1 + assessment2);
    }
    
    public long calculateScores(int test, long exam)//different signature
    {
        return (test + exam);
    }
    
    public long calculateScores(int e, int f)//different signature
    {
        return (e + f);
    }
    
    public Course getInstance()
    {
        return new Course();
    }
    
    public String getGrading(double totalScore)//COnditional statements
    {
        if(totalScore >= 70)
            return "A";
        else if (totalScore >= 60 && totalScore <= 69)
            return "B";
        else if(totalScore == 50)
            return "C";
        else 
            return "F";
    }
}
