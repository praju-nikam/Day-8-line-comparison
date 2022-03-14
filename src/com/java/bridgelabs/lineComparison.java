package com.java.bridgelabs;

import java.util.Scanner;

public class lineComparison
{
    /*
    Use case 1 Distance Between Two points
     */
    public void distanceBetweenPoint()
    {

        int x1,x2,y1,y2;
        double distanceXY;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter x1 point");
        x1=scanner.nextInt();

        System.out.println("Enter y1 point");
        y1=scanner.nextInt();

        System.out.println("Enter x2point");
        x2=scanner.nextInt();

        System.out.println("Enter y2 point");
        y2=scanner.nextInt();

        distanceXY=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.println("Distance Between XY : "+"("+x1+","+y1+"),"+"("+x2+","+y2+")===> "+distanceXY);

    }

    /*
       Use case 2 Two lines are Equal or not
    */
    public void twoLinesEqualOrNot()
    {
        int x1,x2,y1,y2;
        int m1,m2,n1,n2;
        double distanceXY;
        double distanceMN;

        Scanner scanner=new Scanner(System.in);
        // Enter point line 1
        System.out.println("Enter x1 point");
        x1=scanner.nextInt();

        System.out.println("Enter y1 point");
        y1=scanner.nextInt();

        System.out.println("Enter x2point");
        x2=scanner.nextInt();

        System.out.println("Enter y2 point");
        y2=scanner.nextInt();

        distanceXY=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Distance Between XY : "+"("+x1+","+y1+"),"+"("+x2+","+y2+")===> "+distanceXY);
        String  string1 = distanceXY+ "";

        //Enter point line 2
        System.out.println("Enter m1 point");
        m1=scanner.nextInt();

        System.out.println("Enter n1 point");
        n1=scanner.nextInt();

        System.out.println("Enter m2point");
        m2=scanner.nextInt();

        System.out.println("Enter n2 point");
        n2=scanner.nextInt();

        distanceMN=Math.sqrt((m2-m1)*(m2-m1) + (n2-n1)*(n2-n1));
        System.out.println("Distance Between MN : "+"("+m1+","+n1+"),"+"("+m2+","+n2+")===> "+distanceMN);
        String string2 = distanceMN+ "";

        if(string1.equals(string2))
        {
            System.out.println(" Lines are Equals");
        }
        else
        {
            System.out.println("Lines are Not Equals");
        }
    }

    /*
     Use case 3 Line is Greater Or Less than other line
    */
    public void lineIsGreaterOrLessThan()
    {
        int x1,x2,y1,y2;
        int m1,m2,n1,n2;
        double distanceXY;
        double distanceMN;

        Scanner scanner=new Scanner(System.in);
        // Enter point line 1
        System.out.println("Enter x1 point");
        x1=scanner.nextInt();

        System.out.println("Enter y1 point");
        y1=scanner.nextInt();

        System.out.println("Enter x2point");
        x2=scanner.nextInt();

        System.out.println("Enter y2 point");
        y2=scanner.nextInt();

        distanceXY=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Distance Between XY : "+"("+x1+","+y1+"),"+"("+x2+","+y2+")===> "+distanceXY);
        String string1 = distanceXY+ "";

        //Enter point line 2
        System.out.println("Enter m1 point");
        m1=scanner.nextInt();

        System.out.println("Enter n1 point");
        n1=scanner.nextInt();

        System.out.println("Enter m2point");
        m2=scanner.nextInt();

        System.out.println("Enter n2 point");
        n2=scanner.nextInt();

        distanceMN=Math.sqrt((m2-m1)*(m2-m1) + (n2-n1)*(n2-n1));
        System.out.println("Distance Between MN : "+"("+m1+","+n1+"),"+"("+m2+","+n2+")===> "+distanceMN);
        String string2 = distanceMN+ "";

        int result = string1.compareTo(string2);
        if(result == 0)
        {
            System.out.println(" Lines are Equals");
        }
        else if(result >= 1)
        {
            System.out.println("Line XY is Greater");
        }
        else
        {
            System.out.println("Line MN is Greater");
        }

    }

    /*
      Use case 4 Concepts of Line and Point as well as equals and
     compareTo methods. Using Java compareTo method to compare 2 Lengths is preferable
    */

    public void compareToMethods()
    {

    }

    public  static void main(String args[])
    {
        lineComparison linecomparison = new lineComparison();
        System.out.println("*-*-*-*-*- Wel come to line Comparison Computation -*-*-*-*-*");
        // linecomparison.distanceBetweenPoint();
        // linecomparison.twoLinesEqualOrNot();
       // linecomparison.lineIsGreaterOrLessThan();
          linecomparison.compareToMethods();
    }
}
