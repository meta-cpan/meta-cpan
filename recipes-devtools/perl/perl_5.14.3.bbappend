inherit update-alternatives

ALTERNATIVE_PRIORITY = "80"

ALTERNATIVE_${perl-misc} = "shasum"
ALTERNATIVE_LINK_NAME[shasum] = "${bindir}/shasum"
