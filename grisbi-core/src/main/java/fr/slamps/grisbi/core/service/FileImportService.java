package fr.slamps.grisbi.core.service;

import fr.slamps.grisbi.core.domain.Account;

import java.io.File;

/**
 * Created by slamps on 26/09/16.
 */
public interface FileImportService extends ImportService {
	void importFile(Account account, File file);
}
