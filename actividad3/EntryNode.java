package actividad3;

public class EntryNode<E> {
    private E data;
    private int priority;

    public EntryNode(E data, int priority) {
        this.data = data;
        this.priority = priority;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
