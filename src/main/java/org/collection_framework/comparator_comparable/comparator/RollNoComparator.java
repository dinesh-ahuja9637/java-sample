package org.collection_framework.comparator_comparable.comparator;

import java.util.Comparator;

public class RollNoComparator implements Comparator<ComparatorDemo> {

    @Override
    public int compare(ComparatorDemo o1, ComparatorDemo o2) {
        return o1.roll_no-o2.roll_no;
    }
}
