import java.util.Scanner;

public class ques11 {

   
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3); // 0, 1, 2
        switch (choice) {
            case 0: return "rock";
            case 1: return "paper";
            default: return "scissors";
        }
    }

  
    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

   
    public static String[][] calculateStats(int userWins, int computerWins, int draws, int totalGames) {
        double userPercent = ((double) userWins / totalGames) * 100;
        double compPercent = ((double) computerWins / totalGames) * 100;

        String[][] stats = {
            {"Player Wins", String.valueOf(userWins)},
            {"Computer Wins", String.valueOf(computerWins)},
            {"Draws", String.valueOf(draws)},
            {"Player Win %", String.format("%.2f", userPercent) + "%"},
            {"Computer Win %", String.format("%.2f", compPercent) + "%"}
        };
        return stats;
    }

 
    public static void displayResults(String[][] rounds, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.printf("%-10s %-15s %-15s %-10s\n", "Round", "Player Choice", "Computer Choice", "Winner");
        for (int i = 0; i < rounds.length; i++) {
            System.out.printf("%-10s %-15s %-15s %-10s\n", 
                              "Game " + (i + 1), rounds[i][0], rounds[i][1], rounds[i][2]);
        }

        System.out.println("\nStatistics:");
        for (String[] row : stats) {
            System.out.printf("%-18s: %s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter number of games to play: ");
        int numGames = scanner.nextInt();

        int userWins = 0, computerWins = 0, draws = 0;
        String[][] gameData = new String[numGames][3]; 

   
        for (int i = 0; i < numGames; i++) {
            System.out.print("\nRound " + (i + 1) + " - Enter rock, paper, or scissors: ");
            String userChoice = scanner.next().toLowerCase();

      
            while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.print("Invalid input. Enter rock, paper, or scissors: ");
                userChoice = scanner.next().toLowerCase();
            }

            String computerChoice = getComputerChoice();
            String winner = getWinner(userChoice, computerChoice);

   
            gameData[i][0] = userChoice;
            gameData[i][1] = computerChoice;
            gameData[i][2] = winner;

    
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;
        }


        String[][] stats = calculateStats(userWins, computerWins, draws, numGames);

     
        displayResults(gameData, stats);
    }
}
