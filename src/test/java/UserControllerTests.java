import org.junit.Test;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class UserControllerTests {
    @Test
    public void shouldCallUserServiceWithAnyInt() {
        IUserService userServiceMock = mock(IUserService.class); // vad ska vi göra med den här?
        UserController instanceToTest = new UserController();

        // Act
        instanceToTest.getMe(15); // den röda lampan i IntelliJ borde kunna fixa det här

        // Assert
        verify(userServiceMock, times(1)).getById(anyInt());
    }
}
