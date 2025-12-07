package exercises;

import edu.touro.mcon264.apps.collections.CollectionInterface;

/**
 * Advance Set Interface
 * @param <T>
 */
public interface AdvanceSetInterface <T> extends CollectionInterface<T> {
/*
 Starter code the exercise 6
 Design signatures for the following methods:*/
    T union(T set1, T set2);
    //return union of 2 sets (set containing all elements of both sets)

    T intersection(T set1, T set2);
    //return intersection of 2 sets (set containing elements that occur in both sets)

    T difference(T set1, T set2);
    //return difference of 2 sets (set containing elements that are in set1 but not set2)
}
