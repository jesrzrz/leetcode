package es.jr.leetcode.sols;

public class SwapNodes {

	public static void main(String[] args) {
//		{7,9,6,6,7,8,3,0,9,5}
		ListNode a = new ListNode(7, new ListNode(9, new ListNode(6, new ListNode(6, new ListNode(7,
				new ListNode(8, new ListNode(3, new ListNode(0, new ListNode(9, new ListNode(5))))))))));
		new SwapNodes().swapNodes(a, 5);
	}

	public ListNode swapNodes(ListNode head, int k) {

//		printList(head);
		
		int aux = get(head, k).val;
		set(head, k, get(head, size(head) - k + 1).val);
		set(head, size(head) - k + 1, aux);
				
//		printList(head);

		return head;
	}

	public void printList(ListNode head) {
		ListNode current = head;
		System.out.println("{");
		while (current.next != null) {
			System.out.println(current.val);
			current = current.next;
		}
		System.out.println("}");
	}
	
	public ListNode get(ListNode head, int j) {

		ListNode current = head;
		int i = 1;
		while (current.next != null && i < j) {
			current = current.next;
			i++;
		}
		return current;
	}
	
	public void set(ListNode head, int j, int value) {

		ListNode current = head;
		int i = 1;
		while (current.next != null && i < j) {
			current = current.next;
			i++;
		}
		current.val = value;
	}

	public int size(ListNode head) {
		ListNode current = head;
		int i = 1;

		while (current.next != null) {
			current = current.next;
			i++;
		}
		return i;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}