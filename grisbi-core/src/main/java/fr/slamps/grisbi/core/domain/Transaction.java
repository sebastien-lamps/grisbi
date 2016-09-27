package fr.slamps.grisbi.core.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

public abstract class Transaction implements Record {
	@Getter
	@Setter
	private LocalDateTime date;

	@Getter
	@Setter
	private Double amount;

	@Getter
	@Setter
	private TransactionOperation operation;
}
