package pl.allowsik.apvp;

import java.util.LinkedList;

public class DuelQueue {
  private static DuelQueue instance = null;
  private LinkedList<String> players = new LinkedList<>();

  private DuelQueue() {
  }

  public static DuelQueue getInstance() {
    if (instance == null) {
      instance = new DuelQueue();
    }
    return instance;
  }

  public void addPlayer(String player) {
    players.add(player);
    System.out.println(player + " has joined the queue.");
  }

  public void removePlayer(String player) {
    if (players.remove(player)) {
      System.out.println(player + " has been removed from the queue.");
    } else {
      System.out.println(player + " is not in the queue.");
    }
  }

  public void duel() {
    if (players.size() >= 2) {
      String player1 = players.poll();
      String player2 = players.poll();
      System.out.println(player1 + " and " + player2 + " are now dueling!");
    } else {
      System.out.println("Not enough players in the queue to start a duel.");
    }
  }

  public boolean isInQueue(String player) {
    return players.contains(player);
  }
}
