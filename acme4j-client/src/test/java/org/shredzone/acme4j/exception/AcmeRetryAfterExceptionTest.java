/*
 * acme4j - Java ACME client
 *
 * Copyright (C) 2016 Richard "Shred" Körber
 *   http://acme4j.shredzone.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */
package org.shredzone.acme4j.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.Duration;
import java.time.Instant;

import org.junit.Test;

/**
 * Unit tests for {@link AcmeRetryAfterException}.
 */
public class AcmeRetryAfterExceptionTest {

    /**
     * Test that parameters are correctly returned.
     */
    @Test
    public void testAcmeRetryAfterException() {
        String detail = "Too early";
        Instant retryAfter = Instant.now().plus(Duration.ofMinutes(1));

        AcmeRetryAfterException ex = new AcmeRetryAfterException(detail, retryAfter);

        assertThat(ex.getMessage(), is(detail));
        assertThat(ex.getRetryAfter(), is(retryAfter));
    }

    /**
     * Test that date is required.
     */
    @Test(expected = NullPointerException.class)
    public void testRequiredAcmeRetryAfterException() throws AcmeException {
        throw new AcmeRetryAfterException("null-test", null);
    }

}
