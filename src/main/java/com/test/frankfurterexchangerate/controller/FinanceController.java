package com.test.frankfurterexchangerate.controller;

import com.test.frankfurterexchangerate.service.FinanceDataStore;
import com.test.frankfurterexchangerate.service.FinanceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/finance/data")
public class FinanceController {
//    private final FinanceService financeService;
//
//    public FinanceController(FinanceService financeService) {
//        this.financeService = financeService;
//    }

    //    @GetMapping("/{resourceType}")
//    public ResponseEntity<List<Map<String, Object>>> getData(@PathVariable String resourceType){
//        List<Map<String, Object>> result = financeService.fetchResource(resourceType);
//        return ResponseEntity.ok(result);
//    }

    private final FinanceDataStore store;

    public FinanceController(FinanceDataStore store) {
        this.store = store;
    }

    @GetMapping("/{resourceType}")
    public List<Object> getData(String resourceType){
        return store.get(resourceType);
    }
}
