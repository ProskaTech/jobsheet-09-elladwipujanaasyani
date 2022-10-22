// created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package job9;

/**
 *
 * @author Ella Dwipujana Asyani
 */
public class Job93 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String str1, str2;
        str1="Free the bound periodicals.";
        
        str2= str1;
        System.out.println("String 1 : "+ str1);
        System.out.println("String 2 : "+ str2);
        System.out.println("Same Object ? "+ (str1 == str2));
        
        str2 = new String(str1);
        System.out.println("String 1 : "+ str1);
        System.out.println("String 2 : "+ str2);
        System.out.println("Same Object ? "+ (str1 == str2));
        
        System.out.println("Same value? " + str1.equals(str2));
    }
}
