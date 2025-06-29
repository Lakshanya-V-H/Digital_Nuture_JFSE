package org.apache.maven.archetypes.JUnitDemo;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Arrange (mock and stub)
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        // Act
        MyService service = new MyService(mockApi);
//        String result = service.fetchData();
//
//        // Assert
//        assertEquals("Mock Data", result);
        service.fetchData();

        // Assert: verify interaction happened
        verify(mockApi).getData();
        
        
    }
}
