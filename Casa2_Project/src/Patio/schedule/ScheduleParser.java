package schedule;

import java.io.FileReader;
import java.util.ArrayList;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

//https://mvnrepository.com/artifact/javax.json/javax.json-api/1.1.4

public class ScheduleParser {
	private JsonArray jsontasks;
	
	public ScheduleParser() {
		loadJson();
	}

	public ArrayList<Task> getTasks() {
		ArrayList<Task> result = new ArrayList<Task>();
		
        for (JsonValue taskjson : jsontasks) {
            JsonObject taskobject = (JsonObject) taskjson;
            
            System.out.println(taskobject.getString("time"));
            System.out.println(taskobject.getString("task"));
            System.out.println("\n");
            
            Task task = new Task(taskobject.getString("time"), taskobject.getString("task"));
            result.add(task);
        }
        
        return result;
	}	
	
	private void loadJson() {
		String pathtofile = "C:\\Users\\23jic\\eclipse-workspace\\POOCaso1\\src\\schedule\\schedule.json";
        
		try ( JsonReader reader = Json.createReader(new FileReader(pathtofile))) {
            JsonObject jsonparser = reader.readObject();
            
            jsontasks = jsonparser.getJsonArray("tareas");
                      
        } catch (Exception e) {
            e.printStackTrace();
        }		
	}
}
