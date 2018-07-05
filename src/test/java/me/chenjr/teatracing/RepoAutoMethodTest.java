package me.chenjr.teatracing;



import me.chenjr.teatracing.domain.Factory;
import me.chenjr.teatracing.domain.TeaPkg;
import me.chenjr.teatracing.repositories.FactoryRepository;
import me.chenjr.teatracing.service.TeaPkgService;
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
    @Autowired
    TeaPkgService teaPkgService;

    @Test
    public void  testCURD(){
        String name = "fff";

        Factory factory ;

        factoryRepository.saveAndFlush(new Factory(name));

        factory =factoryRepository.findByName(name);
        Assert.assertNotNull( factory);

        factoryRepository.deleteById(factory.getId());

        Factory ggg = factoryRepository.findByName(factory.getName());
        System.out.println(ggg);
        Assert.assertNull(ggg);

    }
//    @Test
    public void testFindById(){
        long id = 1;

        TeaPkg teaPkg = teaPkgService.findById(id);
        Assert.assertNotNull(teaPkg);
    }

}
