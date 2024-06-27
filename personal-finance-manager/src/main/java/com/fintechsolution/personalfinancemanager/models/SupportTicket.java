package com.fintechsolution.personalfinancemanager.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class SupportTicket{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String issue;
    private String status;
    private Date createdDate;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

	public SupportTicket() {
		super();
	}

	public SupportTicket(Long id, String issue, String status, Date createdDate, Account account) {
		super();
		this.id = id;
		this.issue = issue;
		this.status = status;
		this.createdDate = createdDate;
		this.account = account;
	}

    // Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "SupportTicket [id=" + id + ", issue=" + issue + ", status=" + status + ", createdDate=" + createdDate
				+ ", account=" + account + "]";
	}

    
}
