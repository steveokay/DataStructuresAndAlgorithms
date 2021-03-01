public class QueueStruct {

    boolean isFull(Queue queue){
        return (queue.capacity == queue.size);
    }

    boolean isEmpty(Queue queue){
        return (queue.capacity == 0);
    }
}
