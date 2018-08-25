package controller;
import services.AccountRepository;
import model.Account;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Accounts")
public class AccountController {
	
	private AccountRepository accountRepo;

	public AccountController(AccountRepository accountRepo) {
		super();
		this.accountRepo = accountRepo;
	}
	@GetMapping("/all")
	public List<Account> getAll(){
		List<Account> AllAccounts = accountRepo.findAll();
		return AllAccounts;
	}

}
