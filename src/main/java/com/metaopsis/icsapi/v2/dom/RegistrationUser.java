package com.metaopsis.icsapi.v2.dom;

public class RegistrationUser {
    private String name;
    private String password;
    private String firstName;
    private String lastName;
    private String title;
    private String phone;
    private String email;
    private TimeZone timezone;
    private String securityQuestion;
    private String securityAnswer;
    private boolean forceChangePassword;
    private boolean optOutOfEmails;

    public RegistrationUser() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TimeZone getTimezone() {
        return timezone;
    }

    public void setTimezone(TimeZone timezone) {
        this.timezone = timezone;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(SecurityQuestion securityQuestion) {
        this.securityQuestion = securityQuestion.toString();
    }

    public void setCustomSecurityQuestion(String question)
    {
        this.securityQuestion += question;
    }

    public SecurityQuestion getSecurityAnswer() {
        return SecurityQuestion.valueOf(securityAnswer);
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public boolean isForceChangePassword() {
        return forceChangePassword;
    }

    public void setForceChangePassword(boolean forceChangePassword) {
        this.forceChangePassword = forceChangePassword;
    }

    public boolean isOptOutOfEmails() {
        return optOutOfEmails;
    }

    public void setOptOutOfEmails(boolean optOutOfEmails) {
        this.optOutOfEmails = optOutOfEmails;
    }



    @Override
    public String toString() {
        return "RegistrationUser{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", timezone=" + timezone +
                ", securityQuestion='" + securityQuestion + '\'' +
                ", securityAnswer=" + securityAnswer +
                ", forceChangePassword=" + forceChangePassword +
                ", optOutOfEmails=" + optOutOfEmails +
                '}';
    }
}
