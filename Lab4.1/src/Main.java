public class Main{

    public static void main(String[] args){
        Toolbox tb = new Toolbox();
        /* Table is the times table which will be shown, value comes from 
        user input.
        
        Count keeps track of the number of iterations in the second 
        part of the program
        
        Sum keeps track of the sum of the consecutive numbers which have 
        been added at any point
        */
        Integer table = tb.readIntegerFromCmd(), count = 1, sum =1;
        // For loop to iterate through the specified times table
        for(Integer i = 1; i < 21; i++){
           System.out.println(i+ " x " +table+" is "+i*table);
        }
        System.out.println("Calculating number of successive integers needed to add to a total of over 500...");
        // Adds consecutive integers starting from 1 and prints iterations needed
        while (sum < 500){
            count ++;
            sum += count;
        }
        System.out.println(count + " iterations. ");
    }
}
