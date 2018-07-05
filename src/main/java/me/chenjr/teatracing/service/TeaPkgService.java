package me.chenjr.teatracing.service;

import me.chenjr.teatracing.domain.TeaPkg;

import java.util.List;

public interface TeaPkgService {
    TeaPkg add(TeaPkg teaPkg);
    void remove(TeaPkg teaPkg);
    List<TeaPkg> loadAll();
    TeaPkg findById(long id);
    boolean deleteById(long id);
    void sellById(long id);
}
