DESCRIPTION = "Cookie::Baker provides simple cookie string generator and parser."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Cookie-Baker"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZEBURO/Cookie-Baker-0.11.tar.gz"

SRC_URI[md5sum] = "bc8f95893d6ec3093a62d1957e1908f2"
SRC_URI[sha256sum] = "59275f474e07c0aa3611e3e684b894e7db913333d8214420be63f12ec18cd7ab"
RDEPENDS:${PN} += "uri-perl"
DEPENDS += "module-build-tiny-perl-native"
DEPENDS += "test-time-perl-native"

S = "${WORKDIR}/Cookie-Baker-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
