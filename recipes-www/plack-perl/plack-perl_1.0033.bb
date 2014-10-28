DESCRIPTION = "Plack is a set of tools for using the PSGI stack. It contains \
middleware components, a reference server and utilities for Web application \
frameworks. Plack is like Ruby's Rack or Python's Paste for WSGI."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Plack"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MI/MIYAGAWA/Plack-1.0033.tar.gz"

SRC_URI[md5sum] = "41292d3c33f637773369daeac86a48b8"
SRC_URI[sha256sum] = "bcd8784b8263bd6d68476e9d52e6f98819bd4f3331455cad12effed63a783220"
RDEPENDS_${PN} += "apache-logformat-compiler-perl"
RDEPENDS_${PN} += "devel-stacktrace-ashtml-perl"
RDEPENDS_${PN} += "devel-stacktrace-perl"
RDEPENDS_${PN} += "file-sharedir-perl"
RDEPENDS_${PN} += "filesys-notify-simple-perl"
RDEPENDS_${PN} += "hash-multivalue-perl"
RDEPENDS_${PN} += "http-body-perl"
RDEPENDS_${PN} += "http-message-perl"
RDEPENDS_${PN} += "stream-buffered-perl"
RDEPENDS_${PN} += "test-tcp-perl"
RDEPENDS_${PN} += "try-tiny-perl"
RDEPENDS_${PN} += "uri-perl"
DEPENDS += "extutils-makemaker-perl-native"
DEPENDS += "file-sharedir-install-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Plack-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
