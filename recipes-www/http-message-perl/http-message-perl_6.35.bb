DESCRIPTION = "An "HTTP::Message" object contains some headers and a content body. The \
following methods are available:"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Message"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OA/OALDERS/HTTP-Message-6.35.tar.gz"

SRC_URI[md5sum] = "33110b9295a2e9daae675b4f7d22c08f"
SRC_URI[sha256sum] = "d77c3a64c2991c58e0694564fea7ed3610ae1790fa9eb32b51972b0a62bc6619"
RDEPENDS:${PN} += "encode-locale-perl"
RDEPENDS:${PN} += "http-date-perl"
RDEPENDS:${PN} += "io-html-perl"
RDEPENDS:${PN} += "lwp-mediatypes-perl"
RDEPENDS:${PN} += "uri-perl"
DEPENDS += "try-tiny-perl-native"

S = "${WORKDIR}/HTTP-Message-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"