package edu.studio.issue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class IssueParserTest {
    
    @Test
    void testIssueParser() throws IOException {
        IssueParser parser = new IssueParser();
        
        String testOutput = Files.readString(Paths.get("src/resources/sample-output.txt"), StandardCharsets.US_ASCII);
        List<Issue> issue = parser.returnList(testOutput);
        
        assertNotNull(issue); 
        assertEquals(2, issue.size());
        Issue issue0 = issue.get(0);
        assertEquals(1, issue0.getNumber());
        
    }
}
