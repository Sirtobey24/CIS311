public interface Queue<E>
{
    public void offer(E data); //Adding data

    public E poll(); //Removing data

    public boolean isEmpty(); //Checks if no data

    public boolean isFull(); //Checks if full
}
