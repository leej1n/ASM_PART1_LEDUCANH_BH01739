public class StudentStack2 {
    private Node top;
    private int size;

    private static class Node {
        Student student;
        Node next;

        Node(Student student, Node next) {
            this.student = student;
            this.next = next;
        }
    }

    public StudentStack2() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void push(Student student) {
        top = new Node(student, top);
        size++;
    }

    public Student pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Student student = top.student;
        top = top.next;
        size--;
        return student;
    }

    public Student peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.student;
    }
}
