package com.seminar.management;

import java.sql.Time;
import java.util.ArrayList;
import java.util.*;
public class SessionVO {
    String sessionName;
    int sessionId;
    String hostName;
    int totalParticipantsCount;
    int enrolledParticipantsCount;
    Time startTime;
    Time endTime;

    public List<ParticipantVO> getParticipantsList() {
        return participantsList;
    }

    public void setParticipantsList(List<ParticipantVO> participantsList) {
        this.participantsList = participantsList;
    }

    List<ParticipantVO> participantsList=new ArrayList<ParticipantVO>();

    public int getTotalParticipantsCount() {
        return totalParticipantsCount;
    }

    public void setTotalParticipantsCount(int totalParticipantsCount) {
        this.totalParticipantsCount = totalParticipantsCount;
    }

    public int getEnrolledParticipantsCount() {
        return enrolledParticipantsCount;
    }

    public void setEnrolledParticipantsCount(int enrolledParticipantsCount) {
        this.enrolledParticipantsCount = enrolledParticipantsCount;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }
}
