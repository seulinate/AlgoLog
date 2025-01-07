import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder  sb = new StringBuilder();
        
        Member[] members = new Member[n];

        for (int i = 0; i < n; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            members[i] = new Member(age, name, i);
        }
        Arrays.sort(members, (a, b) -> {
            if (a.age == b.age) {
                return Integer.compare(a.order, b.order);
            }
            return Integer.compare(a.age, b.age);
        });

        for (Member member : members) {
            sb.append(member.age).append(" ").append(member.name).append("\n");
        }
        System.out.print(sb);
    }

    static class Member {
        int age;
        String name;
        int order; 

        public Member(int age, String name, int order) {
            this.age = age;
            this.name = name;
            this.order = order;
        }
    }
}
