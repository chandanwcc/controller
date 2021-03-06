/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.netconf.cli.reader;

import java.util.List;
import org.opendaylight.yangtools.yang.data.api.schema.NormalizedNode;
import org.opendaylight.yangtools.yang.model.api.DataSchemaNode;

/**
 * Generic provider(reader) of input arguments for commands
 */
public interface Reader<T extends DataSchemaNode> {

    List<NormalizedNode<?, ?>> read(T schemaNode) throws ReadingException;

}
