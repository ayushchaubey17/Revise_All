public class ClassLoader {
    public static void main(String[] args)  throws  ClassNotFoundException{
         Class<?> cls =  Class.forName("HashMap");
        System.out.println(cls.getClasses());
        System.out.println(cls.getName());
        System.out.println(cls.getPackageName());
        System.out.println(cls.descriptorString());
    }
}
