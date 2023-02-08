DESCRIPTION = "The "Encode" module provides the interface between Perl strings and the \
rest of the system. Perl strings are sequences of *characters*."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Encode"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DANKOGAI/Encode-3.16.tar.gz"

SRC_URI[md5sum] = "113b5ffa2330c5f5848b64994f70781c"
SRC_URI[sha256sum] = "e5e91d98a97de70dccecc2a25d049a0b5f5f12228c618680020d73043355294c"

S = "${WORKDIR}/Encode-${PV}"

inherit cpan update-alternatives

ALTERNATIVE_PRIORITY = "90"

ALTERNATIVE:${PN} = "piconv enc2xs encguess"
ALTERNATIVE_LINK_NAME[piconv] = "${bindir}/piconv"
ALTERNATIVE_LINK_NAME[enc2xs] = "${bindir}/enc2xs"
ALTERNATIVE_LINK_NAME[encguess] = "${bindir}/encguess"

BBCLASSEXTEND = "native"
