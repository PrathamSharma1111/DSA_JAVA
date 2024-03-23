public class ImplementStackWithLinkedList {
    static  class StackNode {
        int data;
        StackNode next;
        StackNode(int a) {
            data = a;
            next = null;
        }
    }   
    static StackNode top;
    
    //Function to push an integer into the stack.
  static  void push(int a) 
    {
        // Add your code here
         StackNode n=new StackNode(a);
        if(top==null){
            top=n;
        }else{
            StackNode temp=top;
            top=n;
            n.next=temp;
        }
    }
    
    //Function to remove an item from top of the stack.
   static int pop() 
    {
        // Add your code here
         if(top==null){
          return -1;         
        }
        int t=top.data;
        top=top.next;
        return t;
    }
    static void display() {
        StackNode current = top;
        System.out.print("Stack Elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
     public static void main(String[] args) {
         push(3);
         push(5);
         push(7);
         // pop();
         push(6);
         display();
     }
}
