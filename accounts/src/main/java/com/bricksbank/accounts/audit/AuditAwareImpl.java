package com.bricksbank.accounts.audit;

import org.jspecify.annotations.NullMarked;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {

    /**
     *Returns the current Application Auditor
     *
     * @return the current auditor
     */
    @NullMarked
    @Override
    public Optional<String> getCurrentAuditor() {
       return Optional.of("ACCOUNTS_MS");
    }
}
