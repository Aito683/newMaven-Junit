package models;

public class Team {
    private String teamName;
    private String principal;
    private String leadDriver;

    public Team(String teamName, String principal, String leadDriver) {
        this.teamName = teamName;
        this.principal = principal;
        this.leadDriver = leadDriver;
    }

    public String getTeamName() { return teamName; }
    public String getPrincipal() { return principal; }
    public String getLeadDriver() { return leadDriver; }
}
