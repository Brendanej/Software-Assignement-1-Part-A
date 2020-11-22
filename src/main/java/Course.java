/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brend
 */
//importing libraries
import org.joda.time.DateTime;

public class Course {
    //Initialising Strings and Arrays
    private String CourseName;
    private Module[] Modules;
    private DateTime StartDate;
    private DateTime EndDate;
    private Student[] Students;
   
   
    //Constructor
    public Course(String CourseName, Module[] Modules, DateTime StartDate, DateTime EndDate,Student[] Students) {
        this.CourseName = CourseName;
        this.Modules = Modules;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.Students = Students;
    }
    //Getters
    public String getCourseName() {
        return CourseName;
    }
    
    public String getCourseInfo() {
        //Making and assigning CourseInfo String.
        String CourseInfo = CourseName +StartDate +EndDate;
        return CourseInfo;
    }

    public DateTime getStartDate() {
        return StartDate;
    }

    public DateTime getEndDate() {
        return EndDate;
    }


}
