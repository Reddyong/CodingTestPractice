package org.example.단속카메라;

public class Actions implements Comparable<Actions> {
    private int startTime;
    private int endTime;
    private boolean checked;

    public Actions() {
    }

    public Actions(int startTime, int endTime, boolean checked) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.checked = checked;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public int compareTo(Actions a) {
        return this.endTime - a.endTime;
    }

    @Override
    public String toString() {
        return "Actions{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
