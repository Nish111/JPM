package section10;

import section9.challenges.Song;

import java.util.ArrayList;
import java.util.Collections;

public class GenericsMain137 {
    public static void main(String[] args) {
        FootballPlayer loid = new FootballPlayer("Loid");
        BaseballPlayer yor = new BaseballPlayer("Yor");
        SoccerPlayer bond = new SoccerPlayer("Bond");

        Team<FootballPlayer> masterclassGenerics = new Team<>("Masterclass Generics");
        masterclassGenerics.addPLayer(loid);
        //masterclassGenerics.addPLayer(yor);
        //masterclassGenerics.addPLayer(bond);

        System.out.println(masterclassGenerics.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Spy Club");
        baseballTeam.addPLayer(yor);

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPLayer(bond);
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer anya = new FootballPlayer("Anya");

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        hawthorn.matchResult(fremantle, 1,0);
        hawthorn.matchResult(masterclassGenerics, 3, 8);
        masterclassGenerics.matchResult(fremantle, 2, 1);
        //masterclassGenerics.matchResult(baseballTeam,1,1);

        System.out.println("Rankings");
        System.out.println(masterclassGenerics.getName() + ": " + masterclassGenerics.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(masterclassGenerics.compareTo(melbourne));
        System.out.println(hawthorn.compareTo(masterclassGenerics));
        System.out.println(melbourne.compareTo(fremantle));

        //ArrayList<Team> teams;
        //Collections.sort(teams);
    }
}
