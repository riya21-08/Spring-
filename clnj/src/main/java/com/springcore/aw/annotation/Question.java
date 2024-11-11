package com.springcore.aw.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Question {
	
	private String Que1;
	@Autowired 
	@Qualifier("a2")
	private Answer answer;
	/**
	 * @return the que1
	 */
	public String getQue1() {
		return Que1;
	}
	/**
	 * @param que1 the que1 to set
	 */
	public void setQue1(String que1) {
		Que1 = que1;
	}
	/**
	 * @return the answer
	 */
	public Answer getAnswer() {
		return answer;
	}
	/**
	 * @param answer the answer to set
	 */
	
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(String que1, Answer answer) {
		super();
		Que1 = que1;
		this.answer = answer;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Question is= \n Que1=" + Que1 + ", \n answer is=\n" + answer + "]";
	}
	
	

}
