package com.metaopsis.icsapi.v2.dom;

public enum ContextType {
    UI {
        public String toString() {
            return "UI";
        }
    },
    SCHEDULER {
        public String toString() {
            return "SCHEDULER";
        }
    },
    REST_API {
        public String toString() {
            return "REST-API";
        }
    },
    OUTBOUND_MESSAGE {
        public String toString() {
            return "OUTBOUND MESSAGE";
        }
    }
}
