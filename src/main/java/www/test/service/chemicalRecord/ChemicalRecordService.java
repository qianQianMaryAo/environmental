package www.test.service.chemicalRecord;

import www.test.dao.ChemicalRecordDao;
import www.test.pojo.ChemicalsRecord;

import java.util.List;

public interface ChemicalRecordService {
    /**
     * 插入水质数据
     * @param chemicalRecord
     * @return
     */
    Integer addChemicalRecordService(ChemicalsRecord chemicalRecord);
    /**
     * 药剂量列表，及条件查询
     * @param createBy
     * @return
     */
    List<ChemicalsRecord> selectChemicalListService(String createBy);

    /**
     * 修改数据
     * @param chemicalsRecord
     * @return
     */
    Integer modifyChemicalService(ChemicalsRecord chemicalsRecord);

    /**
     * 删除数据
     * @param id
     * @return
     */
    Integer deleteById(Integer id);
}
