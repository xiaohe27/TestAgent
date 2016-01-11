import org.junit.Assert;
import org.junit.Test;

/**
 * Created by xiaohe on 10/3/14.
 */
public class TestHello {

    @Test
    public void testAddFunctionOfHello(){
        Hello h=new Hello();

        Assert.assertEquals("5+0 must be 5", 5, h.add2Num(5,0));

        System.out.println("This test is modified by a remote session");
    }
}
