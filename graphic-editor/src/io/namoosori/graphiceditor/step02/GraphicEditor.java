package io.namoosori.graphiceditor.step02;

import javax.annotation.processing.RoundEnvironment;

public class GraphicEditor {
    private static final int ARRAY_LENGTH = 10;

    public static void main(String[] args) {
        Shape[] shapes = new Shape[ARRAY_LENGTH];

        // Generate Shapes
        for (int i = 0; i < ARRAY_LENGTH; i++){
            int randomNumber = (int)(Math.random() * 3);

           if (randomNumber == 0){
               shapes[i] = new Rectangle();
           } else if (randomNumber == 1){
               shapes[i] = new Ellipse();
           } else {
               shapes[i] = new Line();
           }
        }
        // Drawing Shapes
//        for (int i = 0; i < ARRAY_LENGTH; i++) {
//            if(shapes[i] instanceof  Rectangle)
//        }

        // forEach 구문
        for (Shape shape: shapes) {
            if (shape instanceof Rectangle) {
//                Rectangle rect = (Rectangle) shape;
//                rect.drawRectangle();
                ((Rectangle) shape).drawRectangle();
            } else if (shape instanceof Ellipse) {
                ((Ellipse) shape).drawEllipse();
            } else if (shape instanceof Line) {
                ((Line) shape).drawLine();
            }
        }
    }
}
