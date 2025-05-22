/*package hangman;

import javax.swing.SwingUtilities;

public class TimerRunnable implements Runnable {
    private final Timer game;

    public TimerRunnable(Timer game) {
        this.game = game;
    }

    @Override
    public void run() {
        while (game.timeLeft > 0 && game.timerRunning) {
            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                return; // Exit safely if interrupted
            }

            game.timeLeft--;

            // Safely update the GUI
            SwingUtilities.invokeLater(() -> game.timeLabel.setText("Time left: " + game.timeLeft));

            if (game.timeLeft == 0) {
                // Stop the timer and end the game safely
                game.stopTimer();
                SwingUtilities.invokeLater(() -> game.endGame(false));
            }
        }
    }
} */

