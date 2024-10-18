package com.fernandocejas.android10.sample.domain;

/**
 * Class that represents a User in the domain layer.
 */
public class User {

    private final int userId;
    private String coverUrl;
    private String fullName;
    private String email;
    private String description;
    private int followers;

    private User(Builder builder) {
        this.userId = builder.userId;
        this.coverUrl = builder.coverUrl;
        this.fullName = builder.fullName;
        this.email = builder.email;
        this.description = builder.description;
        this.followers = builder.followers;
    }

    public int getUserId() {
        return userId;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    public int getFollowers() {
        return followers;
    }

    public static class Builder {
        private final int userId;
        private String coverUrl;
        private String fullName;
        private String email;
        private String description;
        private int followers;

        public Builder(int userId) {
            this.userId = userId;
        }

        public Builder coverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }

        public Builder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder followers(int followers) {
            this.followers = followers;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
