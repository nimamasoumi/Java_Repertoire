import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListType
{
    public static void main(String[] args)
    {
        // testing the generic list
        Integer[] genCollec = {7,13,19};
        Double[] dCollec = new Double[5];    
        dCollec[0]=0.3;dCollec[1]=0.4;dCollec[2]=0.5;dCollec[3]=0.4;dCollec[4]=0.3;        

        printArray(genCollec);
        printArray(dCollec);

        // testing ArrayList type
        ArrayList<Integer> intCollec = new ArrayList<Integer>();
        intCollec.add(77);intCollec.add(1313);intCollec.add(1919);

        ArrayList<Object> DCollec = new ArrayList<Object>(Arrays.asList(dCollec));        
        var DrCollec = new ArrayList<>(Arrays.asList(dCollec));
        DrCollec.remove(DrCollec.size()-1);

        String[] sCollec = {"This","is","my","test","sentence!"};
        List<Object> SCollec = new ArrayList<>(Arrays.asList(sCollec));        

        printList(intCollec);
        printList(DCollec);
        printList(DrCollec);
        printList(SCollec);
    }

    private static <T> void printArray(T[] _array)
    {
        int l=_array.length;
        System.out.printf("\nThe array has %d elements.\n", l);
        for(int ii=0;ii<l;ii++)
        {
            System.out.println(_array[ii]);
        }
    }
    private static <T> void printList(List<T> _list)
    {
        int l = _list.size();
        System.out.printf("\nThe list has %d elements.\n", l);
        var it = _list.listIterator(); 
        while(it.hasNext())
        {            
            System.out.println(it.next());
        }
    }
}