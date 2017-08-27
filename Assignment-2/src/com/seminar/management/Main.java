package com.seminar.management;

public class Main {

    public static void main(String[] args) {

        SessionBO sessionBO=new SessionBO();
        sessionBO.createSession();
        sessionBO.showListOfSessions();

        EnrollmentBO enrollmentBO=new EnrollmentBO();
        enrollmentBO.enrollSession(sessionBO);

    }
}
