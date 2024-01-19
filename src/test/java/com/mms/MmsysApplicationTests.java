package com.mms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mms.bean.Movie;
import com.mms.controller.MMSController;

@SpringBootTest
class MmsysApplicationTests {
	@Autowired
	public MMSController controller;

	String resone;
	String restwo;
	static int id;
	static String name, genres, language, duration;
	String insert;
	String update;
	String delete;

	List<Movie> list = new ArrayList<Movie>();
	List<Movie> list1 = new ArrayList<Movie>();

	Movie mov = new Movie(15, "GOAT", "Sci-fi", "Tamil", "2");
	Movie mov1 = new Movie(20, "GOAT2", "Sci-fi", "Tamil", "2");

	@Test
	@Order(1)
	void testPerformInsert() {
		insert = "Inserted";
		resone = controller.performInsert(mov);
		assertEquals(insert, resone);
	}

	@Test
	@Order(2)
	void testPerformUpdate() {

		update = "Updated";
		resone = controller.performUpdate(mov1);
		assertEquals(update, resone);
	}

	@Test
	@Order(4)
	void testPerformDelete() {
		delete = "Deleted";
		resone = controller.performDelete(15);
		restwo = controller.performDelete(20);
		assertEquals(delete, resone);
		assertEquals(delete, restwo);

	}

	@Test
	void testViewAllEmployee() {
		list = controller.viewAllEmployee();
		Movie mov2 = new Movie(16, "Mersal", "Action", "Tamil", "3");
		Movie mov3 = new Movie(17, "Katthi", "Action", "Tamil", "2");
		list1.add(mov2);
		list1.add(mov3);
		list.equals(list1);
	}

}
