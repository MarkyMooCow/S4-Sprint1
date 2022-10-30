package weekSix;

import java.util.Hashtable;

// use Hashtables when you want to store key value pairs 

public class HashtablePrac {
    public static void main(String[] args) {
        Hashtable<WordHashtable, String> ht1 = new Hashtable<>();
        WordHashtable word1 = new WordHashtable("Apple");
        WordHashtable word2 = new WordHashtable("Potatoe");

        ht1.put(word1, "It's a fruit");
        ht1.put(word2, "It's a Vegetable");

        String def = ht1.get(word1); // retrieving the values 

        System.out.println(def);

        }

    
}
