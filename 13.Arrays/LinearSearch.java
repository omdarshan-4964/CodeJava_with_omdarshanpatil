public class LinearSearch {
    public static int Search(int array[], int key) {
        
        for(int i = 0; i<array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }

        return -1;

    }
    public static void main(String[] args) {
        int array[] = {10,20,30,40,50};
        int key = 90;

        int index = Search(array, key);
        if(index == -1) {
            System.out.println("NOT found!!");
        } else {
            System.out.println("The element is present at index " + index);
        }

    }
}
