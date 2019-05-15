/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Tania
 */
public class StudentTester {
    public static void main(String[] args) {
        // TODO code application logic hereString 
        
        Student s1= new Student("Tania");
        //s1.setName("Tania");
        //System.out.println(s1.getName());
        
        Student s2= new Student("Daniel");
        Student s3= new Student("Arsh");
        //s1.setName("Tania");
        
        
        Student[] list= new Student[3];// arrays of object
        list[0]= s1;
        list[1]= s2;
        list[3]= s3;
        
        for (int i=0; i<list.length; i++){
        System.out.println(list[i].getName());
        }
        
    
    }

    /**
     * @return the name
     */
    
}
