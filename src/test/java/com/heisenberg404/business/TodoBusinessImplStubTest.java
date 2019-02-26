package com.heisenberg404.business;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.heisenber404.business.TodoBusinessImpl;
import com.heisenberg404.data.api.TodoService;
import com.heisenberg404.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void usingAStub() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("XX");
		assertEquals(2, todos.size());
	}

}
