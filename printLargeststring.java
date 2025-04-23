public class printLargeststring{
    public static void main(String args[]) {
        String fruites[] = {"apple", "mango", "banana"};

        String largest = fruites[0];
        for(int i=1; i<fruites.length; i++) { // loop chalega 1 se fruits ke lenth tak
            // compare karenge string ko 
            if(largest.compareTo(fruites[i]) < 0){ // compare ek function hai
            largest = fruites[i];
        }
    }
    System.out.println(largest);
    }
}

