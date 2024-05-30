package se.inyat.emailsenderservice.service;

import se.inyat.emailsenderservice.domain.dto.EmailDTO;

public interface EmailService {

    void sendEmail(EmailDTO dto);

}
