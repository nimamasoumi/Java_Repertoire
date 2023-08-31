class ObjectType
{
    public ObjectType(){};
    public Object o1 = new Object();

    public void CheckObj()
    {
        // An example of synchronized statement
        synchronized(o1)
        {
            if (this == o1)
            {
                System.out.println("Object member is the class instance!");
            }
            else
            {
                System.out.println("Object member is not a class instance!");
            }
        }
        
    }
}