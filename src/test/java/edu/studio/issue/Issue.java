package edu.studio.issue;

import java.util.Date;

import java.util.Objects;

public class Issue implements Comparable<Issue> {

    private long number;
    
    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    private long id;
    
    private Date createdAt;
    
    private Date closedAt;
    
    private User user;
    
    private User assignee;
    
    @Override
    public String toString() {
        return "Issue [number=" + number + ", id=" + id + ", createdAt=" + createdAt + ", closedAt=" + closedAt
                + ", user=" + user + ", assignee=" + assignee + ", state=" + state + ", title=" + title + ", body="
                + body + ", toString()=" + super.toString() + "]";
    }

    private String state;
    
    private String title;
    
    private String body;
    
    public Issue() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Issue other = (Issue) obj;
        return id == other.id;
    }

    @Override
    public int compareTo(Issue other) {
        // based on Id
        //comparing this and other by id
        return 0;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    public Date getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Date closedAt) {
        this.closedAt = closedAt;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    
}
