package com.workintech.hw;

public class Bed {
    private  String syle ;
    private  int pillows , height , sheets , quilts ;

    public Bed(String syle, int pillows, int height, int sheets, int quilts) {
        this.syle = syle;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }
    public void make() {
        System.out.println("The bed is being made.");
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }

    @java.lang.Override
    public String toString() {
        return "Bed{" +
                "syle='" + syle + '\'' +
                ", pillows=" + pillows +
                ", height=" + height +
                ", sheets=" + sheets +
                ", quilts=" + quilts +
                '}';
    }
}
