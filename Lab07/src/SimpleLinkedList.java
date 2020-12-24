public class SimpleLinkedList {

    Node head;

    public SimpleLinkedList() {
        head = null;
    }

    private SimpleNode list;

    public class SimpleNode {
        public String str;
        public SimpleNode next;


        public SimpleNode(String str) {
            this.str = str;
        }

        public String printNode() {
            return str;
        }
    }
        public boolean isEmpty() {
            return (list == null);
        }

        public String get(int index){
            SimpleNode current = list;
            int count=0;
            while(current != null)
            {
                if(count == index)
                    return current.printNode();// prints to wished index
                else
                    current = current.next;
                count++;
            }
            return null;
        }


        public void addToHead(String item){
            SimpleNode Node =new SimpleNode(item);
            Node.next=list;
            list = Node;
        }

    public void addToTail(String item){
        SimpleNode Node =new SimpleNode(item);
        list.next = Node;
    }

        public void addAnywhere(String s, int index){//add anywhere method
            SimpleNode addedNode=new SimpleNode(s);
            SimpleNode current = list;
            int count=0;
            while(current != null)
            {
                if(count== index){
                    addedNode.next=current;
                    current=addedNode;
                    list.next.next.next=addedNode;
                }

                else
                    current = current.next;
                count++;
            }
        }

        public String removeFromHead(){
            SimpleNode temp = list;
            if(temp == null)
                return null;

            list = list.next;
            return temp;
        }

        public String toString(){
            String result="";
            SimpleNode current=list;

            while(current!=null){
                result=result+current.str + "\n";
                current=current.next;
            }
            return result;
        }
}
