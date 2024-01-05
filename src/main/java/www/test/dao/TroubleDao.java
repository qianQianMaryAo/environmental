package www.test.dao;

import org.springframework.stereotype.Repository;
import www.test.pojo.ChemicalsRecord;
import www.test.pojo.Trouble;

@Repository
public interface TroubleDao {
    /**
     * 插入水质数据
     * @param trouble
     * @return
     */
    Integer addTroubleDao(Trouble trouble);
    /**
     * 修改数据
     * @param trouble
     * @return
     */
    Integer modifyTroubleDao(Trouble trouble);


}
