package com.team2568.frc2020.registers;

/**
 * A Register augments writing and reading of a singluar value.
 */

public class Register<T> {
	private T mValue;
	public Object mLock = new Object();

	public void set(T value) {
		synchronized (mLock) {
			this.mValue = value;
		}
	}

	public T get() {
		synchronized (mLock) {
			return mValue;
		}
	}
}
