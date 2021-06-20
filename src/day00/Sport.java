package day00;

public class Sport {
    String name;
    int numOfplayers;
    boolean teamBased;
    public void makeSport(String nameOfsport, int players, boolean teams){
        name = nameOfsport;
        numOfplayers = players;
        teamBased = teams;
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numOfplayers=" + numOfplayers +
                ", teamBased=" + teamBased +
                '}';
    }

    public static void main(String[] args) {
        Sport soccer = new Sport();
        soccer.makeSport("Soccer",22,true);
        System.out.println(soccer);
    }
}
