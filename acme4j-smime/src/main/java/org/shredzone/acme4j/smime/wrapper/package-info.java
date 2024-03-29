/*
 * acme4j - Java ACME client
 *
 * Copyright (C) 2023 Richard "Shred" Körber
 *   http://acme4j.shredzone.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */

/**
 * {@link org.shredzone.acme4j.smime.wrapper.Mail} is a wrapper interface which provides
 * access to all relevant headers of the validation email. Usually
 * {@link org.shredzone.acme4j.smime.wrapper.SignedMailBuilder} is used for parsing the
 * email and validating the signature.
 * {@link org.shredzone.acme4j.smime.wrapper.SimpleMail} is a simple implementation that
 * should only be used for testing purposes or after an external validation.
 */
@ReturnValuesAreNonnullByDefault
@DefaultAnnotationForParameters(NonNull.class)
@DefaultAnnotationForFields(NonNull.class)
package org.shredzone.acme4j.smime.wrapper;

import edu.umd.cs.findbugs.annotations.DefaultAnnotationForFields;
import edu.umd.cs.findbugs.annotations.DefaultAnnotationForParameters;
import edu.umd.cs.findbugs.annotations.NonNull;
import edu.umd.cs.findbugs.annotations.ReturnValuesAreNonnullByDefault;
