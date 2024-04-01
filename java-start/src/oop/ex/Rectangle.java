package oop.ex;

public class Rectangle {
    int width = 5;
    int height = 8;

    int area = calculate(width, height);

    int calculate(int width, int height){
        return width * height;
    }
    void printArea(int area){
        System.out.println(area);
        return;
    }
}
