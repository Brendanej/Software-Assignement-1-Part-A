/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brend
 */
public class Module {
    //Initialising Strings and Array
    private String ModuleName;
    private String ID;
    private Student[] Students;
    private String CoursesAssociated;
    //Constructor
    public Module(String ModuleName, String ID, Student[] Students,String CoursesAssociated) {
        this.ModuleName = ModuleName;
        this.ID = ID;
        this.Students = Students;
        this.CoursesAssociated=CoursesAssociated;
    }
    //Getters
    public String getModuleName() {
        return ModuleName;
    }

    public String getCoursesAssociated() {
        return CoursesAssociated;
    }


    public String getID() {
        return ID;
    }

    public Student[] getStudents() {
        return Students;
    }
    
     public String getModuleInfo() {
        String ModuleInfo = ModuleName +  ID +CoursesAssociated;//Making and assigning Module info String.
        return ModuleInfo;
    }
}
