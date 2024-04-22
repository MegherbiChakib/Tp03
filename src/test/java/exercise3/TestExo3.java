package exercise3;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

public class TestExo3 {
    private ProductService productService;
    private ProductApiClient mockApiClient;

    @Before
    public void setUp() {
        mockApiClient = mock(ProductApiClient.class);
        productService = new ProductService(mockApiClient);
    }

    @Test
    public void testGetProduct_Success() {
        // Given
        String productId = "123";
        Product expectedProduct = new Product(productId, "Product Name", 10.0);

        // When
        when(mockApiClient.getProduct(productId)).thenReturn(expectedProduct);
        Product actualProduct = productService.getProduct(productId);

        // Then
        assertEquals(expectedProduct, actualProduct);
        verify(mockApiClient).getProduct(productId);
    }
}