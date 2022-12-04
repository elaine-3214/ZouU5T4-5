public class ActivityTracker {
    //instance variables
    private int goal;
    private int MaxMinutes;
    private int sessions;
    private int totalMinutes;

    //constructor
    public ActivityTracker(int goal) {
        this.goal = goal;
        MaxMinutes = 0;
        sessions = 0;
        totalMinutes = 0;
    }

    public void logMinutes(int minutes) {
        totalMinutes += minutes;
        sessions ++;
        if(minutes > MaxMinutes) {
            MaxMinutes = minutes;
        }
    }

    public int getSessions() {
        return sessions;
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }

    public int getMaxMinutes() {
        return MaxMinutes;
    }

    public boolean goalAchieved() {
        if(totalMinutes>=goal) {
            return true;
        } else {
            return false;
        }
    }
}
