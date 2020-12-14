/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication89;

/**
 *
 * @author Windows 10
 */
public class assessment_4

{
public boolean endsNg(String str) 
{
int len = str.length();
String ng = "ng";
if (len < 2)
return false;
else if (ng.equals(str.subst­ring(len-2,len)))
return true;
else
return false;
}
public static void main (String[] args)
{
assessment_4 m= new assessment_4();
String str1 = "string";
System.out.println("­The given strings is: "+str1);
System.out.println("­The string containing ng at last: "+m.endsNg(str1));
}
}
    

