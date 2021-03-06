/*
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.cluster.datastore.messages;

import com.google.common.base.Preconditions;
import org.opendaylight.yangtools.yang.data.api.schema.tree.DataTreeModification;

/**
 * Message notifying the shard leader to apply modifications which have been
 * prepared locally against its DataTree. This message is not directly serializable,
 * simply because the leader and sender need to be on the same system.
 */
public final class ReadyLocalTransaction {
    private final DataTreeModification modification;
    private final String transactionID;
    private final boolean doCommitOnReady;

    public ReadyLocalTransaction(final String transactionID, DataTreeModification modification, boolean doCommitOnReady) {
        this.transactionID = Preconditions.checkNotNull(transactionID);
        this.modification = Preconditions.checkNotNull(modification);
        this.doCommitOnReady = doCommitOnReady;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public DataTreeModification getModification() {
        return modification;
    }

    public boolean isDoCommitOnReady() {
        return doCommitOnReady;
    }
}
