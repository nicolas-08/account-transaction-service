package au.com.igreendata.repository;

import au.com.igreendata.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{
    @Query("select m from Transaction m where m.id= :id")
    List<Transaction> findByParms(@Param("id") String id);
}
