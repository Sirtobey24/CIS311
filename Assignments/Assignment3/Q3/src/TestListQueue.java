
public class TestListQueue
{
    public static void main(String[] args){
        ListQueue<String> myQueue=new ListQueue<>();
        myQueue.offer("Robert De Niro");
        myQueue.offer("Harrison Ford");
        myQueue.offer("Michael Douglas");
        myQueue.offer("Al Pacino");
        while(! myQueue.isEmpty()){
            System.out.println(myQueue.peek());
            System.out.println("The list size aftre calling peek() is: "+ myQueue.size());
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println(myQueue.poll());
            System.out.println("The list size aftre calling pop() is: "+ myQueue.size());
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
    
    
    }
}
