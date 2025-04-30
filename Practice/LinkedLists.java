public class LinkedLists {

    // Node class to represent each element in the linked list
    public static class Node {
        int data;
        Node next;

        // Constructor to initialize node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Method to add a node at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        // If list is empty, set head and tail to new node
        if (head == null) {
            head = tail = newNode;
        } else {
            // Link new node to current head and update head
            newNode.next = head;
            head = newNode;
        }
    }

    // Method to add a node at the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        // If list is empty, set head and tail to new node
        if (head == null) {
            head = tail = newNode;
        } else {
            // Link tail to new node and update tail
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Method to add a node at a specific index in the list
    public void addMiddle(int index, int data) {
        Node newNode = new Node(data);

        // If index is 0, add at beginning
        if (index == 0) {
            addFirst(data);
            return;
        }

        size++;
        Node temp = head;
        int i = 0;

        // Traverse to the node before the desired index
        while (i < index - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        // If index is out of bounds
        if (temp == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        // Link new node and insert it
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Method to remove the first node of the list
    public int removeFirst() {
        // If list is empty
        if (size == 0) {
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }

        // If list has only one node
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // Remove first node and update head
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Method to remove the last node of the list
    public int removeLast() {
        // If list is empty
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }

        // If only one node in the list
        if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // Traverse to the second last node
        Node temp = head;
        int i = 0;
        while (i < size - 2) {
            temp = temp.next;
            i++;
        }

        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    // Method to search for a target value in the linked list
    public int search(int target) {
        int idx = 0;
        Node temp = head;

        // Traverse through list until target is found
        while (temp != null) {
            if (temp.data == target) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }

        return -1; // Target not found
    }

    // Recursive helper method to find the index of a target value in the linked list
    private int searchRec(Node head, int target) {
        // Base case: reached end of list without finding the target
        if (head == null) {
            return -1;
        }

        // If current node's data matches the target
        if (head.data == target) {
            return 0;
        }

        // Recursive call to check the rest of the list
        int index = searchRec(head.next, target);

        // If not found in the rest of the list
        if (index == -1) {
            return -1;
        }

        // Add 1 to the index as we backtrack through the recursion
        return index + 1;
    }

    // Public method to initiate the recursive search from the head
    public int searchRecIdx(int target) {
        return searchRec(head, target);
    }

    // Method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node curr = head;

        // Traverse through the list and reverse pointers
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Set head to the new front
        head = prev;
    }

    // Method to remove the nth node from the end of the list
    public void removeNth(int n) {
        // Step 1: Calculate size of the list
        int s = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            s++;
        }

        // Step 2: If removing the head (nth from end == size)
        if (n == s) {
            head = head.next;
            return;
        }

        // Step 3: Traverse to the (size - n - 1)th node
        int idx = 1;
        Node prev = head;
        while (idx < s - n) {
            prev = prev.next;
            idx++;
        }

        // Step 4: Remove the nth node
        prev.next = prev.next.next;
    }

    // Method to find the middle node of the linked list
    private Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head;

        // Use slow-fast pointer approach to find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Method to check if the linked list is a palindrome
    public boolean isPalindrome() {
        // If list has 0 or 1 node, it's a palindrome
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find the middle of the list
        Node midNode = findMidNode(head);

        // Step 2: Reverse the second half of the list
        Node prev = null;
        Node curr = midNode;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare left and reversed right half
        Node left = head;
        Node right = prev;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;

        // Traverse through list and print each node
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Main method to test the linked list operations
    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);

        ll.addMiddle(2, 3);
        ll.printList();
        System.out.println(ll.isPalindrome());
    }
}
