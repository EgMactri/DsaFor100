package TimeAndSpaceComplexity;

public class BasicComplexity {
    public static void main(String[] args) {
        //TC != time taken because
        //window take 2 sec
        //where same work done in 1 sec in macbook
        //TC-->Rate at which the time taken increases with respect to the input size

//        for(int i = 1; i <= N; i++){
//            System.out.println("hello");
//        }

        //Rule for Time Complexity

        //-->worst case scenario
        //-->avoid constants
        //O(4*10^16 + 3*10^5 + 8)--avoid 8 because this is very small
        //-->avoid lower values
        //O(4*10^16 + 3*10^5)--avoid 3*10^5 because this is very small as compare to 10^15

        //Big-Oh{O(time taken)}-->above loop(upper bound)
        //5*3=15-->O(3*5)-->worst case-->O(3*N)

        //Omega{(time taken)}-->lower bound (best case) TC-->O(1)

        //Theta{0(time taken)}-->average case (sum of best + worst )/2

    }
}
