package com.chretien.hellovosobjetschretien.service.Impl;

import com.chretien.hellovosobjetschretien.domain.Don;
import com.chretien.hellovosobjetschretien.repositories.DonRpository;
import com.chretien.hellovosobjetschretien.service.DonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonServiceImpl implements DonService {
    @Autowired
    private DonRpository donRpository;
    @Override
    public Don add(Don don) {
        return null;
    }
}
