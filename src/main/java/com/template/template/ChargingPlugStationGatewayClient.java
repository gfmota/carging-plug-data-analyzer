package com.template.template;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "charging-plug-station-gateway", url = "${charging-plug-station-gateway.url}")
public interface ChargingPlugStationGatewayClient {
    @GetMapping("/lastDayReport")
    Object getChargingPlugStationDailyReport();

    @GetMapping("/currentStatus")
    Object getChargingPlugStationCurrentStatus();
}
