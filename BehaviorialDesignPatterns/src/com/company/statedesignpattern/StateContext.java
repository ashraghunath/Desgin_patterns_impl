package com.company.statedesignpattern;
public class StateContext {
    private State state;

    public StateContext(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
