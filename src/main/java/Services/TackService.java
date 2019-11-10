package Services;

import DAO.TackDAO;
import Model.Tact;

import java.util.List;

public class TackService {
    private DAO.TackDAO tackDAO = new TackDAO();

    public TackService() {
    }

    public Tact findAnomaly(int id) {
        return tackDAO.findById(id);
    }

    public void saveAnomaly(Tact tact) {
        tackDAO.save(tact);
    }

    public void deleteAnomaly(Tact tact) {
        tackDAO.delete(tact);
    }

    public void updateAnomaly(Tact tact) {
        tackDAO.update(tact);
    }

    public List<Tact> findAllAnomaly() {
        return tackDAO.findAll();
    }
}
