package com.cg.HomeWorkOnMap;

public class MarkSheet {
	private float english;
	private float science;
	private float maths;
	
	public MarkSheet(float english, float science, float maths) {
		super();
		this.english = english;
		this.science = science;
		this.maths = maths;
	}
	
	@Override
	public String toString() {
		return "MarkSheet [english=" + english + ", science=" + science + ", maths=" + maths + "]";
	}
	
	public float getEnglish() {
		return english;
	}
	public void setEnglish(float english) {
		this.english = english;
	}
	public float getScience() {
		return science;
	}
	public void setScience(float science) {
		this.science = science;
	}
	public float getMaths() {
		return maths;
	}
	public void setMaths(float maths) {
		this.maths = maths;
	}

	
}
