package me.chenjr.teatracing.service;

import me.chenjr.teatracing.domain.TeaPkg;

import java.util.List;

public interface TeaPkgService {
    TeaPkg add(TeaPkg teaPkg);
    List<TeaPkg> loadAll();
}
