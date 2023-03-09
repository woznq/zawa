//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Locale;

public class Polygon {
    private Point[] vertices;

    Polygon(int numOfVer) {
        this.vertices = new Point[numOfVer];
    }

    public void setVertex(int numOfVer, Point vertex) {
        this.vertices[numOfVer] = vertex;
    }

    public void setVertices(Point[] vertices) {
        this.vertices = vertices;
    }

    public String toSvg() {
        String s = "";
        Point[] var2 = this.vertices;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Point p = var2[var4];
            s = s + p.x + "," + p.y + " ";
        }

        return String.format(Locale.ENGLISH, "<polygon points=\"%s\"/>", s);
    }
}
