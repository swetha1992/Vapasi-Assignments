package com.seminar.management;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class SessionHandler {
    private List<Session> sessionList = new ArrayList<Session>();

    public List<Session> getSessionList() {
        return sessionList;
    }
    public void setSessionList(List<Session> sessionList) {
        this.sessionList = sessionList;
    }

    public void showListOfSessions() {
        if (getSessionList() != null) {
            System.out.println("Session ID -- Session Name -- Host Name -- Total Participants -- Enrolled Participants --Participants List -- Start time -- end time");
            for (Session session : getSessionList()) {
                StringBuffer participantsList=new StringBuffer();
                for(Participant participant:session.getParticipantsList()){
                    participantsList.append(participant.getParticipantName());
                }
                System.out.println("\t" + session.getSessionId() + " \t\t\t " + session.getSessionName() + " \t\t " + session.getHostName() + "\t\t\t" + session.getTotalParticipantsCount() + "\t\t\t\t\t\t\t" + session.getEnrolledParticipantsCount() +"\t\t"+participantsList +"\t\t\t\t\t" + session.getStartTime() + "\t\t" + session.getEndTime());
            }
        }
    }

    public void createSession() {
        List<Session> listOfSession = new ArrayList<Session>();
        //Session object 1
        Session session1 = new Session("java", 1, "swetha m", 20, 0, Time.valueOf("09:00:00"), Time.valueOf("11:00:00"));
        //Session object 2
        Session session2 = new Session("AWS", 2, "kowshik", 10, 0, Time.valueOf("11:00:00"), Time.valueOf("13:00:00"));
        //Session object 3
        Session session3 = new Session("Tax", 3, "Priyanka", 10, 0, Time.valueOf("14:00:00"), Time.valueOf("16:00:00"));
        listOfSession.add(session1);
        listOfSession.add(session2);
        listOfSession.add(session3);
        setSessionList(listOfSession);
    }

    public void enrollSession(int sessionID) {
        if (isSessionAvailable(sessionID)) {
            System.out.println("Seats available");
            addParticipantsToSession(sessionID);
        } else {
            System.out.println("No seats available");
        }
    }

    public boolean isSessionAvailable(int sessionID) {
        Boolean availability = Boolean.FALSE;
        for (Session session : getSessionList()) {
            if (sessionID == session.getSessionId()) {
                if (session.getEnrolledParticipantsCount() < session.getTotalParticipantsCount()) {
                    availability = Boolean.TRUE;
                }
            }
        }
        return availability;
    }

    public void addParticipantsToSession(int sessionID) {
        for (Session session : getSessionList()) {
            if (sessionID == session.getSessionId()) {
                System.out.println("please enter the following details");
                Participant participant = new Participant();
                participant.setParticipantName("murali");//get from user
                participant.setEnrolledSessionID("8");
                participant.setEmailID("murali@gmail.com");
                session.getParticipantsList().add(participant);
                session.setEnrolledParticipantsCount(session.getEnrolledParticipantsCount() + 1);
                showListOfSessions();
            }
        }
    }
}