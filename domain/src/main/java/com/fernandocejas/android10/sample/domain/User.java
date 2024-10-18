public class User {

    private final int userId;      // Final to ensure immutability
    private String coverUrl;
    private String fullName;
    private String email;
    private String description;
    private int followers;

    // Constructor initializing userId only
    public User(int userId) {
        this.userId = userId;
    }

    // Overloaded constructor to initialize all fields
    public User(int userId, String coverUrl, String fullName, String email, String description, int followers) {
        this.userId = userId;
        this.coverUrl = coverUrl;
        this.fullName = fullName;
        this.email = email;
        this.description = description;
        this.followers = followers;
    }

    // Getters and Setters for all fields
    public int getUserId() {
        return userId;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }
}
