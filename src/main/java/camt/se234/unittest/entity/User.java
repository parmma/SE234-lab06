package camt.se234.unittest.entity;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Date;

@Builder
public class User {
    String username;
    String password;
    String name;
    LocalDate dateOfBirth;
    String telephoneNo;

    public User(String username, String password, String name, LocalDate dateOfBirth, String telephoneNo) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.telephoneNo = telephoneNo;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!getUsername().equals(user.getUsername())) return false;
        if (!getPassword().equals(user.getPassword())) return false;
        if (!name.equals(user.name)) return false;
        if (!getDateOfBirth().equals(user.getDateOfBirth())) return false;
        return telephoneNo.equals(user.telephoneNo);
    }

    @Override
    public int hashCode() {
        int result = getUsername().hashCode();
        result = 31 * result + getPassword().hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + getDateOfBirth().hashCode();
        result = 31 * result + telephoneNo.hashCode();
        return result;
    }
}
