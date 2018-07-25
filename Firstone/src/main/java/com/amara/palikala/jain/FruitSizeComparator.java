package com.amara.palikala.jain;

import java.util.Comparator;

public class FruitSizeComparator implements Comparator<SameFruit> {


    @Override
    public int compare(SameFruit o1, SameFruit o2) {

      return o1.getQuantity()-o2.getQuantity();
    }
}
