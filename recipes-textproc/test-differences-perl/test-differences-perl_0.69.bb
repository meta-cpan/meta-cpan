DESCRIPTION = "When the code you're testing returns multiple lines, records or data \
structures and they're just plain wrong, an equivalent to the Unix "diff" \
utility may be just what's needed. Here's output from an example test \
script that checks two text documents and then two (trivial) data \
structures:"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-only"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Differences"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-only;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DC/DCANTRELL/Test-Differences-0.69.tar.gz"

SRC_URI[md5sum] = "53aa66b927e7ffe612118bec05f8343d"
SRC_URI[sha256sum] = "18f644fdd4a1fef93ef3f7f67df8e95b593d811899f34bcbbaba4d717222f58f"
RDEPENDS:${PN} += "capture-tiny-perl"
RDEPENDS:${PN} += "text-diff-perl"

S = "${WORKDIR}/Test-Differences-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
