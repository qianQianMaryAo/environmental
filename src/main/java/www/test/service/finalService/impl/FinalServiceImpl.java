package www.test.service.finalService.impl;

import org.springframework.stereotype.Service;
import www.test.dao.FinalDao;
import www.test.pojo.ChemicalsRecord;
import www.test.pojo.Final;
import www.test.service.finalService.FinalService;

import java.util.List;


@Service
public class FinalServiceImpl implements FinalService {
    private FinalDao finalDao;

    @Override
    public Integer addFinalService(Final finalE) {
        return finalDao.addFinalDao(finalE);
    }

    @Override
    public List<ChemicalsRecord> selectFinalListService(String technologyName) {
        return finalDao.selectFinalList(technologyName);
    }

    @Override
    public Integer modifyFinalService(Final finalE) {
        return finalDao.modifyFinalDao(finalE);
    }

    @Override
    public Integer deleteById(Integer id) {
        return finalDao.deleteById(id);
    }
}
