package weekSix;

import java.util.ArrayList;

public class ArrayListPrac {
  public static void main(String[] args){
    // this is the syntax to create an ArrayList
    ArrayList<String> obj = new ArrayList<String>(10); // you can create an ArrayList of any type you need
    // String is a library class an so you dont need to create the object 
    obj.add("Alex");
    obj.add("Ainee");
    obj.add("David");
    
    ArrayList<PersonArrayList> obj2 = new ArrayList <PersonArrayList>(5);
    // with a custom class you neeed to create the object before it can be instaniated 
    PersonArrayList p1 = new PersonArrayList("John", "Smith");
    PersonArrayList p2 = new PersonArrayList("Geroge", "Ruby");
    PersonArrayList p3 = new PersonArrayList("Hayden", "Benoit");
    obj2.add(p1);
    obj2.add(p2);
    obj2.add(p3);
    System.out.println("my list = " + obj);

    // you can always use a for loop to print 
    for(int i = 0; i<obj2.size(); i ++){
        System.out.println(obj2.get(i));
        
    }
    obj.remove(1); // when removing from a String ArrayList you don't need to reference the object 
    System.out.println(obj);

    obj2.remove(p1);
    System.out.println(obj2);

    // you can add, remove, get the obj, check the size, get the index and others methods built into 
    // the ArrayList class 



    
  }
    
}
