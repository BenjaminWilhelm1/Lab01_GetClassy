import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product("P001", "Laptop", "High-performance laptop", 999.99);
    }

    @Test
    void testToCSV() {
        assertEquals("P001,Laptop,High-performance laptop,999.99", product.toCSV());
    }

    @Test
    void testToJSON() {
        assertEquals("{\"ID\":\"P001\", \"name\":\"Laptop\", \"description\":\"High-performance laptop\", \"cost\":999.99}", product.toJSON());
    }

    @Test
    void testToXML() {
        assertEquals("<Product><ID>P001</ID><Name>Laptop</Name><Description>High-performance laptop</Description><Cost>999.99</Cost></Product>", product.toXML());
    }
}
