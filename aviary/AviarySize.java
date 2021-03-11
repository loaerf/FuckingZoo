package com.aviary;

public enum AviarySize {

    SMALL(1), NORMAL(2),BIG(3),VERY_BIG(4);

    private int size;
    AviarySize(int size) {
         this.size = size;
    }

    public int getSize() {
        return size;
    }
}
