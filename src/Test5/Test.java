package Test5;

import java.util.LinkedList;

/**
 * 4.使用LinkedList分别实现队列、堆栈(自定义队列、堆栈类，封装LinkedList类)。
 * @author sunwei
 *
 */
public class Test<T> {

	LinkedList<T> queue = new LinkedList<>();
	
	//向列队头部加入元素
    public void addFirst(T e) {
        queue.addLast(e);
    }
	//向列队尾部加入元素
    public void addLast(T e) {
    	queue.addLast(e);
    }
    //返回列队的头部元素
    public T getFirst() {
    	return queue.getFirst();
    }
    //返回列队尾部元素
    public T getLast() {
    	return queue.getLast();
    }
    //移去并返回列队的头元素
    public T removeFirst() {
    	return queue.removeFirst();
    }
    //移去并返回列队的尾元素
    public T removeLast() {
    	return queue.removeLast();
    }
    //返回列队的元素数
    public int size() {
    	return queue.size();
    }
    //判断列队是否为空
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    //清空队列
    public void clear() {
        queue.clear();
    }
    
	public static  void main(String[] args) {
		Test<String> myQueue = new Test<>();
		 myQueue.addFirst("1");
	     myQueue.addLast("2");
	     myQueue.addLast("3");
	     while (!myQueue.isEmpty()) {
	            System.out.println(myQueue.removeFirst());
	     }
	}
}
