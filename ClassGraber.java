/*
* Name:  AppSecTest Programming Challenge v1.0
* Author: Dominic Lewis
* Created: 06/11/2016
* Revised: 07/11/2016 
* Description: Displays the names of all classes found in the provided file "classes.dex"
*/

package jarparser;
 
import java.io.*;
import java.util.*;
import java.util.jar.*;
import java.lang.reflect.*;
 
public class JarClassParser {
 
    public static void main(String[] args) throws IOException, ClassNotFoundException {
 
        Object currentObj;
        Class currentClass;
        Method[] currentMethod;
        String currentName;
        
        //creates an instance of Jarfile from the classes jar name "classJarFile"
        JarFile classJarFile = new JarFile("C:\\Users\\Default\\Desktop\\classes-dex2jar.jar");
        
        Enumeration classFile = classJarFile.entries();
 
        while (classFile.hasMoreElements()) {
 
 
                currentObj = classFile.nextElement();
                //Store the currentObj as a string
                currentName = currentObj.toString();
               if(currentName.endsWith(".class")){
                System.out.println(currentObj);
               }
            }
 
        }
 
    }
