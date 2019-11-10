package Services;

import Model.Anomaly;

import java.util.List;

public class AnomalySearcher {
    private AnomalyService anomalyService = new AnomalyService();
    private ResultService resultService = new ResultService();

    public void getAnomalyInResult(int idOfResult){
        List<Anomaly> anomalies =anomalyService.findAllAnomaly();
        String currResultString = resultService.findResult(idOfResult).getResultString();

    }
}


