package Util.Pattaradanai;

import java.util.Collection;
import java.util.Iterator;

// Pattaradanai Srichon 65130500057
public interface Commentable extends Iterable<CommentPlus057> {
    default boolean addComment(String message) { return addComment(message, null); }
    boolean addComment(String message, Grade057 grade);
    boolean removeComment(String message);
    Iterator<CommentPlus057> iterator();
    Collection<String> extract(Grade057 grade);
    void sort();
}
