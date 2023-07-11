package LinkedList;

class ListNode {
    //노드당 데이터와 다음 노드의 주소를 가지고 있음.
    private String data;
    public ListNode link;

    public ListNode() { //생성자 생성
        this.data = null;
        this.link = null;
    }

    public ListNode(String data) {
        this.data = data;
        this.link = null;
    }

    public ListNode(String data, ListNode link) {
        this.data = data;
        this.link = link;
    }

    public String getData() {
        return this.data;
    }
}
public class LinkedList {
    private ListNode head; //첫번째 노드

    public LinkedList() {
        this.head = null;
    }

    //Node 중간에 삽입
    public void insertNode(ListNode preNode, String data) {
        //삽입할 노드 생성
        ListNode newNode = new ListNode(data);
        newNode.link = preNode.link;
        preNode.link = newNode;
    }

    //Node 마지막에 삽입
    public void insertNode(String data) {
        //삽입할 노드 생성
        ListNode newNode = new ListNode(data);

        //head가 null인 경우 새 노드를 참조하도록 함.
        if(head == null) {
            this.head = newNode;
        } else {
            ListNode tempNode = head;

            while(tempNode.link != null) { //마지막 노드의 link는 비어있으니까 찾는거
                tempNode = tempNode.link;
            }
            tempNode.link = newNode;
        }
    }

    public void deleteNode(String data) {
        ListNode preNode = this.head;
        ListNode tempNode = this.head.link;

        if(data.equals( preNode.getData() )) { //첫번째 노드를 삭제하는 경우
            head = preNode.link;
            preNode.link = null;
        } else {
            while(tempNode != null) {
                if(data.equals(tempNode.getData())) {
                    //tempNode 가 마지막 노드인 경우
                    if(tempNode.link == null) {
                        preNode.link = null;
                    } else {
                        //tempNode 가 마지막 노드가 아닌경우
                        preNode.link = tempNode.link;
                        tempNode.link = null;
                    }
                    break;
                } else {
                    System.out.println(preNode.link == tempNode);

                    preNode = tempNode;
                    tempNode = tempNode.link;
                }
            }
        }
    }

    //마지막 노드 삭제
    public void deleteNode() {
        ListNode preNode;
        ListNode tempNode;

        //첫번째 노드가 없을 때
        if(head == null) {
            return ; //삭제할 노드가 없으니 그냥 리턴
        }

        if(head.link == null) {
            head = null; //노드가 하나만 있을 떄
        } else {
            preNode = head;
            tempNode = head.link;

            //마지막 노드가 아닐 때 노드를 앞에서 마지막까지 가져옴.
            while (tempNode.link != null) {
                preNode = tempNode;
                tempNode = tempNode.link;
            }

            preNode.link = null;
        }
    }

    public void reverseList() {
        ListNode nextNode = head;
        ListNode currentNode = null;
        ListNode preNode = null;

        while(nextNode != null) {
            preNode = currentNode;
            currentNode = nextNode;
            nextNode = nextNode.link;
            currentNode.link = preNode;
        }

        head = currentNode;
    }

    public ListNode searchNode(String data) {
        ListNode tempNode = this.head;    // temp 노드에 head가 가리키는 첫 번째 할당.

        // temp 노드가 null이 아닐 때까지 반복하여 탐색
        while(tempNode != null) {
            // 주어진 데이터와 temp 노드의 데이터가 일치할 경우 해당 temp 노드를 return
            if(data.equals(tempNode.getData())) {
                return tempNode;
            } else {
                // 데이터가 일치하지 않을 경우 temp 노드에 다음 노드 할당.
                tempNode = tempNode.link;
            }
        }
        return tempNode;
    }

    public void printList() {
        ListNode tempNode = this.head;
        while (tempNode.link != null) {
            System.out.print(tempNode.getData() + " ");
            tempNode = tempNode.link;
        }
        System.out.println();
    }
    public static void main(String args[]) {
        LinkedList linkedList = new LinkedList();    // 연결 리스트 생성
        String str = "wed";

        linkedList.insertNode("sun");
        linkedList.insertNode("mon");
        linkedList.insertNode("tue");
        linkedList.insertNode("wed");
        linkedList.insertNode("thu");
        linkedList.insertNode("fri");
        linkedList.insertNode("sat");
        linkedList.deleteNode("fri");
        linkedList.printList();

        System.out.println(linkedList.searchNode(str).getData());

        linkedList.deleteNode(linkedList.searchNode(str).getData());
        linkedList.printList();

        str = "sun";

        linkedList.deleteNode(linkedList.searchNode(str).getData());
        linkedList.printList();

        linkedList.reverseList();
        linkedList.printList();
    }
}
