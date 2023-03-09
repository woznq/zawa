//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Locale;

public class Segment {
    private Point a;
    private Point b;

    public Segment(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return this.a;
    }

    public Point getB() {
        return this.b;
    }

    public double length() {
        return Math.sqrt((this.a.x - this.b.x) * (this.a.x - this.b.x) + (this.a.y - this.b.y) * (this.a.y - this.b.y));
    }

    public String getSVG() {
        return String.format(Locale.ENGLISH, "<line x1=\"%f\" y1=\"%f\" x2=\"%f\" y2=\"%f\" style=\"stroke:black\" />", this.a.x, this.a.y, this.b.x, this.b.y);
    }

    public static Segment[] perpendicular(Segment segment, Point point) {
        double a = (segment.getA().y - segment.getB().y) / (segment.getA().x - segment.getB().x);
        double b = point.y - a * point.x;
        double x0 = point.x;
        double y0 = point.y;
        double r = segment.length();
        double sq = Math.sqrt(-(y0 * y0) + (2.0 * a * x0 + 2.0 * b) * y0 - a * a * x0 * x0 - 2.0 * a * b * x0 + (a * a + 1.0) * r * r - b * b);
        double x1 = (-sq - a * y0 - x0 + a * b) / (a * a + 1.0);
        double y1 = -(a * sq + a * a * y0 + a * x0 + b) / (a * a + 1.0);
        double x2 = (sq + a * y0 + x0 - a * b) / (a * a + 1.0);
        double y2 = (a * sq + a * a * y0 + a * x0 + b) / (a * a + 1.0);
        return new Segment[]{new Segment(point, new Point(x1, y1)), new Segment(point, new Point(x2, y2))};
    }
}
