package com.studentems.models;

import java.util.List;

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
    
    //TODO: Create another Method to take the List COllection of scores, Take the Student Name and Print the student name alongside the computed scores.
    //To Learn: StringBuffer in Java and how to append NewLine to a string
    //EG Student Name: Kene
    //Total Scores : 50
    
    //To Learn Map Collection - is a Key/Pair to map a Student ID to respective scores
}
