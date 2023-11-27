package com.fdmgroup.tdd.groupcontroller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;



public class GroupControllerServiceTest {
	
	// Create mock object of groupControllerService interface
	
	DatabaseReader databaseReader = new DatabaseReader();
	DatabaseWriter databaseWriter = new DatabaseWriter();
	GroupControllerService groupControllerService = Mockito.mock(GroupControllerService.class);
	
	// Create new groupController with the mocked groupControllerService. databaseReader and databaseWriter
	
	GroupController groupController = new GroupController(databaseReader, databaseWriter, groupControllerService);
	
	// Test to check if groupControllerService.getAllTrainees() works 
	
	@Test
	public void testGetAllTrainees() {
		
		Map<String, Trainee> traineesDB = new HashMap<>();
		
		traineesDB.put("1", new Trainee());
		traineesDB.put("2", new Trainee());
		
		// When groupControllerService.getAllTrainees() is invoked, return traineesDB hashmap
		
		when(groupControllerService.getAllTrainees()).thenReturn(traineesDB);
		
		// groupControllerService.getAllTrainees() invoked to return all trainees
		
		Map<String, Trainee> result = groupControllerService.getAllTrainees();
		
		// Verify groupControllerService.getAllTrainees() method is called once
		
		verify(groupControllerService, times(1)).getAllTrainees();
		
		// Compare to see if they return the same results
		
		assertEquals(traineesDB, result);
	}
	
	// Test to check if groupControllerService.addTrainee() method works
	
	@Test
	public void testAddTrainee() {
		
		// Create 3 trainee objects
		
		Trainee trainee1 = new Trainee();
		Trainee trainee2 = new Trainee();
		Trainee trainee3 = new Trainee();
		
		// Use groupControllerService.addTrainee() method to add trainees
		
		groupControllerService.addTrainee(trainee1);
		groupControllerService.addTrainee(trainee2);
		groupControllerService.addTrainee(trainee3);
		
		// Check if groupControllerService.addTrainee() method was invoked correctly
		
		assertNotNull(groupControllerService);
		
		verify(groupControllerService, times(1)).addTrainee(eq(trainee1));
		verify(groupControllerService, times(1)).addTrainee(eq(trainee2));
		verify(groupControllerService, times(1)).addTrainee(eq(trainee3));
		
		
	}
	
	// Test if groupControllerService.removeTraineeByUsername() works
	
	@Test
	public void testRemoveTraineeByUsername() {
		
		// Pass in a random trainee username to removeTraineeByUsername()
		
		groupControllerService.removeTraineeByUsername("johnny");
		
		// Verify that groupControllerService.removeTraineeByUsername() is invoked
		
		verify(groupControllerService, times(1)).removeTraineeByUsername(eq("johnny"));
		
	}
	
}
