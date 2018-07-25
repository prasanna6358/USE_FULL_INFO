package com.amara.palikala.jain;

import java.util.Comparator;

public class FruitNameComparator implements Comparator<SameFruit> {


    @Override
    public int compare(SameFruit o1, SameFruit o2) {
        return o1.getFruitName().compareTo(o2.getFruitName());
    }
}
