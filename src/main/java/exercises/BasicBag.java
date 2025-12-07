package exercises;

import edu.touro.mcon264.apps.collections.ArrayCollection;
import edu.touro.mcon264.apps.collections.BagInterface;

import java.util.Random;

public class BasicBag<T> extends ArrayCollection<T> implements BagInterface<T> {

    /***
     * If this bag is not empty, removes and returns a random element of the bag;
     * otherwise returns null.
     * @return a random element T, or null
     */
    @Override
    public T grab() {
        if (numElements <= 0 ) return null;
        else {
            Random rand = new Random();
            T item = elements[rand.nextInt(numElements)];
            this.remove(item);
            return item;
        }
    }

    /***
     * Returns a count of all elements e in this collection such that e.equals(target).
     * @param target element to count instances of
     * @return number of instances of target element found
     */
    @Override
    public int count(T target) { //e is null?
        int ct = 0;
        location = 0;
        while (location < numElements) {
            if (elements[location].equals(target)) ct++;
            location++;
        }
        return ct;
    }

    /***
     * Removes all elements e from this collection such that e.equals(target)
     * and returns the number of elements removed.
     * @param target element to remove all instances of
     * @return number of instances of target element removed
     */
    @Override
    public int removeAll(T target) {
        int ct = 0;
        location = 0;
        while (location < numElements) {
            if (elements[location].equals(target)) {
                ct++;
                remove(elements[location]);
            }
            location++;
        }
        return ct;
    }

    /***
     * Empties this bag so that it contains zero elements.
     */
    @Override
    public void clear() {
        location = 0;
        while (location < numElements) {
            remove(elements[location]);
        }
    }
    
}
