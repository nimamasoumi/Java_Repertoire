import com.google.gson.Gson;

class jsonString
{
    public static void main(String[] args)
    {
        System.out.println("\nTesting Gson ...\n");
        var gson = new Gson();
        var packet = new Packet("Let's test this cool mechanism!");

        // encoding
        var jsonPacket = gson.toJson(packet);        
        System.out.println("This is the result of encoding to JSON: ");
        System.out.println(jsonPacket);

        // decoding
        System.out.println("\nThis is the result of decoding from JSON: ");
        var _packet = gson.fromJson(jsonPacket, Packet.class);
        System.out.println(_packet.getMessage());
    }
}

class Packet 
{
    private String message;
    public Packet(){}
    public Packet(String _message){this.message=_message;}

    public String getMessage(){return message;}
    public boolean setMessage(String _message)
    {
        try
        {
            this.message=_message;
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong ...\n"+e);
            return false;
        }
        return true;
    }    
}