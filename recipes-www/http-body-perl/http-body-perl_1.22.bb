DESCRIPTION = "HTTP::Body parses chunks of HTTP POST data and supports \
application/octet-stream, application/json, \
application/x-www-form-urlencoded, and multipart/form-data."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Body"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/G/GE/GETTY/HTTP-Body-1.22.tar.gz"

SRC_URI[md5sum] = "81a38eab683d8750b78ad0d4845ef0d5"
SRC_URI[sha256sum] = "fc0d2c585b3bd1532d92609965d589e0c87cd380e7cca42fb9ad0a1311227297"
RDEPENDS_${PN} += "http-message-perl"
DEPENDS += "test-deep-perl-native"

S = "${WORKDIR}/HTTP-Body-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
