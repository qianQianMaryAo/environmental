package www.test.service.chemicalRecord.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.test.dao.ChemicalRecordDao;
import www.test.pojo.ChemicalsRecord;
import www.test.service.chemicalRecord.ChemicalRecordService;

import java.util.List;

@Service
public class ChemicalRecordImpl implements ChemicalRecordService {
    @Autowired
    private ChemicalRecordDao chemicalRecordDao;
    @Override
    public Integer addChemicalRecordService(ChemicalsRecord chemicalRecord) {
        return chemicalRecordDao.addChemicalRecordDao(chemicalRecord);
    }

    @Override
    public List<ChemicalsRecord> selectChemicalListService(String createBy) {
        return chemicalRecordDao.selectChemicalList(createBy);
    }

    @Override
    public Integer modifyChemicalService(ChemicalsRecord chemicalsRecord) {
        return chemicalRecordDao.modifyChemicalDao(chemicalsRecord);
    }

    @Override
    public Integer deleteById(Integer id) {
        return chemicalRecordDao.deleteById(id);
    }
}
