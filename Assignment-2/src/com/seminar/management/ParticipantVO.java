package com.seminar.management;

public class ParticipantVO {


    String participantName;
    String enrolledSessionID;
    String emailID;

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getEnrolledSessionID() {
        return enrolledSessionID;
    }

    public void setEnrolledSessionID(String enrolledSessionID) {
        this.enrolledSessionID = enrolledSessionID;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

}
