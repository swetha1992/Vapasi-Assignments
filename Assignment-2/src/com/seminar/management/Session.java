package com.seminar.management;
import java.sql.Time;
import java.util.ArrayList;
import java.util.*;
public class Session {
    private String sessionName;
    private int sessionId;
    private String hostName;
    private int totalParticipantsCount;
    private int enrolledParticipantsCount;
    private Time startTime;
    private Time endTime;
    private List<Participant> participantsList=new ArrayList<Participant>();

    public Session(String sessionName, int sessionId, String hostName, int totalParticipantsCount, int enrolledParticipantsCount, Time startTime, Time endTime) {
        this.sessionName = sessionName;
        this.sessionId = sessionId;
        this.hostName = hostName;
        this.totalParticipantsCount = totalParticipantsCount;
        this.enrolledParticipantsCount = enrolledParticipantsCount;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public List<Participant> getParticipantsList() {
        return participantsList;
    }
    public int getTotalParticipantsCount() {
        return totalParticipantsCount;
    }
    public int getEnrolledParticipantsCount() {
        return enrolledParticipantsCount;
    }
    public void setEnrolledParticipantsCount(int enrolledParticipantsCount) {
        this.enrolledParticipantsCount = enrolledParticipantsCount; }
    public String getSessionName() {
        return sessionName;
    }
    public int getSessionId() {
        return sessionId;
    }
    public String getHostName() {
        return hostName;
    }
    public Time getStartTime() {
        return startTime;
    }
    public Time getEndTime() {
        return endTime;
    }
}
