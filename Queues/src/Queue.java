public class Queue {

    int capacity;
    int rear;
    int front;
    int size;
    int array[];

    Queue(int queueCapacity){
        capacity = queueCapacity;
        front = size = 0;
        rear = queueCapacity - 1;
        array = new int[queueCapacity];
    }

}
