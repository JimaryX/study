package Overview;

import java.util.*;

public class ArraysCollection {
    public static void main(String[] args) {
        // ArrayList 属于数组集合，以及遍历示例
        ArrayList<String> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(new String[] {"good"," morning ", "teacher!"}));
        Iterator<String> iter = arr.iterator();
        iter.forEachRemaining(event -> {
            System.out.println(event);
        });

        // LinkedList 属于链表集合，以及遍历删除示例
        List<String> list = new LinkedList<>();
        list.addAll(Arrays.asList(new String[] {"One", "Two", "Three"}));
        ListIterator<String> iterator = list.listIterator();
        iterator.add("This");

        iterator.next();
        iterator.previous();
        // remove() 方法会根据iterator的状态进行删除，如果最近一次是next()方法，就删除下一个，如果previous()，就删除上一个
        iterator.remove();
        iterator = list.listIterator(); // 迭代器一旦遍历过，就得重新获取迭代器才能重头开始
        iterator.forEachRemaining(element -> {
            System.out.println(element);
        });

        // 双端队列  还有一个继承了Deque的 ArrayDeque， Deque中的方法，不是下面所示，有更能多。
        Queue<String> queue = new LinkedList<>();
        queue.add("");          // 队列没有满，添加成功返回true， 如果满了， 则报错
        queue.offer("");     // 同上，但是如果满了，则会返回false， 不会报错

        queue.remove();         // 队列不为空，删除并返回队列头部元素，若为空，则报错
        queue.poll();           // 同上，但是若为空，则会返回null

        queue.element();        // 队列部位空，返回头部元素，但不删除，若为空，则报错
        queue.peek();           // 同上，但是若为空，则会返回null
    }
}
