package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList{
    // Write your implementation below with API documentation
    private SortedIntList sortedIntList; // Private instance for delegation
    private int totalAdded; // To keep track of the total attempted insertions

    /**
     * Constructs an empty DelegationSortedIntList.
     */
    public DelegationSortedIntList() {
        sortedIntList = new SortedIntList(); 
        totalAdded = 0; 
    }

    /**
     * Adds an element to the list, incrementing the totalAdded count.
     *
     * @param value the value to be added
     */
    public boolean add(int value) {
        totalAdded++; 
        return sortedIntList.add(value); 
    }

    /**
     * Adds all elements from another list to this list, incrementing the totalAdded count.
     *
     * @param otherList the list from which elements are to be added
     */
    public boolean addAll(IntegerList otherList) {
        totalAdded += otherList.size(); 
        return sortedIntList.addAll(otherList); 
    }

    /**
     * Gets the total number of attempted insertions.
     *
     * @return the total number of attempted insertions
     */
    public int getTotalAdded() {
        return totalAdded;
    }

    public int size() {
        return sortedIntList.size();
    }

    public int get(int index) {
        return sortedIntList.get(index);
    }

    public boolean remove(int value) {
        return sortedIntList.remove(value);
    }

    public boolean removeAll(IntegerList otherList) {
        return sortedIntList.removeAll(otherList);
    }
}