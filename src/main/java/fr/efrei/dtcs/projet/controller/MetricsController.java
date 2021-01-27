package fr.efrei.dtcs.projet.controller;

import fr.efrei.dtcs.projet.model.Metric;
import fr.efrei.dtcs.projet.service.MetricSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricsController {

    @Autowired
    MetricSenderService metricService;

    @PostMapping(path = "/metric")
    void metric(@RequestBody Metric metric) {
        metricService.send(metric);
    }
}
