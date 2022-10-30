

public class CounterDemo {

    public static void main(String[] args){
        Counter counter1 = new Counter();
        counter1.increase();
        int a = counter1.getCounterIndex();
        counter1.increase();
        int b = counter1.getCounterIndex();
        if ( a>b)
        counter1.increase();
        else
        counter1.decrease();

        System.out.println(counter1.getCounterIndex());
    }
    
}
