package com.teachmeskills.lesson_15.task_2.figure;

import com.teachmeskills.lesson_15.task_2.abstractFigure.Figure;

public class Circle extends Figure {

        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
}
