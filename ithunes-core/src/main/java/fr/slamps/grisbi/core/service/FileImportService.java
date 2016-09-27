package fr.slamps.ithunes.core.service;

import fr.slamps.ithunes.core.domain.Account;

import java.io.File;

/**
 * Created by slamps on 26/09/16.
 */
public interface FileImportService extends ImportService {
	void importFile(Account account, File file);
}
