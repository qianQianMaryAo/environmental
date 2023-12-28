package www.test.service.chemicalRecord.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.test.dao.ChemicalRecordDao;
import www.test.pojo.ChemicalsRecord;
import www.test.service.chemicalRecord.ChemicalRecordService;
@Service
public class ChemicalRecordImpl implements ChemicalRecordService {
    @Autowired
    private ChemicalRecordDao chemicalRecordDao;
    @Override
    public Integer addChemicalRecordService(ChemicalsRecord chemicalRecord) {
        return chemicalRecordDao.addChemicalRecordDao(chemicalRecord);
    }
}
