import java.util.*;

class TournamentWinner {
    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        Map<Integer, Integer> tournamentPoints = new HashMap<>();

        for (int i = 0; i < competitions.size(); i++) {
            winnerTeam = competitions.get(i).get(results.get(i));
            tournamentPoint.put(winnerTeam, map.getOrDefault(winnerTeam, 0) + 3);
        }

        return winnerTeam;
        
    }

    public static void main(String[] args) {
        ArrayList<String>> competitions = [["HTML", "C#"],["C#", "Python"],["Python", "HTML"]];
        ArrayList<Integer> results = [0, 0, 1];
        Map<Integer, Integer> tournamentPoints = tournamentWinner();
    }
}