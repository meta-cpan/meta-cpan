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
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DC/DCANTRELL/Test-Differences-0.68.tar.gz"

SRC_URI[md5sum] = "e1de5ef0f13fa4c815d8f2574820d661"
SRC_URI[sha256sum] = "e68547206cb099a2594165ca0adc99fc12adb97c7f02a1222f62961fd775e270"
RDEPENDS_${PN} += "capture-tiny-perl"
RDEPENDS_${PN} += "text-diff-perl"

S = "${WORKDIR}/Test-Differences-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
