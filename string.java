public class string 
{
    public static void main(String[] args) 
    {
        String name = "Tanishka"; //this is mostly used 
        // String name = new String("Tanishka");

        System.out.println(name);
        System.out.println("hello " + name);
        System.out.println(name.hashCode());
        System.out.println(name.charAt(1));
        System.out.println(name.concat("Oberoi"));

        String s1 = "mom";
        String s2 = "mom";
        System.out.println(s1 == s2);

        StringBuffer sb =  new StringBuffer("Tanu");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Rockstar");
        System.out.println(sb);
        sb.insert(0, "Mrs ");
        System.out.println(sb);







    }
}
