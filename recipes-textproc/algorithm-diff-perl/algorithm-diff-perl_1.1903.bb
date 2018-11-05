DESCRIPTION = "Compute `intelligent' differences between two files / lists but use the old \
(<=0.59) interface."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Algorithm-Diff"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TY/TYEMQ/Algorithm-Diff-1.1903.tar.gz"

SRC_URI[md5sum] = "0e8add21a641b8d66436df0c2024bf3b"
SRC_URI[sha256sum] = "30e84ac4b31d40b66293f7b1221331c5a50561a39d580d85004d9c1fff991751"

S = "${WORKDIR}/Algorithm-Diff-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
