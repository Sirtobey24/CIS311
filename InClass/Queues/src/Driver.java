public class Driver
{
    public static void main(String[] args_)
    {
        CircularQueue Q = new CircularQueue();
        Q.offer(10);
        System.out.println(Q);
        Q.offer((20));
        System.out.println(Q);
    }
}
