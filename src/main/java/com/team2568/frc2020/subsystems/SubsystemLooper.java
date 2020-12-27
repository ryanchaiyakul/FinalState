package com.team2568.frc2020.subsystems;

import com.team2568.frc2020.ILooper;

public class SubsystemLooper extends ILooper {
    private static SubsystemLooper mInstance;

    public static SubsystemLooper getInstance() {
        if (mInstance == null) {
            mInstance = new SubsystemLooper();
        }
        return mInstance;
    }

    private SubsystemLooper() {
        super("subsystem");
    }
}
