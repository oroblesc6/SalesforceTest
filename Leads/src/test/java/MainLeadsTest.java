import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MainLeadsTest {

    @Test
    public void applicationHasStandardMainMethod() throws NoSuchMethodException {
        Method mainMethod = Main_Leads.class.getDeclaredMethod("main", String[].class);

        Assert.assertTrue(Modifier.isPublic(mainMethod.getModifiers()));
        Assert.assertTrue(Modifier.isStatic(mainMethod.getModifiers()));
        Assert.assertEquals(mainMethod.getReturnType(), void.class);
    }
}
