/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brend
 */
import org.joda.time.DateTime;

public class Course {
    private String CourseName;
    private Module[] Modules;
    private DateTime StartDate;
    private DateTime EndDate;
    private Student[] Students;
   
   

    public Course(String CourseName, Module[] Modules, DateTime StartDate, DateTime EndDate,Student[] Students) {
        this.CourseName = CourseName;
        this.Modules = Modules;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.Students = Students;
    }

    public String getCourseName() {
        return CourseName;
    }
    public String getCourseInfo() {
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