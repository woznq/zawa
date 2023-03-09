package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;



public class SvgScene {
    private List<Polygon> l = new ArrayList<>();
    public void addPolygon(Polygon polygon)
    {
        l.add(polygon);
    }
    public void save(String path)
    {

    }
}
