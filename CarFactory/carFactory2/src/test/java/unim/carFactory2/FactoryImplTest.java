package unim.carFactory2;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class FactoryImplTest {
	
	@Test
    void assembleNotWorking() throws StorageFullException {
        // GIVEN
        Factory factory = mock(Factory.class);
        
        //WHEN
        doThrow(StorageFullException.class).when(factory).assemble("Focus", "gray");

        // THEN
        assertThrows(StorageFullException.class, () -> factory.assemble("Focus", "gray"));
    }

    @Test
    void assembleWorking() throws StorageFullException {
        // GIVEN
        Factory factory = mock(Factory.class);

        // WHEN
        factory.assemble("Focus", "gray");

        // THEN
        verify(factory, times(1)).assemble("Focus", "gray");
    }
	
}
