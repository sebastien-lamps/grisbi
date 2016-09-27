package fr.slamps.grisbi.core.service;

import fr.slamps.grisbi.core.domain.Account;
import fr.slamps.grisbi.core.domain.Record;

import java.util.List;

public interface AccountService {
	Account getAccount();

	List<Record> getRecords(Account account);
}
