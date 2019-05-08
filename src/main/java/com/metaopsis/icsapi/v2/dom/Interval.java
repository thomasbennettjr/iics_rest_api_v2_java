package com.metaopsis.icsapi.v2.dom;

public enum Interval {
    None {
        public String toString() {
            return "None";
        }
    },
    Minutely {
        public String toString() {
            return "Minutely";
        }
    },
    Hourly {
        public String toString() {
            return "Hourly";
        }
    },
    Daily {
        public String toString() {
            return "Daily";
        }
    },
    Weekly {
        public String toString() {
            return "Weekly";
        }
    },
    Monthly {
        public String toString() {
            return "Monthly";
        }
    }
}
