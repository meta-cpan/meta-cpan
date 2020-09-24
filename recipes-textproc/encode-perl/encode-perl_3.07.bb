DESCRIPTION = "The "Encode" module provides the interface between Perl strings and the \
rest of the system. Perl strings are sequences of *characters*."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Encode"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DANKOGAI/Encode-3.07.tar.gz"

SRC_URI[md5sum] = "a63fa96cbe236b2f7bb5a5e9fd740837"
SRC_URI[sha256sum] = "34a4ec9b574b7a6c6132c4ab3ded490fd600bc7ce382124aeda58bb1e112910f"

S = "${WORKDIR}/Encode-${PV}"

inherit cpan update-alternatives

ALTERNATIVE_PRIORITY = "90"

ALTERNATIVE_${PN} = "piconv enc2xs encguess"
ALTERNATIVE_LINK_NAME[piconv] = "${bindir}/piconv"
ALTERNATIVE_LINK_NAME[enc2xs] = "${bindir}/enc2xs"
ALTERNATIVE_LINK_NAME[encguess] = "${bindir}/encguess"

BBCLASSEXTEND = "native"
