package hangman;

import javax.swing.*;

public class HangmanGame extends GameGUI implements GameLogic, TimerLogic {
    private Thread timerThread;
    private boolean timerRunning;

    public HangmanGame() {
        super();
    }
    @Override
    protected void startGame() {
        guessedLetters.clear();
        attemptsLeft = 6;
        timeLeft = 60;
        updateDisplay();
        inputField.setEnabled(true);
        inputField.requestFocus();

        System.out.println("startGame() wurde aufgerufen");
        startTimer(); // Timer starten
    }


    @Override
    public void processInput() {
        String input = inputField.getText().toLowerCase().trim();
        inputField.setText("");

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Bitte gib genau einen Buchstaben ein.");
            return;
        }

        handleGuess(input.charAt(0));
    }

    @Override
    public void handleGuess(char guess) {
        if (guessedLetters.contains(guess)) {
            System.out.println("Diesen Buchstaben hast du schon geraten.");
            return;
        }

        guessedLetters.add(guess);

        if (currentWord.indexOf(guess) == -1) {
            attemptsLeft--;
        }

        updateDisplay();

        if (hasWon()) {
            endGame(true);
        } else if (attemptsLeft == 0) {
            endGame(false);
        }
    }

    @Override
    public boolean hasWon() {
        for (char c : currentWord.toCharArray()) {
            if (!guessedLetters.contains(c)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void endGame(boolean won) {
        stopTimer();
        String message = won ? "Glückwunsch! Du hast das Wort erraten: " + currentWord
                : "Spiel vorbei! Das Wort war: " + currentWord;
        SwingUtilities.invokeLater(() -> {
            inputField.setEnabled(false);
            JOptionPane.showMessageDialog(this, message);
        });
    }


        @Override
        public void startTimer() {
            timerRunning = true;
            timerThread = new Thread(() -> {
                while (timeLeft > 0 && timerRunning) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Timer unterbrochen.");
                        return;
                    }

                    timeLeft--;
                    System.out.println("Zeit aktualisiert: " + timeLeft);

                    SwingUtilities.invokeLater(() -> timeLabel.setText("Verbleibende Zeit: " + timeLeft));

                    if (timeLeft == 0) {
                        stopTimer();
                        SwingUtilities.invokeLater(() -> endGame(false));
                    }
                }
            });
            timerThread.start();
        }



    protected void stopTimer() {
        timerRunning = false;
        if (timerThread != null && timerThread.isAlive()) {
            timerThread.interrupt();
        }
    }
}
