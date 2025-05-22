/*package hangman;

import hangman.TimerLogic;
import hangman.TimerRunnable;

import java.awt.event.WindowEvent;

public class Timer extends Game implements TimerLogic {
    protected Thread timerThread;
    protected boolean timerRunning;

    @Override
    protected void startGame(){
        guessedLetters.clear();
        attemptsLeft = 6;
        timeLeft = 60;
        updateDisplay();
        inputField.setEnabled(true);
        inputField.requestFocus();
        startTimer();
    }
    public void startTimer(){
        timerRunning = true;
        timerThread = new Thread(new TimerRunnable(this));
        timerThread.start();
    }
    protected void stopTimer(){
        timerRunning = false;
        if(timerThread != null){
            timerThread.interrupt();
        }
    }

} */
