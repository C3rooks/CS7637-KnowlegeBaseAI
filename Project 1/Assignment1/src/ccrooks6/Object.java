package ccrooks6;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import ravensproject.RavensObject;

public class Object extends Figure {

	public int count; 
	public String figureBackup; 
	HashMap<String, String> list;

	HashMap<String, RavensObject> objects;

	public Object()
	{
	
		count = 0; 
		list = new HashMap<String, String>(); 
	}
	
	public Object(HashMap<String, RavensObject> objects) {
		this.objects = objects; 
	}

	public void setNumObjects(int count)
	{
		this.count = count;
	}
	
	
	public void printObjectValues(String figureName) throws IOException
	{
		int globalcount = 0; 
		
		
		FileOutputStream outputStream;
		  OutputStreamWriter outputStreamWriter;
		  BufferedWriter bufferedWriter = null;
		  outputStream = new FileOutputStream("MyFile.txt");
		  outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");
          bufferedWriter = new BufferedWriter(outputStreamWriter);

  		for (RavensObject ro : objects.values()) {
  			
  			System.out.println("Printing Objects for figure " + figureName); 
  			System.out.println(ro.getName());
  		
		
	      //  System.out.println(figureName + " " + pair.getKey());
	     
	        
	        try {
	             
	           
	             
	           bufferedWriter.write(figureName + " " + ro.getName());
	            bufferedWriter.newLine();
	         
	             
	           
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	       
		}
		 bufferedWriter.close();
	}
	
	
	// will need altered 
	// pass in the figure you want to know how many objects 
	public void printFigureObjects(String figure)
	{
		
		int count = 0; 
		for(int i = 0; i < list.values().size(); i++)
		{
			if(list.containsValue(figure))
			{
				count++;
			}
		}
		
		System.out.println("Figure " + figure + " Contains " + count + "Objects");

		
	}
	
	
	
	
}
