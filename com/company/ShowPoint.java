package com.company;

import java.awt.*;

public class ShowPoint {
    public int point(int x, int y){
        System.out.println("hello");
        Point point1 =new Point(x, y);
        Point point2 = point1;
        System.out.println("Point1: " + point1);
        System.out.println("Point2: " + point2);
        return point1.x;
    }

}
