import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Supermarket <S extends Human>{
    String name;

    public Supermarket(String name) {
        this.name = name;
    }

    Queue<S> queue1 = new ArrayDeque<>(3);
    Queue<S> queue2 = new ArrayDeque<>(3);

    public void addHuman(S human){
        addHuman2(human, queue1, queue2);
    }

    private void addHuman2(S human, Queue<S> queue1, Queue<S> queue2){
        if(queue1.size() == 3 && queue2.size() == 3){
            System.out.println("Нужно позвать Галю");
            return;
        }
        if(queue1.size() < queue2.size()){
            queue1.offer(human);
        } else {
            queue2.offer(human);
        }
    }

    public void printInfo(){
        System.out.println(queue1);
        System.out.println(queue2);
    }

    public void removeHuman(S human){
        queue1.remove(human);
    }



}
