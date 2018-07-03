package me.chenjr.teatracing.service;

import me.chenjr.teatracing.domain.TeaPkg;
import me.chenjr.teatracing.repositories.TeaPkgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeaPkgServiceImpl implements TeaPkgService {

    @Autowired
    private TeaPkgRepository teaPkgRepository ;
    @Override
    public List<TeaPkg> loadAll() {
        return teaPkgRepository.findAll();
    }
}
