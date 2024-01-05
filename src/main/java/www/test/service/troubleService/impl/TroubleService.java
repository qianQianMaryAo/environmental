package www.test.service.troubleService.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.test.dao.TroubleDao;
import www.test.pojo.Trouble;

@Service
public class TroubleService implements www.test.service.troubleService.TroubleService {
    @Autowired
    private TroubleDao troubleDao;
    @Override
    public Integer addTroubleService(Trouble trouble) {
        return troubleDao.addTroubleDao(trouble);
    }

    @Override
    public Integer modifyTroubleService(Trouble trouble) {
        return troubleDao.modifyTroubleDao(trouble);
    }
}
