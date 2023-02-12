public class ArrayListImplementation {
    // Создаем новые переменные array массив и size
    int[] array;
    private int size;

    //Создали конструктор
    public ArrayListImplementation(int capacity) {

        this.array = new int[capacity];
    }

    //Создали метод add
    public void add(int element) {
        //Если длина массива равна длине последнему индексу в массиве значит массив заполнен
        //Используем метод grow
        if (array.length == size) {
            grow();

        }
        // Переменной int[] array с индексом size присвоить параметр метода element
        array[size] = element;
        size++;
    }

    //Создаем
    private void grow() {
        //Создаем новую переменную с размером  в 2 раза больше длины старого массива
        int newSize = array.length * 2;
        // Присваиваем новому массиву новый размер
        int[] newArray = new int[newSize];
        //Переложить все значения из старого массива в новый c помощью цикла
        for (int i = 0; i < array.length; i++) {
            //В новый мссив записываю значения из старого массива или новому массива
            // присвоить знаения старого масива
            newArray[i] = array[i];
        }
        //Теперь ссылка на какой-то массив это новый массив
        array = newArray;
    }

    //////ДОМАШКА///////
    public int size() {
        return size;

    }

    public void printInScreen() {
        String arrayList = "[";

        for (int i = 0; i < size; i++) {
            arrayList += array[i];
        }
        arrayList += "]";
    }

    public void remove(int index) {

        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = 0;
        size--;
    }

    public void addAdd(int index, int element) {

        if (array.length == size) {
            grow();
        }

        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }

        array[index] = element;
        size++;
    }
}
//плагиат, но делал все по памяти после просмотра-совсем время на все не хватает

