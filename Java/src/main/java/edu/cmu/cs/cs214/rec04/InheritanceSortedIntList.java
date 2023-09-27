package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList {

    private int totalAdded; // To keep track of the total attempted insertions
    /**
     * Constructs an empty InheritanceSortedIntList.
     */
    public InheritanceSortedIntList() {
        super();
        this.totalAdded = 0;
    }

    /**
     * Adds an element to the list, incrementing the totalAdded count.
     *
     * @param value the value to be added
     */
    @Override
    public boolean add(int value) {
        this.totalAdded++;
        return super.add(value);
    }

    /**
     * Adds all elements from another list to this list, incrementing the totalAdded count.
     *
     * @param otherList the list from which elements are to be added
     */
    @Override
    public boolean addAll(IntegerList otherList) {
        return super.addAll(otherList);
    }

    /**
     * Gets the total number of attempted insertions.
     *
     * @return the total number of attempted insertions
     */
    public int getTotalAdded() {
        return this.totalAdded;
    }
}
