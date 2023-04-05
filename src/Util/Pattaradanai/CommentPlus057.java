package Util.Pattaradanai;

import java.util.*;
import java.util.function.Predicate;

// Pattaradanai Srichon 65130500057

// 2.1
public class CommentPlus057 extends Comment {

    // 2.2
    private final Grade057 grade;

    // 2.5
    public CommentPlus057(String message, Grade057 grade) {
        super(message == null ? "NO_COMMENT" : message);
        this.grade = grade == null ? Grade057.NONE : grade;
    }

    // 2.3
    public static final Comparator<CommentPlus057> GRADE057_COMPARATOR =
            (c1, c2) -> c1.grade.compareTo(c2.grade);

    // 2.4
    public static Predicate<CommentPlus057> match057(Grade057 grade) {
        return c -> c.grade.equals(grade);
    }

    // 2.6
    @Override
    protected String getContent() {
        return super.getContent() + " (" + grade + ")";
    }


}



