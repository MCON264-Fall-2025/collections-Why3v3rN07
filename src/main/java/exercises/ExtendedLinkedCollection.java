package exercises;

import edu.touro.mcon264.apps.collections.LinkedCollection;
import edu.touro.mcon264.support.LLNode;

public class ExtendedLinkedCollection<T> extends LinkedCollection<T> {
    /***
     * Create String of LinkedCollection nodes' contents
     * @return String in [a, b, c] format
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        LLNode<T> go = this.head;
        for (int i = 0; i < this.numElements; i++) {
            sb.append(go.getInfo());
            if (go.getLink() != null) sb.append(", ");
            go = go.getLink();
        }
        return sb.append("]").toString();
    }

    /***
     * Count how many times a specified element appears in this collection
     * @param target node to search for appearances of
     * @return int count of how many times target noded appeared
     */
    public int count(T target) {
        int count = 0;
        LLNode<T> go = this.head;
        for (int i = 0; i<this.numElements; i++) {
            if (target.equals(go.getInfo())) count++;
            go = go.getLink();
        }
        return count;
    }

    /***
     * Remove all occurrences of target element
     * @param target element to remove
     * @return number of removals
     */
    public int removeAll(T target) {
        int count = 0;
        LLNode<T> go = this.head;
        for (int i = 0; i<this.numElements; i++) {
            if (remove(target)) count++;
            go = go.getLink();
        }
        return count;
    }
}
