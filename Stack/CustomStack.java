package Stack;

public class CustomStack {
    private int[] arr;
    int top;

    CustomStack(int size) {
        arr = new int[size];
        top = -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Already Full");
            return;
        }
        top++;
        arr[top] = data;
    }

    public int peek() {
        return arr[top];
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Already Empty");
            return;
        }
        top--;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public static void main(String[] args) {
        CustomStack st = new CustomStack(2);
        st.push(5);
        st.push(510);
        st.push(710);

    }

}