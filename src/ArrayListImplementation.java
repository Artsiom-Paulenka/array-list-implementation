public class ArrayListImplementation {

    int[] array;
    private int size;

    public ArrayListImplementation(int capacity) {
        this.array = new int[capacity];
    }

    public void add(int element) {
        if (array.length == size) {
            grow();

        }
        array[size] = element;
        size++;
    }

    private void grow() {
        int newSize = array.length * 2;
        int[] newArray = new int[newSize];
        //Переложить все значения из старого массива в новый
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}

