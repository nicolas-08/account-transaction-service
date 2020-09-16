package au.com.igreendata;

import au.com.igreendata.model.Transaction;
import au.com.igreendata.repository.TransactionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/rest/account-transaction/server")
public class TransactionResource {

	@Autowired
	private TransactionRepository transactionRepository;
	
	//@GetMapping("/account-transaction")
	@GetMapping
	public List<Transaction> getTransaction() {

		return transactionRepository.findAll();
	}

}
