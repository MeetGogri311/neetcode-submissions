class Node{
    public int val;
    public Node next;
    public Node(int val){
        this.val = val;
    }
}
class LinkedList {
    private Node head;
    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        Node tmp = head;
        while(index > 0 && tmp != null){
            tmp = tmp.next;
            index--;
        }
        if(tmp==null) return -1;
        return tmp.val;
    }

    public void insertHead(int val) {
        if(head == null){
            head = new Node(val);
            return;
        }
        Node tmp = new Node(val);
        tmp.next = head;
        head = tmp;
    }

    public void insertTail(int val) {
        if(head == null){
            head = new Node(val);
            return;
        }
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = new Node(val);
    }

    public boolean remove(int index) {
        Node tmp = head, prev = null;
        while(index > 0 && tmp != null){
            prev=tmp;
            tmp = tmp.next;
            index--;
        }
        if(tmp==null) return false;
        if(prev == null) {
            head = head.next;
            return true;
        }
        prev.next = tmp.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Node tmp = head;
        while(tmp != null){
            arr.add(tmp.val);
            tmp = tmp.next;
        }
        return arr;
    }
}
