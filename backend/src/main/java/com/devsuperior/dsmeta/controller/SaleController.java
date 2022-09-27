package com.devsuperior.dsmeta.controller;

import com.devsuperior.dsmeta.entity.Sale;
import com.devsuperior.dsmeta.service.SaleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    private SaleService saleService;

    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    @GetMapping
    public List<Sale> findAllSales(){
        return saleService.findAllSales();
    }

}
