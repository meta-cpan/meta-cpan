DESCRIPTION = "MIME types are used in many applications (for instance as part of e-mail \
and HTTP traffic) to indicate the type of content which is transmitted. or \
expected. See RFC2045 at https://www.ietf.org/rfc/rfc2045.txt"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MIME-Types"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MARKOV/MIME-Types-2.17.tar.gz"

SRC_URI[md5sum] = "6f1441addab947137bac92c379a47ba3"
SRC_URI[sha256sum] = "e04ed7d42f1ff3150a303805f2689c28f80b92c511784d4641cb7f040d3e8ff6"

S = "${WORKDIR}/MIME-Types-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
