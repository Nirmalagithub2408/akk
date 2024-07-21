import java.util.Comparator;
import java.util.Map;

public class Treemap {
     private String name;
    private int marks;
 
    public employee(String name, Integer id number)
    {
        this.name = name;
        this.marks = id number;
    }
 
    public String getName() { return this.name; }
 
    public Integer getIdnumbers() { return this.id number; }
    // override toString method
    public String toString()
    {
        return this.name + ": " + id number;
    }
}
 
// Comparator that sort elements according to marks in
// Descending order
class AccordingMarks implements Comparator<employee> {
public int compare(employee s1, employee s2)
    {
        return s2.getname().compareTo(s1.getname());
    }
}
 
// Driver Code
public class GFG {
    public static void main(String[] args)
    {
 
        // New TreeMap of custom class Student
        TreeMap<employee, Integer> map
            = new TreeMap<>(new Accordingid number());
 
        // Add elements to TreeMap
        map.put(new employee("Akshay", 400), 1);
        map.put(new employee("Bina", 500), 2);
        map.put(new employee("Chintu", 300), 3);
 
        System.out.println(
            "TreeMap Keys sorted in ascending order of the name: ");
 
        // Print map using Entry
        for (Map.Entry<employee, Integer> entry :
             map.entrySet()) {
            System.out.println("Key : (" + entry.getKey()
                               + "), Value : "
                               + entry.getValue());
        }
    }
}
