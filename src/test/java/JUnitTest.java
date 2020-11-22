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
import org.junit.*;

public class JUnitTest {
    @Test
    public void Main() {
        Student Steven = new Student("Steven Gerrard",36,"15/10/2000",17409224);
        
        Module EEE455 = new Module("EEE455","1",new Student[]{Steven},"None");
        
        Course ECE = new Course("ECE",new Module[]{EEE455},new DateTime("2010-09-12"),new DateTime("2020-06-02"),new Student[]{Steven});
        

        Assert.assertEquals(Steven.getUsername()+EEE455.getModuleInfo()+ECE.getCourseInfo(), Steven.getName() + Steven.getAge()+EEE455.getModuleName()+EEE455.getID()+EEE455.getCoursesAssociated() +ECE.getCourseName()+ECE.getStartDate()+ECE.getEndDate());
    }

}