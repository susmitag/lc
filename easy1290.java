public class easy1290 {
    /**
     * Definition for singly-linked list.*/
      static public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
     }

     static public class List {
          ListNode head;
          void add(int val){
              ListNode toAdd = new ListNode(val);
              toAdd.next = null;
              if(head == null){
                  head = toAdd;
                  return;
              }
              ListNode curr = head;
              while (curr.next != null){
                  curr = curr.next;
              }
              curr.next = toAdd;
          }
     }

        static public int getDecimalValue(ListNode head) {
            int count = 0;
            ListNode curr = head;
            do{
                ++count;
                curr = curr.next;
            }while(curr != null);
            curr = head;
            int val = 0;
            for(int idx=count-1; idx>=0; --idx){
                val += curr.val * (1<<idx);
                curr = curr.next;
            }
            return val;
        }

        public static void main(String args[]){
          List aList = new List();
          aList.add(1);
          aList.add(1);
            aList.add(0);
            aList.add(1);
            System.out.println(getDecimalValue(aList.head));
        }
}
