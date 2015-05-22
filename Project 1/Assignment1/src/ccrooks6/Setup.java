package ccrooks6;

import java.io.IOException;
import java.util.TreeMap;

import ravensproject.RavensFigure;
import ravensproject.RavensProblem;


public class Setup {

	RavensProblem problem; 
	Figure figure;
	
	
	
	public Setup(RavensProblem problem)
	{
		this.problem = problem;
		
	}


	// this method is going to be used to get
	// all the figures from the hashmap from the problem. 
	// figures are labeled A,B,C,D,1,2,3,4,5,6
	public void setFigures() throws IOException
	{
		// lets just print to being with. 
		
		/*
		for(Entry<String, RavensFigure> entry : problem.getFigures().entrySet())
		{
			// we know that there are 9 figures. 
			figure = new Figure(); // this will create 9 figures. 
			figure.setFigureName(entry.getValue().getName());
            figure.setObjects();
		}*/ 
		
		TreeMap<String, RavensFigure> sortedFigures = new TreeMap<String,RavensFigure>();
		sortedFigures.putAll(problem.getFigures());
		for(RavensFigure rf : sortedFigures.values())
		{
			 figure = new Figure();
			 figure.setProblem(problem.getName()); 
			 
			 figure.setFigureName(rf.getName());
			 figure.setFigureList(problem.getFigures()); // just passing to the figure tree
			 figure.setObjects(rf.getObjects()); // this is going to handle the deep work
			 figure.setAttributes(problem); 
			 
			 
			 
			 
			 FileAnalyzer f = new FileAnalyzer(); 
			 f.open(); 
			 // f.getTotalObjects() Not implemented. 
			 // f.getAttributes etc....
			 
			
		}
		
		
		
	}


}
