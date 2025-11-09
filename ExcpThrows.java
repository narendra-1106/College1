public class ExcpThrows {

    public void printArray() throws ArrayIndexOutOfBoundsException {
        int[] a = {1, 2};
        System.out.println(a[3]);   // This will throw an exception
    }

    public static void main(String[] args) {
        ExcpThrows e = new ExcpThrows();

        try {
            e.printArray();
        } 
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception caught: " + ex);
        }
    }
}
