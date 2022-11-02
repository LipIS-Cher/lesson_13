import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return firstName.equals(c2.firstName);
    }

    @Override
    public String toString() {
        return firstName + lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName);
    }
}
