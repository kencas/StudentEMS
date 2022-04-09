package com.studentems;

import com.studentems.models.Course;
import com.studentems.models.CourseLoader;
import com.studentems.models.Score;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author STM Developer
 */
public class StudentEMS {

    
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Course course1 = new Course(); //Instantiation / user-defined type
        Course course2 = new Course();
        Course course3 = new Course();
        Course course4 = new Course();
        
        CourseLoader loader = new CourseLoader();
        
        Score score = new Score();
        //course1.createClassObj();
        //course2.createClassObj();
        
        //System.out.println(course3.getClassNaming());
        //System.out.println(course4.getGrading(50));
        double[] studentScores = new double[2];//Array is defined before Assignment
        
        studentScores[0]= 2.5;
        studentScores[1]= 4.5;
        //studentScores[2]= 3.5;
        //System.out.println(course4.getGrading(15));
        //System.out.println(course4.computeScores(studentScores));
        
        List<Double> stdScores = new ArrayList<Double>();
        stdScores.add(4.5);
        stdScores.add(4.5);
        stdScores.add(4.5);
        stdScores.add(4.5);
        stdScores.add(4.5);
        stdScores.add(4.5);
        
        //System.out.println(course4.computeScores(stdScores));
        
        
        //System.out.println(course4.studentName("Chinonso",stdScores));
        //course4.setTutor("Chinonso", true);
        //System.out.println(course4.getTutor(true));
        //System.out.println(course4.getId());
        //System.out.println(score.getId());
//        List<String> stdNames = new ArrayList<String>();
//        
//        stdNames.add("Philip");
//        stdNames.add("Kate");
//        stdNames.add("Chike");
//        stdNames.add("Brown");
//        stdNames.add("Daniel");
//        stdNames.add("Jane");
//        
//        
//        for(int a = 0; a < stdNames.size() && a < stdScores.size(); a++)
//        {
//            System.out.println(stdNames.get(a) + " "+ stdScores.get(a));
//            
//        }

course4.doWork();
//loader.getClassNaming();
    }
}
