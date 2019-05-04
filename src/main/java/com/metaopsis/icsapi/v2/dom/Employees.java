package com.metaopsis.icsapi.v2.dom;

public enum Employees {
    To10 {
        public String toString() {
            return "0_10";
        }
    },
    To25 {
        public String toString() {
            return "11_25";
        }
    },
    To50 {
        public String toString() {
            return "26_50";
        }
    },
    To100 {
        public String toString() {
            return "51_100";
        }
    },
    To500 {
        public String toString() {
            return "101_500";
        }
    },
    To1000 {
        public String toString() {
            return "501_1000";
        }
    },
    To5000 {
        public String toString() {
            return "1001_5000";
        }
    },
    Gt5000 {
        public String toString() {
            return "5001_";
        }
    }
}
