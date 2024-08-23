import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int t = 0; //걸리는 시간
        int total_weight = 0; //다리위 지나가는 트럭 전체 무게
        int index = 0; 

        // 처음에 다리 상태를 0으로 만들고 
        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }
        
        //큐 반복문으로 모든 트럭이 다리 지나가도록 
        while (!bridge.isEmpty()) {
            t++; //시간이 증가하고
            
            total_weight -= bridge.poll(); //다리 맨앞에 트론 공간 poll()연산으로 처리하고 

            if (index < truck_weights.length) { //만약에 대기중인 트런이 아직 남아있으면
                if (total_weight + truck_weights[index] <= weight) {
                    bridge.add(truck_weights[index]);
                    total_weight += truck_weights[index];
                    index++;
                } else {
                    bridge.add(0);
                }
            }
        }
        return t; //모든 트럭이 다리 건너는데 걸리는 시간
    }
}
