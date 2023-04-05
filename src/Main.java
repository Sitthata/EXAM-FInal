import Util.Pattaradanai.*;
import commenting.Pattaradanai.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        testCommentingList();
    }

    public static void testCommentingList() {
        CommentList057 list = new CommentList057();
        list.addComment("Good", Grade057.GOOD);
        list.addComment("Badly executed", Grade057.POOR);
        list.addComment("Random Comment", Grade057.POOR);
        list.addComment("Best", Grade057.GOOD);

        List<String> poor = new ArrayList<>(list.extract(Grade057.POOR));
        System.out.println(poor);
        list.sort();
        System.out.println(list.inspect057());

    }
}