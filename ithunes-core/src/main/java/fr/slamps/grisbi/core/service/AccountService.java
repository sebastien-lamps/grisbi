package fr.slamps.ithunes.core.service;

import fr.slamps.ithunes.core.domain.Account;
import fr.slamps.ithunes.core.domain.Record;

import java.util.List;

public interface AccountService {
	Account getAccount();

	List<Record> getRecords(Account account);
}
