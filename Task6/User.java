package Collections.Task6;

import java.util.Objects;

public class User implements Comparable<User> {
    private Integer personalNumber;
    private String name;
    private String surname;
    private Integer age;

    public User(int personalNumber, String name, String surname, int age) {
        this.personalNumber = personalNumber;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return personalNumber == user.personalNumber && age == user.age && Objects.equals(name, user.name) && Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalNumber, name, surname, age);
    }

    @Override
    public int compareTo(User o) {
        int result = this.personalNumber.compareTo(o.personalNumber);
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        if (result == 0) {
            result = this.surname.compareTo(o.surname);
        }
        return result;
    }

    @Override
    public String toString() {
        return "User: " +
                "personalNumber = " + personalNumber +
                ", name = " + name + '\'' +
                ", surname = " + surname + '\'' +
                ", age = " + age + ".";
    }
}

