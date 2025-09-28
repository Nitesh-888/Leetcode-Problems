import java.util.LinkedList;
import java.util.Queue;
class RecentCounter {
    int counter;
    Queue<Integer> q;
    public RecentCounter() {
        counter = 0;
        q = new LinkedList<>();
    }
    
    public int ping(int t) {
        q.add(t);
        while(q.peek()<t-3000){
            q.remove();
        }
        return q.size();
    }
}
