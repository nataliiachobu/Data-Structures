import java.util.NoSuchElementException;

public class MyQueue <T>{
    QNode<T> front;
    QNode<T> back;
    int size;
    boolean isEmpty(){return front==null;}
    T peek () {
        return (T) front.value;
    }
        void enqueue(T item){
            QNode<T> node=new QNode<>();
            if(isEmpty()) front=back=node;
            else{
                back.next=node;
                back=node;
            }
            size++;
        }
        
        T dequeue(){
        QNode frontNode = null;
        if(isEmpty()) throw new NoSuchElementException();
        if(front==back){
            frontNode=front;
            front=back=null;
        }
        size--;
        return(T) frontNode.value;
        
        }
        int size(){return size;}
    }
    

