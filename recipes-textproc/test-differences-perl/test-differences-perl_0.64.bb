DESCRIPTION = "When the code you're testing returns multiple lines, records or data \
structures and they're just plain wrong, an equivalent to the Unix "diff" \
utility may be just what's needed. Here's output from an example test \
script that checks two text documents and then two (trivial) data \
structures:"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Differences"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DC/DCANTRELL/Test-Differences-0.64.tar.gz"

SRC_URI[md5sum] = "ecfda620fe133e36a6e392d94ab8424d"
SRC_URI[sha256sum] = "9f459dd9c2302a0a73e2f5528a0ce7d09d6766f073187ae2c69e603adf2eb276"
RDEPENDS_${PN} += "capture-tiny-perl"
RDEPENDS_${PN} += "text-diff-perl"

S = "${WORKDIR}/Test-Differences-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
