import java.util.*;

public class MatchesRoundRobin {
    public static void main(String[] args) {
        ArrayList<String> as = new ArrayList<>();
        Teams t = new Teams();
        t.setTeam1("team1");
        t.setTeam2("team2");
        t.setTeam3("team3");
        t.setTeam4("team4");
        t.setTeam5("team5");
        as.add(t.getTeam1());
        as.add(t.getTeam2());
        as.add(t.getTeam3());
        as.add(t.getTeam4());
        as.add(t.getTeam5());
        System.out.println(as);
        Sechudler sc = new Sechudler();
       // ArrayList<HashMap<String, String>> hm = sc.shedule(as);
        //System.out.println(hm);
        sc.Schedule(as);
    }
}

class Teams {
    private String team1;
    private String team2;
    private String team3;
    private String team4;
    private String team5;

    public void setTeam1(String str) {
        team1 = str;
    }

    public void setTeam2(String str) {
        team2 = str;
    }

    public void setTeam3(String str) {
        team3 = str;
    }

    public void setTeam4(String str) {
        team4 = str;
    }

    public void setTeam5(String str) {
        team5 = str;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public String getTeam3() {
        return team3;
    }

    public String getTeam4() {
        return team4;
    }

    public String getTeam5() {
        return team5;
    }
}

class Sechudler {
   /*  public ArrayList<HashMap<String, String>> shedule(ArrayList<String> as) {
        ArrayList<HashMap<String, String>> al = new ArrayList<>();
        for (int i = 0; i < as.size(); i++) {
            HashMap<String, String> hm = new HashMap<>();
            for (int j = i + 1; j < as.size(); j++) {
                hm.put(as.get(j), as.get(i));
            }
            al.add(hm);
        }
        return al;
    }*/
    public void Schedule(ArrayList<String> arr){
        int count[] = { 0, 0, 0, 0, 0 };
        Random r = new Random();
        for (int i = 0; i < arr.size(); i++) {
            //System.out.println("day " + (i + 1) + " Matches");
            for (int j = 0; j < arr.size() / 2; j++) {
                int t1 = (i + j) % (arr.size() - 1);
                int t2 = (arr.size() - 1 - j + i) % (arr.size() - 1);
                if (j == 0) {
                    t2 = arr.size() - 1;
                }
                System.out.println(arr.get(t1) + " VS " + arr.get(t2));
                System.out.println("Enter 0 if team " + arr.get(i) + " won else 1");
                int n = r.nextInt(2);
                if (n == 0) {
                    count[i] = count[i] + 1;
                    System.out.println(arr.get(i) + " won");
                } else {
                    count[j] = count[j] + 1;
                    System.out.println(arr.get(j) + " won");
                }
            }
        }
        for (int i = 0; i <= 4; i++) {
            System.out.println(arr.get(i) + " won " + count[i] + " matches");
            System.out.println(arr.get(i) + " lost " + (5-count[i]) +" matches");


        }

    }

}