package com.devsuperior.dsmeta.service;

import com.devsuperior.dsmeta.repository.SaleRepository;
import org.springframework.stereotype.Service;

@Service
public class SaleService {

    private SaleRepository saleRepository;

    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }



}
