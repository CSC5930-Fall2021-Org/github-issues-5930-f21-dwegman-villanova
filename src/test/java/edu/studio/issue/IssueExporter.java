package edu.studio.issue;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Collections;
import java.util.List;
//import java.io.BufferedWriter;

public class IssueExporter {
    
   //protected static final String OUTPUT_FILENAME = "actual-issues.txt";
   
    public static void main(String[] args) throws IOException {
        //IssueExporter exporter = new IssueExporter();
        GitHubRestClient client = new GitHubRestClient();
        IssueParser parser = new IssueParser();
        
        
        if(args.length==0 || args.equals(null) || args[0].equals("")) {
            System.out.println("Invalid PAT. Rerun program with valid PAT token.");
        }
        else {
            String issues = client.getIssues(args[0]);
            List<Issue> jsonIssues = parser.returnList(issues);
            
            File collectionFile = new File("src/test/resources/actual-issues.txt");
            FileWriter writer = new FileWriter(collectionFile);
            
            for(Issue comparedIssue : jsonIssues) {
                writer.write(comparedIssue.toString());
            }
            
            writer.close();
            
        }
    }
   

}