
public class CombineArrays {
    //ASDF
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int[] arr1And2 = new int[arr1.length+arr2.length];
        for(int x=0;x<arr1.length;x++){
            arr1And2[x] = arr1[x];
        }
        for(int x=arr1.length;x<arr1And2.length;x++){
            arr1And2[x] = arr2[x-arr1.length];
        }
        return arr1And2;
    }
}
