package model;
import java.util.Arrays;

import java.util.List;
import services.AccountRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

@EnableMongoRepositories(basePackageClasses = AccountRepository.class)
@Configuration
public class DBinti implements CommandLineRunner{
    private AccountRepository accountRepo ;
    
	public DBinti(AccountRepository accountRepo) {
		super();
		this.accountRepo = accountRepo;
	}

	public DBinti() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(String... args) throws Exception {
		try{
		Account account = new Account(
				"Aya",
				"123456",
				"Aya@yahoo.com",
				"female",
				"056_example.jpg",
				Arrays.asList(
						new Child ("1","Malek","29/7/2016","male","056_example.jpg") ),
				Arrays.asList(
						new Problem ("1","problem1","problem gamda gadan"," ",false) ),
				Arrays.asList(
						new Memory("1","memory1" ,"12/12/2012","memory memory") )
				);
		
		
		accountRepo.save(account);
		}
		catch(Exception e){
			System.out.println("Exeption "+e);
		}
	}

}
