package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String stampName;
    private double stampWidth;
    private double stampLength;
    private boolean stampIsStamped;

    public Stamp(String stampName, double stampWidth, double stampLength, boolean stampIsStamped) {
        this.stampName = stampName;
        this.stampWidth = stampWidth;
        this.stampLength = stampLength;
        this.stampIsStamped = stampIsStamped;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampWidth() {
        return stampWidth;
    }

    public double getStampLength() {
        return stampLength;
    }

    public boolean isStampIsStamped() {
        return stampIsStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.getStampWidth(), getStampWidth()) == 0 &&
                Double.compare(stamp.getStampLength(), getStampLength()) == 0 &&
                isStampIsStamped() == stamp.isStampIsStamped() &&
                Objects.equals(getStampName(), stamp.getStampName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStampName(), getStampWidth(), getStampLength(), isStampIsStamped());
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampWidth=" + stampWidth +
                ", stampLength=" + stampLength +
                ", stampIsStamped=" + stampIsStamped +
                '}';
    }
}
