package Services;

import DAO.AnomalyDAO;
import Model.Anomaly;

import java.util.List;

public class AnomalyService {
    //TODO generic service
    private AnomalyDAO anomalyDAO = new AnomalyDAO();

    public AnomalyService() {
    }

    public Anomaly findAnomaly(int id) {
        return anomalyDAO.findById(id);
    }

    public void saveAnomaly(Anomaly anomaly) {
        anomalyDAO.save(anomaly);
    }

    public void deleteAnomaly(Anomaly anomaly) {
        anomalyDAO.delete(anomaly);
    }

    public void updateAnomaly(Anomaly anomaly) {
        anomalyDAO.update(anomaly);
    }

    public List<Anomaly> findAllAnomaly() {
        return anomalyDAO.findAll();
    }

}
