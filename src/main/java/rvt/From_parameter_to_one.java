package rvt;

public class From_parameter_to_one {
    public static void main(String[] args){
      printFromNumberToOne(5);

    }
    
    public static void printFromNumberToOne(int num) {
        
        for (; num > 0;num--){
            System.out.println(num);
        }
    }
}
