import java.util.LinkedList;

public class Main {
    /*Реализуйте очередь с помощью LinkedList со следующими методами:
            • enqueue() — помещает элемент в конец очереди,
            • dequeue() — возвращает первый элемент из очереди и удаляет его,
• first() — возвращает первый элемент из очереди, не удаляя.*/
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        enqueue(1,list);
        int a = dequeue(list);
        int b = first(list);



    }

    private static int first(LinkedList<Integer> list) {
        return list.getFirst();
    }

    private static int dequeue(LinkedList<Integer> list) {
        return list.removeFirst();
    }

    private static void enqueue(int i, LinkedList<Integer> list) {
        list.addLast(i);
    }
}
