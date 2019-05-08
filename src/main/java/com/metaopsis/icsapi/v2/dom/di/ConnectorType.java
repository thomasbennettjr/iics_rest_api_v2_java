package com.metaopsis.icsapi.v2.dom.di;

public enum ConnectorType {
    Salesforce {
        public String toString() {
            return "Salesforce";
        }
    },
    Oracle {
        public String toString() {
            return "Oracle";
        }
    },
    SqlServer {
        public String toString() {
            return "SqlServer";
        }
    },
    MySQL {
        public String toString() {
            return "MySQL";
        }
    },
    CSVFile {
        public String toString() {
            return "CSVFile";
        }
    },
    ODBC {
        public String toString() {
            return "ODBC";
        }
    },
    MS_ACCESS {
        public String toString() {
            return "MS_ACCESS";
        }
    },
    FTP {
        public String toString() {
            return "FTP";
        }
    },
    SAP {
        public String toString() {
            return "SAP";
        }
    },
    WebServicesConsumer {
        public String toString() {
            return "WebServicesConsumer";
        }
    },
    MSD {
        public String toString() {
            return "MSD";
        }
    }
}
