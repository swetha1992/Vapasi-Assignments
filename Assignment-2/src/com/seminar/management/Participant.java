package com.seminar.management;

public class Participant {

    private String participantName;
    private String enrolledSessionID;
    private String emailID;

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }
    public void setEnrolledSessionID(String enrolledSessionID) {
        this.enrolledSessionID = enrolledSessionID;
    }
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
    public String getParticipantName() {
        return participantName;
    }
}
