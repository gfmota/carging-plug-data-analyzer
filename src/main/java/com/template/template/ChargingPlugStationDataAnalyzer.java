package com.template.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ChargingPlugStationDataAnalyzer implements ApplicationRunner {
    @Autowired
    private ChargingPlugStationGatewayClient chargingPlugStationGatewayClient;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        analyzeDailyReport();
        analyzeCurrentStatus();
    }

    private void analyzeDailyReport() {
        log.info("Analyzing daily report");
        try {
            Object dailyReport = chargingPlugStationGatewayClient.getChargingPlugStationDailyReport();
            log.info("Daily report: {}", dailyReport);
        } catch (Exception e) {
            log.error("Error while requesting daily report", e);
        }
    }

    private void analyzeCurrentStatus() {
        log.info("Analyzing current status");
        try {
            Object currentStatus = chargingPlugStationGatewayClient.getChargingPlugStationCurrentStatus();
            log.info("Current status: {}", currentStatus);
        } catch (Exception e) {
            log.error("Error while requesting current status", e);
        }
    }
}
