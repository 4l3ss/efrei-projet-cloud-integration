package fr.efrei.dtcs.projet.service;

import fr.efrei.dtcs.projet.model.Metric;

public interface MetricSenderService {

    void send(Metric metric);

}
