package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        int[][] array = arrayUtils.createArray();
        arrayUtils.printArray(array);
    }
}
