import org.testng.annotations.Test;

public class MyInitialTest {

    @Test
    public void loginTest() {
        System.out.println("I have logged in");
    }

    @Test
    public void incorrectLoginTest() {
        System.out.println("Login failed");
    }
}
