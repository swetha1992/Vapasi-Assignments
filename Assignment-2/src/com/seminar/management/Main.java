package com.seminar.management;

public class Main {

    public static void main(String[] args) {
        SessionHandler sessionHandler =new SessionHandler();
        sessionHandler.createSession();
        sessionHandler.showListOfSessions();

        System.out.println("Enter session id to which you wish to enroll");
        int sessionID1 = 2; //get from user
        sessionHandler.enrollSession(sessionID1);
    }
}
