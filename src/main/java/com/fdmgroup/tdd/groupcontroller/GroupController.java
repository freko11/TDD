package com.fdmgroup.tdd.groupcontroller;

import java.util.Map;


public class GroupController implements GroupControllerService {

	// Create both databaseReader and databaseWriter to use their methods 
	
	private DatabaseReader databaseReader;
	private DatabaseWriter databaseWriter;
	private GroupControllerService groupControllerService;
	
	// Constructor with both databaseReader and databaseWriter objects
	
	public GroupController(DatabaseReader databaseReader, DatabaseWriter databaseWriter, GroupControllerService groupControllerService) {
		this.databaseReader = databaseReader;
		this.databaseWriter = databaseWriter;
		this.groupControllerService = groupControllerService;
	}
	
	// Use databaseReader.readGroup() method 
	
	@Override
	public Map<String, Trainee> getAllTrainees() {
	
		return databaseReader.readGroup();
	}

	// Use databaseWriter.addTrainee() method
	
	@Override
	public void addTrainee(Trainee trainee) {
	
		databaseWriter.addTrainee(trainee);
	}

	// Use databaseWriter.deleteTraineeByUsername() method
	
	@Override
	public void removeTraineeByUsername(String traineeUsername) {
		
		databaseWriter.deleteTraineeByUsername(traineeUsername);
	}

}
