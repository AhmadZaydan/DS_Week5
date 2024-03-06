
public class Main {
    private static class Node<E> {
        // Data Fields
        /** The reference to the data*/
        private E data;
        /** The reference to the next node*/
        private Node<E> next;

        // Constructor
        /** Creates a new node with a null next field
         * @param dataItem The data stored
         */

        private Node(E dataItem) {
            data = dataItem;
            next = null;
        }

//        /** Creates a new node that reference another node
//         * @param dataItem The data stored
//         * @param nodeRef The node referenced by new node
//         */

        private Node(E dataItem, Node<E> nodeRef) {
            data = dataItem;
            next = nodeRef;
        }
    }

    public static class KWSingleLinkedList<E> {
        private Node<E> head = null;
        private int size = 0;

        public void addFirst(E item) {
            head = new Node<>(item, head);
            size++;
        }

        public void addAfter(Node<E> node, E item) {
            if (node != null) {
                node.next = new Node<>(item, node.next);
                size++;
            }
        }

        private E removeAfter(Node<E> node) {
            Node<E> temp = node.next;
            if (temp != null) {
                node.next = temp.next;
                size--;
                return temp.data;
            }
            else {
                return null;
            }
        }

        private E removeFirst() {
            Node<E> temp = head;
            if (head != null) {
                head = head.next;
            }

            if (temp != null) {
                size--;
                return temp.data;
            }
            else {
                return null;
            }
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            Node<E> current = head;
            while (current != null) {
                result.append(current.data).append(" -> ");
                current = current.next;
            }
            result.append("null");
            return result.toString();
        }
    }

    public static void main(String[] args) {
        Node<String> tom = new Node<>("Tom");
        Node<String> dick = new Node<>("Dick");
        Node<String> harry = new Node<>("Harry");
        Node<String> sam = new Node<>("Sam");
        tom.next = dick;
        dick.next = harry;
        harry.next = sam;

        KWSingleLinkedList<String> names = new KWSingleLinkedList<>();
        names.addFirst("Sam");
        names.addFirst("Harry");
        names.addFirst("Dick");
        names.addFirst("Tom");

        System.out.println(names.toString());

        Node<String> bob = new Node<>("Bob");
        bob.next = harry.next;
        harry.next = bob;

        tom.next = tom.next.next;

        names.removeFirst();

        System.out.println(names.toString());
    }
}
