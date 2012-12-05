/*
 * OntrackBean.java
 * October 7th 2012
 * Copyright Jeff Stern and Nick Olano
 */

package edu.elon.ontrack;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.faces.model.SelectItem;

/**
 * The OnTrack bean performs all of the validation and page navigation for the Ontrack app.
 * 
 * @author jeffreyStern
 * @author nicholasOlano
 *
 */
public class OntrackBean implements Serializable {

	private String courseNum;
	private String section;
	private String terms;
	private String subject;
	private String subject1;
	private String subject2;
	private String subject3;
	private String subject4;
	
	private String startTime;
	private String endTime;
	
	private String level;
	private String startingDate;
	private String endingDate;
	private String selection;

	private static final long serialVersionUID = 1L;

	/**
	 *  Required empty constructor
	 */
	public OntrackBean(){
		
	}
	
	/**
	 * Performs a validation check to see if any of the subjects have been left empty.
	 * 
	 * @return Returns a redirect to the ontrack selection page.
	 */
	public String check(){

		if(subject1.isEmpty()){
			subject1= "no selection";
		}
		if(subject2.isEmpty()){
			subject2= "no selection";
		}
		if(subject3.isEmpty()){
			subject3= "no selection";
		}
		if(subject4.isEmpty()){
			subject4= "no selection";
		}
		return "ontrackSelection";
	}
	
	private SelectItem[] termsItems  = {
			new SelectItem(null, "", "", false, false, true),
			new SelectItem("Winter 2013"),
			new SelectItem("Fall 2012")
	};
	
	private SelectItem[] timeItems  = {
			new SelectItem(null, "", "", false, false, true),
			new SelectItem("5am"),
			new SelectItem("6am"), 
			new SelectItem("7am"), 
			new SelectItem("8am"),
			new SelectItem("9am"),
			new SelectItem("10am"),
			new SelectItem("11am"),
			new SelectItem("12am"), 
			new SelectItem("1pm"),
			new SelectItem("2pm"), 
			new SelectItem("3pm"), 
			new SelectItem("4pm"), 
			new SelectItem("5pm"), 
			new SelectItem("6pm"), 
			new SelectItem("7pm"), 
			new SelectItem("8pm"), 
			new SelectItem("9pm"), 
			new SelectItem("10pm")
	};
	private SelectItem[] subjectItems  = {
			new SelectItem(null, "", "", false, false, true),
			new SelectItem("Biology"),
			new SelectItem("Chemistry"),
			new SelectItem("Italian"),
			new SelectItem("Computer Sci"),
			new SelectItem("Information Sci"),
			new SelectItem("Mathematics"),
	};
	private SelectItem[] levelItems  = {
			new SelectItem(null, "", "", false, false, true),
			new SelectItem("First Year"),
			new SelectItem("Second Year"),
			new SelectItem("Third Year"),
			new SelectItem("Pseudo Advanced"),
			new SelectItem("Third Year"),
			new SelectItem("Fourth Year"),
	};

	
	// Following are the getters and setters for all of the form elements on the Ontrack page.
	
	public SelectItem[] getLevelItems() {
		return levelItems;
	}

	public void setLevelItems(SelectItem[] levelItems) {
		this.levelItems = levelItems;
	}

	public SelectItem[] getSubjectItems() {
		return subjectItems;
	}

	public void setSubjectItems(SelectItem[] subjectItems) {
		this.subjectItems = subjectItems;
	}

	public String getTerms(){
		return terms;
	}
	public SelectItem[] getTermsItems() {
		return termsItems;
	}
	
	public void setTerms(String newTerms){
		terms = newTerms;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject1() {
		return subject1;
	}

	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}
	public String getSubject2() {
		return subject2;
	}

	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}
	public String getSubject3() {
		return subject3;
	}

	public void setSubject3(String subject3) {
		this.subject3 = subject3;
	}
	public String getSubject4() {
		return subject4;
	}

	public void setSubject4(String subject4) {
		this.subject4 = subject4;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getLevel() {
		return level;
	}
	public void setStartingDate(String startingDate) {
		this.startingDate = startingDate;
	}
	public String getStartingDate() {
		return startingDate;
	}
	public void setEndingDate(String endingDate) {
		this.endingDate = endingDate;
	}
	public String getEndingDate() {
		return endingDate;
	}

	public String getSelection() {
		return selection;
	}
	public void setSelection(String selection) {
		this.selection = selection;
	}
	public void setcourseNum(String courseNum){
		this.courseNum=courseNum;
	}
	public String getcourseNum(){
		return courseNum;
	}
	public void setsection(String section){
		this.section=section;
	}
	public String getsection(){
		return section;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setTimeItems(SelectItem[] timeItems) {
		this.timeItems = timeItems;
	}

	public SelectItem[] getTimeItems() {
		return timeItems;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEndTime() {
		return endTime;
	}
	
}