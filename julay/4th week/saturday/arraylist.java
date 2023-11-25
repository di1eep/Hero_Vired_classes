import java.util.ArrayList;

public class arraylist {
  ArrayList<String> name = new ArrayList<>();
        name.add("Hero");
        name.add("Vired");
        name.add("Python");
        name.add("Java");
        System.out.println(name);

        name.remove(0);
        System.out.println(name);

        name.set(0 , "Class");
        System.out.println(name);

        Collections.reverse(name);
        System.out.println(name);
        
        Collections.shuffle(name);
        System.out.println(name);
}
