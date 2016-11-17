/*
* Name:  AppSecTest Programming Challenge v1.0
* Author: Dominic Lewis
* Created: 06/11/2016
* Revised: 07/11/2016 
* Description: Displays the names of all classes found in the provided file "classes.dex"
*/

package readfromjar;
 
import java.io.*;
import java.util.*;
import java.util.jar.*;
import java.lang.reflect.*;
 
public class ClassGrabber {
 
    public static void main(String[] args) throws IOException, ClassNotFoundException {
 
        Object currentObj;
        Class currentClass;
        Method[] currentMethod;
        
        //creates an instance of Jarfile from the classes jar name "classJarFile"
        JarFile classJarFile = new JarFile("C:\\Users\\domin\\OneDrive - UWE Bristol (Students)\\AST\\dex2jar-2.0\\classes-dex2jar.jar");
        
        Enumeration classFile = classJarFile.entries();
 
        while (classFile.hasMoreElements()) {
 
 
                currentObj = classFile.nextElement();
        
                System.out.println(currentObj);
            }
 
        }
 
    }
 
