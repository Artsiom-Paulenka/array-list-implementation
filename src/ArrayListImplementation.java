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
}

