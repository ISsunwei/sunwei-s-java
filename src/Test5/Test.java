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
	public static  void main(String[] args) {

	}
}
