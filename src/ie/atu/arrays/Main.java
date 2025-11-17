package ie.atu.arrays;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("An Array of Char");
        char[] smth = new char[4];

     for (int i = 0; i < smth.length; i++) {
            System.out.println("Element " + i + ": '" + smth[i] + "'");
        }

        System.out.println();
        System.out.println("An Array of Double");
    
        double[] nums = {1.5, 2.5, 3.5, 4.5};

        for(int i = 0; i < nums.length; i++){
            System.out.println("Element " + i + ": '" + nums[i] + "'");
        }

        System.out.println();
        System.out.println("Printing reversed array: ");

        int[] arr = {10, 20, 30, 40, 50};

        for(int i = (arr.length - 1); i>= 0; i-- ){
             System.out.println("Element " + i + ": '" + arr[i] + "'");
        }

        System.out.println();
        System.out.println("Rainbow ");

        String[] rainbow = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
        System.out.println("The length of rainbow array is: " + rainbow.length);


        System.out.println();
        System.out.println("Modifying: ");

        int[] other = {10, 20, 30, 40};
        other[2] = 35;
        for(int i = 0; i < other.length; i++){
            System.out.println("Element " + i + ": '" + other[i] + "'");
        }
        

        System.out.println();
        System.out.println("Arrays of objects: ");

        Book[] books = new Book[2];

        books[0] = new Book("Shevchenko", "Kobzar");
        books[1]= new Book("Shakespeare", "Romeo and Juliet");

        for(Book book : books){
            System.out.println("Poet: " + book.getName() + ", Book's Title: " + book.getCover());
        }

         System.out.println();
        System.out.println("Arrays Operations: ");

        int[] original = {5, 6 ,8 , 9, 10, 4, 2, 3, 1, 7};
        int[] copy = new int[original.length];

        System.arraycopy(original, 0, copy, 0, original.length);

        Arrays.sort(copy);
        
        System.out.println("Sorted and copieed array: " + Arrays.toString(copy));


        System.out.println();
        System.out.println("2D Array: ");

        int[][] table = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int sum = 0;
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                System.out.print(table[i][j] + " ");
                
            }
            System.out.println();
        }  
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                sum += table[i][j];
            }
        }
        System.out.println("The sum of elements is: " + sum);
    }
}
