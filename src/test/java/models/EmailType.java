package models;

public class EmailType {
    private String emailType;
    private String description;

    public EmailType(String emailType, String description) {
        this.emailType = emailType;
        this.description = description;
    }

    public String getEmailType() {
        return emailType;
    }

    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
