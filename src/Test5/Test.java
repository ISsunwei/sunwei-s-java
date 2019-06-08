package Test5;

import java.util.LinkedList;

/**
 * 4.ʹ��LinkedList�ֱ�ʵ�ֶ��С���ջ(�Զ�����С���ջ�࣬��װLinkedList��)��
 * @author sunwei
 *
 */
public class Test<T> {

	LinkedList<T> queue = new LinkedList<>();
	
	//���ж�ͷ������Ԫ��
    public void addFirst(T e) {
        queue.addLast(e);
    }
	//���ж�β������Ԫ��
    public void addLast(T e) {
    	queue.addLast(e);
    }
    //�����жӵ�ͷ��Ԫ��
    public T getFirst() {
    	return queue.getFirst();
    }
    //�����ж�β��Ԫ��
    public T getLast() {
    	return queue.getLast();
    }
    //��ȥ�������жӵ�ͷԪ��
    public T removeFirst() {
    	return queue.removeFirst();
    }
    //��ȥ�������жӵ�βԪ��
    public T removeLast() {
    	return queue.removeLast();
    }
    //�����жӵ�Ԫ����
    public int size() {
    	return queue.size();
    }
    //�ж��ж��Ƿ�Ϊ��
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    //��ն���
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
