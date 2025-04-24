package com.example.demo11.DAO;

import com.example.demo11.model.WeatherRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface WeatherRecordRepository extends JpaRepository<WeatherRecord, Long> {

    @Query("SELECT wr FROM WeatherRecord wr WHERE wr.city.id = :cityId AND wr.timestamp BETWEEN :startDate AND :endDate")
    List<WeatherRecord> findByCityIdAndDateRange(
            @Param("cityId") Long cityId,
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );
}