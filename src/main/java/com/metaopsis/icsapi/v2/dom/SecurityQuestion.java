package com.metaopsis.icsapi.v2.dom;

public enum SecurityQuestion {
    SPOUSE_MEETING_CITY {
        public String toString() {
            return "SPOUSE_MEETING_CITY";
        }
    },
    FIRST_JOB_CITY {
        public String toString() {
            return "FIRST_JOB_CITY";
        }
    },
    CHILDHOOD_FRIEND {
        public String toString() {
            return "CHILDHOOD_FRIEND";
        }
    },
    MOTHER_MAIDEN_NAME {
        public String toString() {
            return "MOTHER_MAIDEN_NAME";
        }
    },
    PET_NAME {
        public String toString() {
            return "PET_NAME";
        }
    },
    CHILDHOOD_NICKNAME {
        public String toString() {
            return "CHILDHOOD_NICKNAME";
        }
    },
    CUSTOM_QUESTION {
        public String toString() {
            return "CUSTOM_QUESTION:";
        }
    }
}
