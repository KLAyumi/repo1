import com.ssm.dao.ItemsMapper;
import com.sun.tools.javac.jvm.Items;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsMapperTest {
    @Test
    public void testFindItemsById(){
        //获取初始化spring容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ItemsMapper itemsMapper = applicationContext.getBean(ItemsMapper.class);
        Items items = itemsMapper.findById(1);
        System.out.println(items);
    }
}
