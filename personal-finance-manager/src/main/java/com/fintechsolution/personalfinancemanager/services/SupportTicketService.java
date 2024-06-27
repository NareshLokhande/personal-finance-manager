package com.fintechsolution.personalfinancemanager.services;

import com.fintechsolution.personalfinancemanager.models.SupportTicket;
import com.fintechsolution.personalfinancemanager.repository.SupportTicketRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupportTicketService {
    @Autowired
    private SupportTicketRepository supportTicketRepository;

    public List<SupportTicket> getAllSupportTickets() {
        return supportTicketRepository.findAll();
    }

    public SupportTicket getSupportTicketById(Long id) {
        return supportTicketRepository.findById(id).orElse(null);
    }

    public SupportTicket saveSupportTicket(SupportTicket supportTicket) {
        return supportTicketRepository.save(supportTicket);
    }

    public void deleteSupportTicket(Long id) {
        supportTicketRepository.deleteById(id);
    }
}
