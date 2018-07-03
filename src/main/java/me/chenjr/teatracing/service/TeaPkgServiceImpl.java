package me.chenjr.teatracing.service;

import me.chenjr.teatracing.domain.Factory;
import me.chenjr.teatracing.domain.Master;
import me.chenjr.teatracing.domain.Seller;
import me.chenjr.teatracing.domain.TeaPkg;
import org.slf4j.Logger;
import me.chenjr.teatracing.repositories.FactoryRepository;
import me.chenjr.teatracing.repositories.MasterRepository;
import me.chenjr.teatracing.repositories.SellerRepository;
import me.chenjr.teatracing.repositories.TeaPkgRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeaPkgServiceImpl implements TeaPkgService {
    protected static final Logger logger = LoggerFactory.getLogger(TeaPkgServiceImpl.class);

    @Autowired
    private TeaPkgRepository teaPkgRepository ;

    @Autowired
    private FactoryRepository factoryRepository;

    @Autowired
    private MasterRepository masterRepository;
    @Autowired
    private SellerRepository sellerRepository;

    @Override
    public TeaPkg add(TeaPkg teaPkg) {
        String factoryName = teaPkg.getFactory();
        String masterName = teaPkg.getMaster();
        String sellerName = teaPkg.getSeller();
        Factory factory = factoryRepository.findByName(factoryName);

        if ( factory == null){
//            logger.debug(factory.toString());
//            logger.debug(factory.getName());
             factory= new Factory(factoryName);
            factoryRepository.save(factory);
            factoryRepository.flush();
        }

        Master master = masterRepository.findByName(masterName);
        if ( master == null){
            master= new Master(masterName);
            masterRepository.save(master);
            masterRepository.flush();
        }

        Seller seller = sellerRepository.findByName(sellerName);
        if ( seller == null){
            seller= new Seller(sellerName);
            sellerRepository.save(seller);
            sellerRepository.flush();
        }

        teaPkg.setFactoryid(factory.getId());
        teaPkg.setMasterid(master.getId());
        teaPkg.setSellerid(seller.getId());
        master.setMade(master.getMade()+1);
        teaPkg.setTeacode(Long.valueOf(
                String.format("8%03d%04d%04d%05d0",
                        factory.getId(),
                        master.getId(),
                        seller.getId(),
                        master.getMade())
        ));


        masterRepository.save(master);
        teaPkgRepository.save(teaPkg);
        masterRepository.flush();
        teaPkgRepository.flush();

        return teaPkg;
    }

    @Override
    public List<TeaPkg> loadAll() {
        return teaPkgRepository.findAll();
    }
}
