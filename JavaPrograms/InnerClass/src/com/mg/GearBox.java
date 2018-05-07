package com.mg;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxgear;
    private int currentgear = 0;

    public GearBox(int maxgear) {
        this.maxgear = maxgear;
        this.gears = new ArrayList<>();
        Gear neutarl = new Gear(0 , 0.0);
        this.gears.add(neutarl);
    }

    public class Gear{
        private int gearnumber;
        private double ratio;

        public Gear(int gearnumber, double ratio) {
            this.gearnumber = gearnumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs*(this.ratio);
        }
    }
}


