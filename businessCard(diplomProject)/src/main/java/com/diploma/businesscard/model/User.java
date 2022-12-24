package com.diploma.businesscard.model;

public class User {
    private String name;
    private  Integer age;
    private  String city;
    private  String phoneNumber;
    private String jobName;
    private String jobInfo;
    private String jobPosition;
    private String jobProject;
    private String jobResponsibilities;
    private String socSeti;
    private String email;
    private String gitHub;
    private String login;
    private String password;
    private String pic;


    public User(String pName, Integer pAge, String pCity, String pPhoneNumber,
                String pJobName, String pJobInfo, String pJobPosition, String pJobProject,
                String pJobResponsibilities, String pEmail, String pSocSeti, String pGitHub, String path) {
        this.name = pName;
        this.age = pAge;
        this.city = pCity;
        this.phoneNumber = pPhoneNumber;
        this.jobName = pJobName;
        this.jobInfo = pJobInfo;
        this.jobPosition = pJobPosition;
        this.jobProject = pJobProject;
        this.jobResponsibilities = pJobResponsibilities;
        this.email = pEmail;
        this.socSeti = pSocSeti;
        this.gitHub = pGitHub;
        this.pic = path;
    }
    public String getPic() {
        return pic;
    }
    public void setPic(String pic) {
        this.pic = pic;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public String getName() {
        return name;
    }
    public void setName(String pName) {
        this.name = pName;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer pAge) {
        this.age = pAge;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String pCity) {
        this.city = pCity;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String pPhoneNumber) {
        this.phoneNumber = pPhoneNumber;
    }
    public String getJobName() {
        return jobName;
    }
    public void setJobName(String pJobName) {
        this.jobName = pJobName;
    }
    public String getJobInfo() {
        return jobInfo;
    }
    public void setJobInfo(String pJobInfo) {
        this.jobInfo = pJobInfo;
    }
    public String getJobPosition() {
        return jobPosition;
    }
    public void setJobPosition(String pJobPosition) {
        this.jobPosition = pJobPosition;
    }
    public String getJobProject() {
        return jobProject;
    }
    public void setJobProject(String pJobProject) {
        this.jobProject = pJobProject;
    }
    public String getJobResponsibilities() {
        return jobResponsibilities;
    }
    public void setJobResponsibilities(String pJobResponsibilities) {
        this.jobResponsibilities = pJobResponsibilities;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSocSeti() {
        return socSeti;
    }
    public void setSocSeti(String pSocSeti) {
        this.socSeti = pSocSeti;
    }
    public String getGitHub() {
        return gitHub;
    }
    public void setGitHub(String pGitHub) {
        this.gitHub = pGitHub;
    }
    @Override
    public String toString() {
        String usr = name + "' " + age + "' " + city + "' " + phoneNumber
                + "' " + jobName + "' " + jobInfo + "' " + jobPosition
                + "' " + jobProject + "' " + jobResponsibilities + "' "
                + email + "' " + socSeti + "' " + gitHub + "' " + pic;
        return usr;
    }
}
