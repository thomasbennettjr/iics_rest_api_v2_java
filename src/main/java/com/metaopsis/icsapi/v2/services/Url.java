package com.metaopsis.icsapi.v2.services;

public enum Url {
        LOGIN_NA {
            public String toString() {
                return "https://dm-us.informaticacloud.com/ma/api/v2/user/login";
            }
        },
        LOGIN_EMEA {
            public String toString() {
                return "https://dm-eu.informaticacloud.com/ma/api/v2/user/login";
            }
        },
        LOGIN_APAC {
            public String toString() {
                return "https://dm-ap.informaticacloud.com/ma/api/v2/user/login";
            }
        },
        LOGOUT_NA {
            public String toString() {
                return "https://dm-us.informaticacloud.com/ma/api/v2/user/logoutall";
            }
        },
        LOGOUT_EMEA {
            public String toString() {
                return "https://dm-eu.informaticacloud.com/ma/api/v2/user/logoutall";
            }
        },
        LOGOUT_APAC {
            public String toString() {
                return "https://dm-ap.informaticacloud.com/ma/api/v2/user/logoutall";
            }
        },
        LOGIN_NA_SAML {
            public String toString() {
            return "https://dm-us.informaticacloud.com/ma/api/v2/user/loginSaml";
        }
        },
        LOGIN_EMEA_SAML {
            public String toString() {
            return "https://dm-eu.informaticacloud.com/ma/api/v2/user/loginSaml";
        }
        },
        LOGIN_APAC_SAML {
            public String toString() {
            return "https://dm-ap.informaticacloud.com/ma/api/v2/user/loginSaml";
        }
        }
}
