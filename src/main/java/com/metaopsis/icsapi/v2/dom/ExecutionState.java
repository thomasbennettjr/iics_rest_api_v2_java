package com.metaopsis.icsapi.v2.dom;

public enum ExecutionState {
    INITIALIZED {
        public String toString() {
            return "INITIALIZED";
        }
    },
    RUNNING {
        public String toString() {
            return "RUNNING";
        }
    },
    STOPPING {
        public String toString() {
            return "STOPPING";
        }
    },
    COMPLETED {
        public String toString() {
            return "COMPLETED";
        }
    },
    FAILED {
        public String toString() {
            return "FAILED";
        }
    }
}
