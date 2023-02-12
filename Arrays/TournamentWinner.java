import java.util.*;

class TournamentWinner {
    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<Integer, Integer> tournamentPoints = new HashMap<>();

        for (int i = 0; i < competitions.size(); i++) {
            String winnerTeam = competitions.get(i)[results.get(i)];
            winnerTeam.computeIfPresent(winnerTeam, (k, v) -> v + 3);
        }

        return tournamentPoints.getKey(3);
    }

    public static void main(String[] args) {
        ArrayList<String>> competitions = [["HTML", "C#"],["C#", "Python"],["Python", "HTML"]];
        ArrayList<Integer> results = [0, 0, 1];
        Map<Integer, Integer> tournamentPoints = tournamentWinner()
    }
}