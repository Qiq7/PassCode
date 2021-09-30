package Winter_vacation;

public class Factory {
    private static Usb u=null;
    //Usb u=null;
//    Factory(String o) throws Exception {
//        Class c=Class.forName(o);
//        u=(Usb)c.newInstance();
//    }
    public static Usb creat(String o)
    {
        Class c=null;
        try {
            c = Class.forName(o);
            u = (Usb) c.newInstance();
        }catch (Exception e){
            //System.out.println(e.getMessage());
        }
        return  u;
    }


}
