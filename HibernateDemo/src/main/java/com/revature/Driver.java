package com.revature;

import com.revature.beans.Flashcard;
import com.revature.dao.FlashcardDAO;
import com.revature.dao.FlashcardDAOImpl;

public class Driver {
	public static void main(String[] args) {
		// System.out.println(ConnectionUtil.getSessionFactory());
		// SessionFactory sf = ConnectionUtil.getSessionFactory();
		// Session s = sf.openSession();
		// System.out.println(s.getStatistics());
		// s.close();
		FlashcardDAO fd = new FlashcardDAOImpl();
		//fd.addFlashcard(new Flashcard("what is the answer to life, the universe, and everything","42"));
		for(Flashcard f : fd.getAll()) {
			System.out.println(f);
		}
		// fd.addFlashcard(new Flashcard("what is your name","Arthur King of the
		// Britons"));
		// for (Flashcard f : fd.getAll()) {
		//	System.out.println(f);
		// }
		System.out.println(fd.getById(22));
		// all of these Flashcards are now detached - they are no longe associated with
		// an open session
	}

}