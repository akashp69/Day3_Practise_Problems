package com.bridgelabz;

public class LineComparison {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        double distance1,distance2;
        x1=1;
        x2=2;
        y1=3;
        y2=4;
        distance1 = Math.sqrt(x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
        System.out.println(" distance1 " + distance1);
        x1=1;
        x2=2;
        y1=3;
        y2=4;
        distance2 = Math.sqrt(x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
        System.out.println(" distance2 " + distance2);
        if(distance1==distance2){
            System.out.println("Two Lines are equal");
        } else if (distance1>=distance2) {
            System.out.println("Line 1 length is Greater than Line 2 length ");
        }
        else
            System.out.println("Line 1 length is smaller than Line 2 length");
    }
}

