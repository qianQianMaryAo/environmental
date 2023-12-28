package www.test.dao;

import org.springframework.stereotype.Repository;
import www.test.pojo.ChemicalsRecord;

@Repository
public interface TroubleDao {
    /**
     * 插入水质数据
     * @param chemicalRecord
     * @return
     */
    Integer addTroubleDao(ChemicalsRecord chemicalRecord);
    /**
     * 修改数据
     * @param chemicalsRecord
     * @return
     */
    Integer modifTroubleDao(ChemicalsRecord chemicalsRecord);

}
