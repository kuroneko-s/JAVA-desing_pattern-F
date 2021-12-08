package com.inflearn.desing_pattern.decorator;

import com.inflearn.desing_pattern.composite.after.Bag;
import com.inflearn.desing_pattern.composite.after.Item;
import com.inflearn.desing_pattern.decorator.after.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//@Component
public class DecoratorRunner implements ApplicationRunner {

    private static boolean enabledSpamFilter = true;
    private static boolean enabledTrimming = true;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        CommentService commentService = new DefaultCommentService();

        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if (enabledTrimming) {
            commentService = new TrimmingDecorator(commentService);
        }

        commentService = new MasterCommentDecorator(commentService);

        Client client = new Client(commentService);
        client.writeComment("Hello");
        client.writeComment("...개쩐다이거");
        client.writeComment("http://google.co.kr");

        ArrayList list = new ArrayList();
        list.add(new Item("1", 1));

        List newList = Collections.checkedList(list, Item.class); // 타입 검사
        list.add(new Bag());
        newList.add(new Bag());

        // HttpServletRequestWrapper
        // Collections.synchronizedList() 동기화검사
        // Collections.unmodifiableList() 불변
    }
}
