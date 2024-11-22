class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
       
        int sum = 0;
        double average;
        
       
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; 
        }
        
        average = (double) sum / numbers.length;
     
        System.out.println("Total sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
    }
}
