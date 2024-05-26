package com.template.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ChargingPlugStationConsumer {
    private static final String DAILY_REPORT_QUEUE = "charging-plug-station-daily-report-queue-1";
    private static final String CURRENT_STATUS_QUEUE = "charging-plug-station-current-status-queue-1";

    @RabbitListener(queues = DAILY_REPORT_QUEUE)
    private void consumeDailyReport(Message message) {
        log.info("Daily report message received: " + new String(message.getBody()));
    }

    @RabbitListener(queues = CURRENT_STATUS_QUEUE)
    private void consumeCurrentStatus(Message message) {
        log.info("Current status message received: " + new String(message.getBody()));
    }
}
