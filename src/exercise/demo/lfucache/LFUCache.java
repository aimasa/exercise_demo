package exercise.demo.lfucache;

import java.util.HashMap;

public class LFUCache {
	private int capacity;
	private HashMap<Integer, Node> cache;
	private HashMap<Integer, Node> usedFrequencyCachePre;
	private HashMap<Integer, Node> usedFrequencyCacheTail;
	int min;

	public LFUCache(int capacity) {
		this.capacity = capacity;
		cache = new HashMap<Integer, Node>();
		usedFrequencyCachePre = new HashMap<Integer, Node>();
		usedFrequencyCacheTail = new HashMap<Integer, Node>();
		min = 0;
	}

	public int get(int key) {
		if (cache.containsKey(key)) {
			// 增加node的更新操作次数
			put(key, cache.get(key).val);
			return cache.get(key).val;
		}
		return -1;
	}

	public void put(int key, int value) {

		if (cache.containsKey(key)) {
			// 增加node的更新操作次数
			Node node = cache.get(key);
			node.val = value;
			delete(node);
			if (min == node.count && usedFrequencyCachePre.get(min) == null) {
				min++;
			}
			// if(list。start == list.end && min == node.count) min++
			node.count++;
			insert(node);

			return;
		}
		if (cache.size() > capacity) {
			cache.remove(usedFrequencyCachePre.get(min).key);
			delete(usedFrequencyCachePre.get(min));
		}

		Node node = new Node(value, 1, key);
		min = 1;
		cache.put(key, node);
		insert(node);
		// 双向链表插入

	}

	public void insert(Node node) {
		if (usedFrequencyCachePre.containsKey(node.count)) {
			Node preNode = usedFrequencyCacheTail.get(node.count);
			if(!(preNode == null)) {
				preNode.tail = node;
				node.pre = preNode;
			}else {
				usedFrequencyCachePre.put(node.count, node);
			}
		}
		usedFrequencyCacheTail.put(node.count, node);
	}

	public void delete(Node node) {
		Node preNode = node.pre;
		Node nextNode = node.tail;
		if (!(preNode == null)) {
			preNode.tail = nextNode;
		}
		if (!(nextNode == null)) {
			nextNode.pre = preNode;
		}
		if (usedFrequencyCacheTail.containsKey(node.count) && usedFrequencyCacheTail.get(node.count) == node) {
			usedFrequencyCacheTail.put(node.count, node.pre);
		}
		if (usedFrequencyCachePre.containsKey(node.count) && usedFrequencyCachePre.get(node.count) == node) {
			usedFrequencyCachePre.put(node.count, node.tail);
		}
		
	}
}

class Node {
	Node pre;
	Node tail;
	int count;
	int val;
	int key;

	public Node(int val, int count, int key) {
		this.key = key;
		this.val = val;
		this.count = count;
	}
}