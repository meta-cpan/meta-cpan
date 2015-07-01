inherit update-alternatives

ALTERNATIVE_PRIORITY = "80"

ALTERNATIVE_${perl-misc} = "shasum piconv enc2xs"
ALTERNATIVE_LINK_NAME[shasum] = "${bindir}/shasum"
ALTERNATIVE_LINK_NAME[piconv] = "${bindir}/piconv"
ALTERNATIVE_LINK_NAME[enc2xs] = "${bindir}/enc2xs"
