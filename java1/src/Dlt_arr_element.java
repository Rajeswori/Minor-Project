import java.util.*;
public class Dlt_arr_element {
    public static void main(String[] args) {
        int [] arr1 = Arrayutility.inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("\"Enter The The Number To Delete.\"");
        int dlt = sc.nextInt();
        int [] newArr = dlt(arr1, dlt);
        System.out.println("here is the new array.");
        Arrayutility.displayArr(newArr);


    }
    public static int[] dlt(int[] arr, int dlt){

        int occ = occurance.noOf(arr, dlt);
        if(occ == 0){
            return arr;
        }
        int newSize = arr.length - occ ;
        int[] newArry = new int[newSize];

        int i=0, j =0;
        while(i<newArry.length){
            if(newArry[i] != dlt){
                newArry[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArry;
        }


    }

