import com.alj.configure.SpringConfig;
import com.alj.domain.User;
import com.alj.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        User user =new User();
        user.setId(1);
        user.setUsername("anlinjie666");
        user.setName("alj");
        user.setAge(18);
        user.setGender("男");

        //获取核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获取session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获取session会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //删除
        sqlSession.delete("userMapper.delete",1);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
}
