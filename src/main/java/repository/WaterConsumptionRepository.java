package repository;

import model.WaterConsumption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface WaterConsumptionRepository extends JpaRepository<WaterConsumption, Integer> {
    @Query(value = "select * from waterconsumpt  ion "
        + " order by avgMonthlyKL desc "
            + " limit 10 "
            , nativeQuery = true)
    List<WaterConsumption> findTopTenConsumer();


}
