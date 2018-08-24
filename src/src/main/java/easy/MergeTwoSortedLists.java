package src.main.java.easy;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		listNode1.next = new ListNode(2);
		listNode1.next.next = new ListNode(4);

		ListNode listNode2 = new ListNode(1);
		listNode2.next = new ListNode(3);
		listNode2.next.next = new ListNode(4);

		mergeTwoLists(listNode1, listNode2);
		System.out.println();
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		List<Integer> listNode1 = new ArrayList<>();
		List<Integer> listNode2 = new ArrayList<>();
		while(l1 !=null) {
			listNode1.add(l1.val);
			l1 = l1.next;
		}

		while(l2 !=null) {
			listNode2.add(l2.val);
			l2 = l2.next;
		}
		List<Integer> mergedList = new ArrayList<>();

		if(listNode1.size() == listNode2.size()) {
			for(int i=0; i<listNode1.size();i++) {
				if(listNode1.get(i)<listNode2.get(i)) {
					mergedList.add(listNode1.get(i));
					mergedList.add(listNode2.get(i));
				}else {
					mergedList.add(listNode2.get(i));
					mergedList.add(listNode1.get(i));
				}
				
			}
		} else if(listNode1.size() < listNode2.size()) {
			for(int i=0; i<listNode1.size();i++) {
				if(listNode1.get(i)<listNode2.get(i)) {
					mergedList.add(listNode1.get(i));
					mergedList.add(listNode2.get(i));
				}else {
					mergedList.add(listNode2.get(i));
					mergedList.add(listNode1.get(i));
				}
				
			}
			for(int index=listNode1.size(); index<listNode2.size(); index++) {
				mergedList.add(listNode2.get(index));
			}

		}else {
			for(int i=0; i<listNode2.size();i++) {
				if(listNode1.get(i)<listNode2.get(i)) {
					mergedList.add(listNode1.get(i));
					mergedList.add(listNode2.get(i));
				}else {
					mergedList.add(listNode2.get(i));
					mergedList.add(listNode1.get(i));
				}
				
			}
			for(int index=listNode2.size(); index<listNode1.size(); index++) {
				mergedList.add(listNode1.get(index));
			}
		}

		ListNode listNode = null;
		
		for(int index =0; index<mergedList.size();index++) {
			
			listNode = insertElement(listNode, mergedList.get(index));
		}

		return listNode;
	}
	
	private static ListNode insertElement(ListNode node, int data){

		if(node == null){
			return new ListNode(data);
		}
		
		node.next = insertElement(node.next, data);

		return node;
	}

}
