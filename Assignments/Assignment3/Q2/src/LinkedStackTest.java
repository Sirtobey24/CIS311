
public class LinkedStackTest
{
    public static void main(String[] args){
        LinkedStack<String> myList= new LinkedStack<>();
        myList.push("Robert De Niro");
        myList.push("Harrison Ford");
        myList.push("Michael Douglas");
        myList.push("Al Pacino");
        while(! myList.isEmpty()){
            System.out.println(myList.peek());
            System.out.println("The list size aftre calling peek() is: "+ myList.size());
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println(myList.pop());
            System.out.println("The list size aftre calling pop() is: "+ myList.size());
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
    }
}
