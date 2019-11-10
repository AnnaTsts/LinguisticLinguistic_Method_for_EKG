package Services;

import Model.Anomaly;

import java.util.List;

public class AnomalySearcher {
    AnomalyService anomalyService = new AnomalyService();
    ResultService resultService = new ResultService();

    public void getAnomalyInResult(int idOfResult){
        List<Anomaly> anomalies =anomalyService.findAllAnomaly();
        String currResultString = resultService.findResult(idOfResult).getResultString();

    }
    
}


