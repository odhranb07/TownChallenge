import java.util.Random;

//public class TownChallenge {
    public static void main(String[] args) {

        String[] towns = {"coleraine", "Belfast", "banbridge", "ballymoney", "newry",
                "enniskillen", "portadown", "bangor"};
        Random random = new Random();
        int homeScore, awayScore;

        homeScore = random.nextInt(10);
        awayScore = random.nextInt(10);
        System.out.println(towns[0] + " " + homeScore + " " +
                towns[1] + " " + awayScore);

        homeScore = random.nextInt(10);
        awayScore = random.nextInt(10);
        System.out.println(towns[2] + " " + homeScore + " " +
                towns[3] + " " + awayScore);

        homeScore = random.nextInt(10);
        awayScore = random.nextInt(10);
        System.out.println(towns[4] + " " + homeScore + " " +
                towns[5] + " " + awayScore);

        homeScore = random.nextInt(10);
        awayScore = random.nextInt(10);
        System.out.println(towns[6] + " " + homeScore + " " +
                towns[7] + " " + awayScore);
    }
//}
