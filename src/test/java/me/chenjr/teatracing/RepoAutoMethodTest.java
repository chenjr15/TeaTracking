package me.chenjr.teatracing;



import me.chenjr.teatracing.domain.Factory;
import me.chenjr.teatracing.repositories.FactoryRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RepoAutoMethodTest {

    @Autowired
    FactoryRepository factoryRepository;

    @Test
    public void  testCURD(){
        String name = "制茶师阿福";
        factoryRepository.save(new Factory(name));
        Assert.assertNotNull( "name Not Found!",factoryRepository.findByName(name));
        Assert.assertNull(factoryRepository.findByName("制茶师"));

    }

}
