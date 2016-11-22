/*
* Parses a jar file for files that end in .class.
*
* Name:  AppSecTest Programming Challenge v1.0
* Author: Dominic Lewis
* Created: 06/11/2016
* Revised: 17/11/2016 
* Description: Displays the names of all classes found in the provided file "classes.dex"
* Notes: 
 */

package jarparser;

import java.io.*;
import java.util.*;
import java.util.jar.*;
import java.util.Scanner;

public class JarClassParser {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Object currentObj;
        String currentName;
        //Create scanner instance for the System.in
        Scanner scan = new Scanner(System.in);
        //Get the filePath for the JAR
        System.out.printf("\nPlease enter the full file path of the Classes Jar File.\nThe format should be similiar to C:\\\\Users\\\\Default\\\\Desktop\\\\classes-dex2jar.jar\nEnter Here: ");
        String jarPath = scan.nextLine();
        
        //creates an instance of Jarfile from the classes jar name "classJarFile"
        JarFile classJarFile = new JarFile(jarPath);

        //Create a record of the elements from the classFar jar
        Enumeration classFile = classJarFile.entries();

        //Cycle through the elements
        while (classFile.hasMoreElements()) {

            //Set the currentObject to be whatever is available which insures the record is cycled through correctly
            currentObj = classFile.nextElement();
            //Store the currentObj as a string
            currentName = currentObj.toString();
            //Evaluate whether or not the current element is a class or not 
            if (currentName.endsWith(".class")) {
                //Output the class
                System.out.println(currentName);
            }
        }

    }

}
