import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import web.com.Application;

/**
 * @version V1.0.1
 * @classname myTest
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-11-27  13:20
 **/
/*@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)*/

public class myTest {

    @Test
    public void insert(){
        int i = 5;

        puserdAdd(i);
        System.out.println(i);
    }

    private int puserdAdd(int i) {
        i = i+2;
        System.out.println(i);
       return i = i+2;
    }


}
