DESCRIPTION = "Compute `intelligent' differences between two files / lists"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Algorithm-Diff"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Algorithm-Diff-1.201.tar.gz"

SRC_URI[md5sum] = "2eaae910f5220261ee2bbdfc4a8df2c2"
SRC_URI[sha256sum] = "0022da5982645d9ef0207f3eb9ef63e70e9713ed2340ed7b3850779b0d842a7d"

S = "${WORKDIR}/Algorithm-Diff-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
