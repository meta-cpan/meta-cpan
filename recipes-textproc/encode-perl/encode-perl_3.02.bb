DESCRIPTION = "The "Encode" module provides the interface between Perl strings and the \
rest of the system. Perl strings are sequences of *characters*."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Encode"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DANKOGAI/Encode-3.02.tar.gz"

SRC_URI[md5sum] = "4eb07ba6db02d5b982316e1dd05f68bd"
SRC_URI[sha256sum] = "5865be4951870f62f43722818d076d7724306c75c8f268346b282351cbc820a8"

S = "${WORKDIR}/Encode-${PV}"

inherit cpan update-alternatives

ALTERNATIVE_PRIORITY = "90"

ALTERNATIVE_${PN} = "piconv enc2xs encguess"
ALTERNATIVE_LINK_NAME[piconv] = "${bindir}/piconv"
ALTERNATIVE_LINK_NAME[enc2xs] = "${bindir}/enc2xs"
ALTERNATIVE_LINK_NAME[encguess] = "${bindir}/encguess"

BBCLASSEXTEND = "native"
