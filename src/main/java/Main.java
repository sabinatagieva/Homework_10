public class Main<T> {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        // Выводим первый и последний элементы списка
        System.out.println("First " + list.getFirst());
        System.out.println("Last " + list.getLast());
    }
}
