package Recursion;

/**
 * Given a linked list, swap every two adjacent nodes and return its head. You
 * must solve the problem without modifying the values in the list's nodes
 * (i.e., only nodes themselves may be changed.) Input: head = [1,2,3,4] Output:
 * [2,1,4,3]
 * 
 * @author u0982683
 *
 */
public class SwapNodes {

	public ListNode swapPairs(ListNode head) {
		ListNode temp = new ListNode(0);
		temp.next = head;
		ListNode current = temp;

		while (current.next != null && current.next.next != null) {
			ListNode first = current.next;
			ListNode second = current.next.next;
			first.next = second.next;
			current.next = second;
			current.next.next = first;
			current = current.next.next;
		}
		return temp.next;
	}

}
