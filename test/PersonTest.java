import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("John", "Doe", "000001", "Mr.", 1990);
    }

    @Test
    void testFullName() {
        assertEquals("John Doe", person.fullName());
    }

    @Test
    void testFormalName() {
        assertEquals("Mr. John Doe", person.formalName());
    }

    @Test
    void testGetAge() {
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        assertEquals(currentYear - 1990, person.getAge());
    }

    @Test
    void testGetAgeWithSpecificYear() {
        assertEquals(35, person.getAge(2025));
    }

    @Test
    void testToCSV() {
        assertEquals("000001,John,Doe,Mr.,1990", person.toCSV());
    }

    @Test
    void testToJSON() {
        assertEquals("{\"ID\":\"000001\", \"firstName\":\"John\", \"lastName\":\"Doe\", \"title\":\"Mr.\", \"YOB\":1990}", person.toJSON());
    }

    @Test
    void testToXML() {
        assertEquals("<Person><ID>000001</ID><FirstName>John</FirstName><LastName>Doe</LastName><Title>Mr.</Title><YOB>1990</YOB></Person>", person.toXML());
    }
}
