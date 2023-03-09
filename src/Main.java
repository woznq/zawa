//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Segment seg = new Segment(new Point(4.0, 5.0), new Point(5.0, 19.0));
        Segment[] arr = Segment.perpendicular(seg, new Point(5.0, 15.0));
        System.out.println(arr[1].getSVG());
    }
}
