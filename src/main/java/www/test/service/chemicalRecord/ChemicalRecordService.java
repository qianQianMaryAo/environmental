package www.test.service.chemicalRecord;

import www.test.dao.ChemicalRecordDao;
import www.test.pojo.ChemicalsRecord;

public interface ChemicalRecordService {
    /**
     * 插入水质数据
     * @param chemicalRecord
     * @return
     */
    Integer addChemicalRecordService(ChemicalsRecord chemicalRecord);
}
