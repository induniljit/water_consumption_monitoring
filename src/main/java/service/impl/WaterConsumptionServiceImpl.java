package service.impl;

import model.WaterConsumption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.WaterConsumptionRepository;
import service.WaterConsumptionService;

import java.util.List;

@Service
public class WaterConsumptionServiceImpl implements WaterConsumptionService {
    @Autowired
    private WaterConsumptionRepository waterConsumptionRepository;

    public List<WaterConsumption> findAll(){
        return waterConsumptionRepository.findAll();
    }

    @Override
    public List<WaterConsumption> findTopTenConsumers() {
        return waterConsumptionRepository.findTopTenConsumer();
    }

}
