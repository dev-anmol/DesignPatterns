package com.anmol.behavioural.chainofresponsibility.process;

import com.anmol.behavioural.chainofresponsibility.handlers.BarRaiserInterview;
import com.anmol.behavioural.chainofresponsibility.handlers.HRInterview;
import com.anmol.behavioural.chainofresponsibility.handlers.InterviewHandler;
import com.anmol.behavioural.chainofresponsibility.handlers.TechnicalInterview;

public class InterviewProcess {
    public final InterviewHandler chain;

    public InterviewProcess() {
        this.chain = new TechnicalInterview();
        this.chain.setNext(new BarRaiserInterview()).setNext(new HRInterview());
    }

    public void start(String candidate) {
        chain.hire(candidate);
    }
}
