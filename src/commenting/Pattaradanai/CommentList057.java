package commenting.Pattaradanai;

import Util.Pattaradanai.*;
import java.util.*;

// Pattaradanai Srichon 65130500057

// 4.1
public class CommentList057 implements CommentablePlus057 {


    // 4.2
    private final LinkedList<CommentPlus057> comments057 = new LinkedList<>();

    // 4.3
    @Override
    public boolean addComment(String message, Grade057 grade) {
        if (message == null) return false;
        // Successfully added
        comments057.add(new CommentPlus057(message, grade));
        return true;
    }

    //4.4 (10 points) a "removeComment(...)" method that returns true if it removes
    //    the first comment containing the given message (in the parameter) from
    //    the "comments999" field successfully.  Otherwise, it returns false.
    //    It will not remove the comment if the comment message is null.
    @Override
    public boolean removeComment(String message) {
        // message must not be null
        if(message == null) return false;

        // Convert into String first
        for(CommentPlus057 comment : comments057) {
            if(comment.toString().equals(message)) {
                comments057.remove(comment);
                return true;
            }
        }
        return true;
    }

    // 4.5
    @Override
    public Iterator<CommentPlus057> iterator() {
        return new Iterator<CommentPlus057>() {
            private int cursor;
            @Override
            public boolean hasNext() {
                return cursor < comments057.size();
            }

            @Override
            public CommentPlus057 next() {
                return comments057.get(cursor++);
            }
        };
    }

    // 4.7
    @Override
    public Collection<String> extract(Grade057 grade) {
        Collection<String> result = new ArrayList<>();
        for(CommentPlus057 comment : comments057) {
            if(CommentPlus057.match057(grade).test(comment)) {
                result.add(comment.toString());
            }
        }
        return result;
    }

    // 4.6
    @Override
    public void sort() {
        comments057.sort(CommentPlus057.GRADE057_COMPARATOR);
    }
}
