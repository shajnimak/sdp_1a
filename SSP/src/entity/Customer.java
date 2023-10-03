package entity;

public class Customer {
    private Long id;
    private String username;
    private String problem;

    public Customer(Long id, String username, String problem) {
        this.id = id;
        this.username = username;
        this.problem = problem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }
}
