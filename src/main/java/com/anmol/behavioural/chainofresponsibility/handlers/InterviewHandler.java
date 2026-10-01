package com.anmol.behavioural.chainofresponsibility.handlers;

public abstract class InterviewHandler {
    protected InterviewHandler next;

    public InterviewHandler setNext(InterviewHandler next) {
        this.next = next;
        return next;
    }

    protected void callNext(String candidate) {
        if(next != null) {
            next.hire(candidate);
        } else {
            System.out.println(candidate + " cleared all technical rounds!!!");
        }
    }

    public abstract void hire(String candidate);
}
