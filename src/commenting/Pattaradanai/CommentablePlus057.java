package commenting.Pattaradanai;

import Util.Pattaradanai.*;

// Pattaradanai Srichon 65130500057
public interface CommentablePlus057 extends Commentable {

    // 3.2
    default String inspect057() {
        StringBuilder result = new StringBuilder();
        for (CommentPlus057 comment : this) {
            result.append(comment)
                    .append("\n");
        }
        return result.toString();
    }
}
