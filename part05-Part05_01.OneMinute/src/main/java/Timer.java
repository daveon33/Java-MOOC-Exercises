/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daveon
 */
public class Timer {
    private int seconds;
    private int hundredOfSeconds;
    
    public Timer() {
        this.seconds = 0;
        this.hundredOfSeconds = 0;
    }
    
    public String toString() {
        if(seconds < 10 && hundredOfSeconds < 10) {
            return "0" + seconds + ":0"+ hundredOfSeconds;
        } else if(seconds < 10) {
            return "0" + seconds + ":" + hundredOfSeconds;
        } else if(hundredOfSeconds < 10) {
            return seconds + ":0" + hundredOfSeconds;
        }
        
        return seconds + ":" + hundredOfSeconds;
    }
    
    public void advance() {
        hundredOfSeconds += 1;
        
        if(this.seconds == 60) {
            seconds = 0;
        }
        
        if(this.hundredOfSeconds >= 100) {
            seconds++;
            hundredOfSeconds = 0;
        }
        
        
    }
    
    
}
