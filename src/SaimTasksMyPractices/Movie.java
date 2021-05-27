package SaimTasksMyPractices;

public class Movie {
    public static void main(String[] args) {

        String name = "The Boy Who Harnessed The Wind";
        String genre = "drama";
        short releaseyear = 2019;
        double releasedate = 01.25;
        String fullreleasedate = "" + releasedate +  "." + releaseyear;
        char rating = 'G';
        boolean isasequals = false;
        byte rottenratings = 99;
        boolean isondvd = true;
        short hour = 1;
        int minutes = 33;



        System.out.println("To night we are streaming " + name + " which was released on " + fullreleasedate + "." + "\nThis " + genre + " movie got a "
                        + rottenratings + " rating on Rotten Tometoes" + "." + "The rating is " + rating + " and it runs for " + hour + " hour and "
                + minutes + " minutes. " + "\nThis is not a sequel + " + isasequals + " but is dvd " + isondvd);




    }
}
