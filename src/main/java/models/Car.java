package models;

import interfaces.Engine;

public class Car extends Vehicle implements Engine {
    private boolean engineStarted;

    private void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
        }
    }
    private void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
        }
    }
    @Override
    public boolean isEngineStarted() {
        return engineStarted;
    }
    @Override
    public void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }

}
