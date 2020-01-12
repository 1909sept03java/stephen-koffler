package com.sat.math.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MathProblem")
public class MathProblem {
	@Id
	@Column
	int problemId;
	@Column
	String problemStatment;
	@Column
	String ansChoiceA;
	@Column
	String ansChoiceB;
	@Column
	String ansChoiceC;
	@Column
	String ansChoiceD;
	@Column
	String ansChoiceE;
	@Column
	String corrrectAns;
	
	
	public MathProblem(int problemId, String problemStatment, String ansChoiceA, String ansChoiceB, String ansChoiceC,
			String ansChoiceD, String ansChoiceE, String corrrectAns) {
		super();
		this.problemId = problemId;
		this.problemStatment = problemStatment;
		this.ansChoiceA = ansChoiceA;
		this.ansChoiceB = ansChoiceB;
		this.ansChoiceC = ansChoiceC;
		this.ansChoiceD = ansChoiceD;
		this.ansChoiceE = ansChoiceE;
		this.corrrectAns = corrrectAns;
	}


	public int getProblemId() {
		return problemId;
	}


	public void setProblemId(int problemId) {
		this.problemId = problemId;
	}


	public String getProblemStatment() {
		return problemStatment;
	}


	public void setProblemStatment(String problemStatment) {
		this.problemStatment = problemStatment;
	}


	public String getAnsChoiceA() {
		return ansChoiceA;
	}


	public void setAnsChoiceA(String ansChoiceA) {
		this.ansChoiceA = ansChoiceA;
	}


	public String getAnsChoiceB() {
		return ansChoiceB;
	}


	public void setAnsChoiceB(String ansChoiceB) {
		this.ansChoiceB = ansChoiceB;
	}


	public String getAnsChoiceC() {
		return ansChoiceC;
	}


	public void setAnsChoiceC(String ansChoiceC) {
		this.ansChoiceC = ansChoiceC;
	}


	public String getAnsChoiceD() {
		return ansChoiceD;
	}


	public void setAnsChoiceD(String ansChoiceD) {
		this.ansChoiceD = ansChoiceD;
	}


	public String getAnsChoiceE() {
		return ansChoiceE;
	}


	public void setAnsChoiceE(String ansChoiceE) {
		this.ansChoiceE = ansChoiceE;
	}


	public String getCorrrectAns() {
		return corrrectAns;
	}


	public void setCorrrectAns(String corrrectAns) {
		this.corrrectAns = corrrectAns;
	}
	
	
	

}
