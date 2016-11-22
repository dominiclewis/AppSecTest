/*
* Name: AppSecTest Programming Challenge
* Author: Dominic Lewis
* Created: 06/11/2016
* Revised: 07/11/2016 - Added Comments
* Description: Displays the names of all methods found in the provided file "classes.dex"
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
        String objectName;
 
        JarFile jarFile = new JarFile("C:\\Users\\Default\\Desktop\\classes-dex2jar.jar");
        Enumeration classFile = jarFile.entries();
 
        while (classFile.hasMoreElements()) {
 
          //  if (jarFile.getName().endsWith(".class")) {
 
                currentObj = classFile.nextElement();
                objectName = currentObj.toString();
                
                if (objectName.endsWith(".class")) {
                    
                   // Enumeration classMethods = currentObj.();
                    Scanner input = new Scanner(JarClassParser.class.getResourceAsStream(currentObj.toString()));
                    System.out.println(input.next());
                }
               // currentClass = classFile.nextElement();
                //currentMethod = Class.forName(name).cast(currentObject);
                //currentClass = currentObj.getClass();
                //currentClass = Class.forName(currentObj);
                /*currentMethod = currentClass.getDeclaredMethods();
                for (int i = 0; i < currentMethod.length; i++) {
                    System.out.println(currentMethod[i].toString());
 
                }*/
 
                System.out.println(objectName);
            }
 
        }
 
    }
