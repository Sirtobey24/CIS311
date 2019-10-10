import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CountryList<E extends Comparable<E>> implements Iterable<E>
{
    private List<E> theList = new LinkedList<>();
    ListIterator<E> iter = theList.listIterator();

    public void add(E obj)
    {
        while (iter.hasNext())
        {
            if (obj.compareTo(iter.next()) < 0)
            {
                iter.previous();
                iter.add(obj);
                return;
            }
        }
        iter.add(obj);
    }

    public E get(int index)
    {
        return theList.get(index);
    }

    public Iterator<E> iterator()
    {
        return theList.iterator();
    }

    public int size()
    {
        return theList.size();

    }

    public void remove(E obj)
    {

        for (int i = theList.size() - 1; i >= 0; i--)
        {
            if (theList.get(i).equals(obj))
            {
                theList.remove(i);
                return;
            }
        }


    }

}
     
