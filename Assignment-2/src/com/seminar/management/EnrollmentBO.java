package com.seminar.management;

public class EnrollmentBO {

    public void enrollSession(SessionBO sessionBO) {
        System.out.println("Enter session id to which you wish to enroll");
        int sessionID = 2; //get from user
        for(SessionVO session : sessionBO.getSessionList()) {
            if(sessionID==session.getSessionId()){
                if(session.getEnrolledParticipantsCount()<session.getTotalParticipantsCount()){
                    System.out.println("Seats available");
                    System.out.println("please enter the following details");

                    ParticipantVO participantVO=new ParticipantVO();
                    participantVO.setParticipantName("murali");//get from user
                    participantVO.setEnrolledSessionID("8");
                    participantVO.setEmailID("murali@gmail.com");

                    session.getParticipantsList().add(participantVO);
                    session.setEnrolledParticipantsCount(session.getEnrolledParticipantsCount()+1);
                    sessionBO.showListOfSessions();
                }else{
                    System.out.println("seats not available");
                }
            }
        }
    }
}
