DESCRIPTION = "    This module provides methods to use NTLM authentication.  It can be \
used as an authenticate method with the Mail::IMAPClient module to perform \
the challenge/response mechanism for NTLM connections or it can be used on \
its own for NTLM authentication with other protocols (eg. HTTP)."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/NTLM"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/N/NB/NBEBOUT/NTLM-1.09.tar.gz"

SRC_URI[md5sum] = "da314ee94b14af2a2f39b6f2c0046e73"
SRC_URI[sha256sum] = "c823e30cda76bc15636e584302c960e2b5eeef9517c2448f7454498893151f85"
RDEPENDS:${PN} += "digest-hmac-perl"

S = "${WORKDIR}/NTLM-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
