//public class SingleLinkedList2
//{
//    public Node head = null;
//    public int size = 0;
//
//    public void addFirst(String item)
//    {
//        Node temp = new Node(item, head);
//        head = temp;
//        size++;
//    }
//
//    public void addAfter(String name, Node node)
//    {
//        Node temp = new Node(name, node.next);
//        temp.next = node.next;
//        node.next = temp;
//        size++;
//    }
//
//    public String removeAfter(Node node)
//    {
//        Node temp = node.next;
//        if (temp != null)
//        {
//            node.next = temp.next;
//            size--;
//            return temp.data;
//        }
//        else
//        {
//            return null;
//        }
//    }
//
//    public String removeFirst()
//    {
//        Node temp = head;
//        if (head != null)
//        {
//            head = head.next;
//            size--;
//            return temp.data;
//        }
//        else
//        {
//            return null;
//        }
//    }
//
//    public Node getNode(int index)
//    {
//        Node temp = head;
//        for (int i = 0; i < index && temp != null; i++)
//        {
//            temp = temp.next;
//        }
//
//        return temp;
//    }
//
//    public String get(int index)
//    {
//        if(in)
//    }
//
//}
