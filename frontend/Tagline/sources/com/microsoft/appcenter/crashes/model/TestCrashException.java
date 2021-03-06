package com.microsoft.appcenter.crashes.model;

import android.support.annotation.VisibleForTesting;

public class TestCrashException extends RuntimeException {
    @VisibleForTesting
    static final String CRASH_MESSAGE = "Test crash exception generated by SDK";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TestCrashException() {
        super(CRASH_MESSAGE);
    }
}
