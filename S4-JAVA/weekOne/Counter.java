

public class Counter {
    int CounterIndex;

    // Constructor
    public Counter(){
        CounterIndex = 0;

    }
    // Methods
    public void increase() {
        CounterIndex = CounterIndex + 1;
    }
    public void decrease(){
        CounterIndex = CounterIndex - 1;
    }
    int getCounterIndex(){
        return CounterIndex;
    }
    
}
