DESCRIPTION = "This module allows you to execute code when perl finished compiling the \
surrounding scope."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/B-Hooks-EndOfScope"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/B-Hooks-EndOfScope-0.25.tar.gz"

SRC_URI[md5sum] = "d753cef006468e71205d14a472c0011e"
SRC_URI[sha256sum] = "da1b6a9f7c7424776363182f9673e666b06136f13dc744241f7adce3d1ad0c1a"
RDEPENDS:${PN} += "module-implementation-perl"
RDEPENDS:${PN} += "sub-exporter-progressive-perl"

S = "${WORKDIR}/B-Hooks-EndOfScope-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
