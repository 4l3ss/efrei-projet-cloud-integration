package fr.efrei.dtcs.projet.service;

import fr.efrei.dtcs.projet.model.Metric;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TemperatureMetricReceiverService implements MetricReceiverService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void receive(Metric metric) {
        logger.debug("received a temperature metric");
        if(metric.unit.equals("c")){
            logger.debug(metric.value + "°C => " + this.CtoF(metric.value) + " °F");
        }else if(metric.unit.equals("f")){
            logger.debug(metric.value + "°F => " + this.FtoC(metric.value) + " °C");
        }

    }

    private double CtoF(double c){
        return c*1.8+32;
    }
    private double FtoC(double f){
        return (f-32)/1.8;
    }
}
