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

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DC/DCANTRELL/Test-Differences-0.67.tar.gz"

SRC_URI[md5sum] = "4a18533f77d43d9feaa1b6ab3dc72735"
SRC_URI[sha256sum] = "c88dbbb48b934b069284874f33abbaaa438aa31204aa3fa73bfc2f4aeac878da"
RDEPENDS_${PN} += "capture-tiny-perl"
RDEPENDS_${PN} += "text-diff-perl"

S = "${WORKDIR}/Test-Differences-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
