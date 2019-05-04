package com.metaopsis.icsapi.v2.dom;

public enum TaskType {
    DMASK {
        public String toString() {
            return "DMASK";
        }
    },
    DRS {
        public String toString() {
            return "DRS";
        }
    },
    DSS {
        public String toString() {
            return "DSS";
        }
    },
    MTT {
        public String toString() {
            return "MTT";
        }
    },
    PCS {
        public String toString() {
            return "PCS";
        }
    }
}
