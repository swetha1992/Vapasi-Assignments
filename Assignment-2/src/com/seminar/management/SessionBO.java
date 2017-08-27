package com.seminar.management;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

    public class SessionBO {
    List<SessionVO> sessionList = new ArrayList<SessionVO>();
    public List<SessionVO> getSessionList() {
        return sessionList;
    }
    public void setSessionList(List<SessionVO> sessionList) {
        this.sessionList = sessionList;
    }

    public void showListOfSessions(){
        if(getSessionList()!=null){
            System.out.println("Session ID -- Session Name -- Host Name -- Total Participants -- Enrolled Participants -- Start time -- end time");
            for (SessionVO session :getSessionList()){
                System.out.println("\t"+session.getSessionId()+" \t\t\t " +session.getSessionName()+" \t\t "+session.getHostName()+"\t\t\t" +session.getTotalParticipantsCount()+"\t\t\t\t\t\t\t"+session.getEnrolledParticipantsCount()+"\t\t\t\t\t"+session.getStartTime()+"\t\t" +session.getEndTime());
            }
        }
    }

    public void createSession(){
        //Session object 1
        Random random = new Random();
        SessionVO sessionVO1=new SessionVO();
        sessionVO1.setSessionId(1);
        sessionVO1.setHostName("swetha m");
        sessionVO1.setSessionName("java");
        sessionVO1.setTotalParticipantsCount(20);
        sessionVO1.setEnrolledParticipantsCount(0);
        sessionVO1.setStartTime(Time.valueOf("09:00:00"));
        sessionVO1.setEndTime(Time.valueOf("11:00:00"));

        //Session object 2
        SessionVO sessionVO2=new SessionVO();
        sessionVO2.setSessionId(2);
        sessionVO2.setHostName("kowshik");
        sessionVO2.setSessionName("aws");
        sessionVO2.setTotalParticipantsCount(10);
        sessionVO2.setEnrolledParticipantsCount(0);
        sessionVO2.setStartTime(Time.valueOf("11:00:00"));
        sessionVO2.setEndTime(Time.valueOf("13:00:00"));

        //Session object 3
        SessionVO sessionVO3=new SessionVO();
        sessionVO3.setSessionId(3);
        sessionVO3.setHostName("priyanka");
        sessionVO3.setSessionName("tax");
        sessionVO3.setTotalParticipantsCount(10);
        sessionVO3.setEnrolledParticipantsCount(0);
        sessionVO3.setStartTime(Time.valueOf("14:00:00"));
        sessionVO3.setEndTime(Time.valueOf("16:00:00"));

        sessionList.add(sessionVO1);
        sessionList.add(sessionVO2);
        sessionList.add(sessionVO3);
        setSessionList(sessionList);
    }
}
