DESCRIPTION = "The "Encode" module provides the interface between Perl strings and the \
rest of the system. Perl strings are sequences of *characters*."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Encode"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DANKOGAI/Encode-2.96.tar.gz"

SRC_URI[md5sum] = "1b2e915c40f9069325527b3e5514455f"
SRC_URI[sha256sum] = "5dcb19fa5e62c6ca9294f28e9f4676f36477b1025f7e0dca92479633334b3cb1"

S = "${WORKDIR}/Encode-${PV}"

inherit cpan

inherit update-alternatives

ALTERNATIVE_PRIORITY = "100"

ALTERNATIVE_${PN} = "piconv enc2xs"
ALTERNATIVE_LINK_NAME[piconv] = "${bindir}/piconv"
ALTERNATIVE_LINK_NAME[enc2xs] = "${bindir}/enc2xs"

BBCLASSEXTEND = "native"
