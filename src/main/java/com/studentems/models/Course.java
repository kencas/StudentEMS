package com.studentems.models;

import java.util.List;

/**
 *
 * @author STM Developer
 */
public class Course extends BaseModel {
    private int id = 10;
    private String tutor;
    
    public String checkList()
    {
        return "Checklist";
    }
    
    @Override
    public int getId()
    {
        return id + 10;
    }
    
    @Override
    void setId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getTutor(boolean canAccess)//Accessor
    {
        if(canAccess == true)
            return tutor;
        else
            return "";
    }
    
    public void setTutor(String tutor, boolean canSet) //Mutator
    {
        if(canSet)
        this.tutor = tutor;
    }
    
    public void createClassObj()//does not return a value
    {
        System.out.println("Create Class");
    }
    
    public String getClassNaming() //returns a value
    {
        System.out.println("Course");
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
    
    public String getGrading(double totalScore)//Conditional statements
    {
        if(totalScore >= 70) //Condktional + Logical Operators
            return "A";
        else if (totalScore >= 60 && totalScore <= 69)
            return "B";
        else if(totalScore == 50)
            return "C";
        else 
            return "F";
    }
    
    public String getGrading(int totalScore)//Conditional statements
    {
        String gradeScore = "";
        switch(totalScore) //Conditional Operator
        {
            case 10 -> 
            {
                gradeScore = "F";
            }
            
            case 20 -> 
            { 
                gradeScore ="E"; 
            }
            
            default ->
            {
                gradeScore = "PASS";
            }
        }
        
        return gradeScore;
    }
    
    public double computeScores(double[] scores) //Arrays  = 10 , last index = 9
    {
        double computedScores = 0.00;
        
        for(int i=0; i < scores.length; i++)
        {
            computedScores = computedScores + scores[i];
        }
        
        return computedScores;
    }
    
    
    //TODO: Create another Method to take the Array of scores, Take the Student Name and Print the student name alongside the computed scores.
    //To Learn: StringBuffer in Java and how to append NewLine to a string
    //EG Student Name: Kene
    //Total Scores : 50
    
    public double computeScores(List<Double> scores) //Arrays  = 10 , last index = 9
    {
        double computedScores = 0.00;
        
        for(int i=0; i < scores.size(); i++)
        {
            computedScores = computedScores + scores.get(i);
        }
        
        return computedScores;
    }
    public String studentName(String studentName, List<Double> scores)
    {
        //StringBuilder sb = new StringBuilder();
        double totalScore = 0;
        for(int i = 0; i < scores.size(); i++)
        {
           totalScore += scores.get(i);
        }
        return "Student Name:" + studentName + " Scores: " + totalScore;
        
    }
    
    public String studentName(String studentName, List<Double> scores, double basicPassScore)
    {
        //StringBuilder sb = new StringBuilder();
        return "";        
    }
    
    //TODO: Create another Method to take the List COllection of scores, Take the Student Name and Print the student name alongside the computed scores.
    //To Learn: StringBuffer in Java and how to append NewLine to a string
    //EG Student Name: Kene
    //Total Scores : 50
    
    //To Learn Map Collection - is a Key/Pair to map a Student ID to respective scores

    @Override
    public void doWork()
    {
      super.doWork();
      System.out.println("Do work Sub class");
    }
}
