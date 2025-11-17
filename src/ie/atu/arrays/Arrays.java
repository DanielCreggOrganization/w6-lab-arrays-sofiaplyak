package ie.atu.arrays;
import java.util.Arrays;

class Arrayss{
    public static void main(String[] args){
        String[] array1 = {"Sofiia", "Iryna"};
        String[] array2 = {"Sonia", "Ira"};


        System.out.println("Equaled arrays: " + Arrays.equals(array1, array2));

        System.out.println();
        System.out.println("Cloning");
        String[] clone = array2.clone();

        clone[1] = "Irysia";
        System.out.println("Original array: " + Arrays.toString(array2));
        System.out.println("Cloned array: " + Arrays.toString(clone));

    }
}