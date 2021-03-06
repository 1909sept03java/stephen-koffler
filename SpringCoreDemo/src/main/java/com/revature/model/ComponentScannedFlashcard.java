package com.revature.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // stereotype which marks class as a Spring bean, default name will be
			// componentScannedFlashcard
public class ComponentScannedFlashcard {
	public ComponentScannedFlashcard() {
		super();
	}

	public ComponentScannedFlashcard(String question, String answer, Topic topic) {
		super();
		this.question = question;
		this.answer = answer;
		this.topic = topic;
	}

	public ComponentScannedFlashcard(int id, String question, String answer, Topic topic) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
		this.topic = topic;
	}

	private int id;
	private String question;
	private String answer;
	
	// this flashcard needs a Topic
	// field injection - can place annotation on a setter or constructor as well
	@Autowired
	private Topic topic;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		result = prime * result + id;
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		result = prime * result + ((topic == null) ? 0 : topic.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComponentScannedFlashcard other = (ComponentScannedFlashcard) obj;
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
		if (id != other.id)
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		if (topic == null) {
			if (other.topic != null)
				return false;
		} else if (!topic.equals(other.topic))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Flashcard [id=" + id + ", question=" + question + ", answer=" + answer + ", topic=" + topic + "]";
	}
}