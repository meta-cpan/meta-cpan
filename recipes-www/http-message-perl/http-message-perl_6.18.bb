DESCRIPTION = "An "HTTP::Message" object contains some headers and a content body. The \
following methods are available:"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Message"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OA/OALDERS/HTTP-Message-6.18.tar.gz"

SRC_URI[md5sum] = "9fd400da24e1784f85d32de1705fc795"
SRC_URI[sha256sum] = "d060d170d388b694c58c14f4d13ed908a2807f0e581146cef45726641d809112"
RDEPENDS_${PN} += "encode-locale-perl"
RDEPENDS_${PN} += "http-date-perl"
RDEPENDS_${PN} += "io-html-perl"
RDEPENDS_${PN} += "lwp-mediatypes-perl"
RDEPENDS_${PN} += "uri-perl"
DEPENDS += "try-tiny-perl-native"

S = "${WORKDIR}/HTTP-Message-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
