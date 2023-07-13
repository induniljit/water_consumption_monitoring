package service;

import model.WaterConsumption;

import java.util.List;

public interface WaterConsumptionService {
    List<WaterConsumption> findAll();
    List<WaterConsumption> findTopTenConsumers();
}
