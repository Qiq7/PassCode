package javaxm3.sbww;

public class Text3 {
    public static void main(String[] args) {
        People p =new People(15);
            try {
                p.setAge(150);
            }catch(AgeException e)
            {
                System.out.println(e.getMessage());
            }finally {
                System.out.println("ok");
            }
        System.out.println(p.toString());
            String s ="habc";
            String t ="habc";
            char a[] =s.toCharArray();
            System.out.println();
            System.out.println(s.equals(t));
    }
}
