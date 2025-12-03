package rvt;

public class Counter {
    private int value;

    public Counter(int startValue){
        this.value = startValue;
    }

    public Counter(){
        this.value = 0;
    }

    public int value(){
        return this.value;
    } 
    public void increase(){
        this.value = this.value + 1;
    }
    public void decrease(){
        this.value = this.value - 1;
    }

    public void increase(int increaseBy){
        if(increaseBy < 0){
            return;
        }

        this.value = this.value + increaseBy;
    }
    public void decrease(int decreaseBy){
       if(decreaseBy < 0){
            return;
       }
       this.value = this.value - decreaseBy;
    }

    public static void main(String[] args) {
       Counter counter = new Counter();

       System.out.println(counter.value());

       counter.increase();

       counter.decrease();

       counter.increase(4);

       counter.decrease(2);
       System.out.println(counter.value());

    }
}


