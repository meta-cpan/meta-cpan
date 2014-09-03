DESCRIPTION = "Plack::Test is a unified interface to test PSGI applications using \
HTTP::Request and HTTP::Response objects. It also allows you to run \
PSGI \
applications in various ways. The default backend is \
\"Plack::Test::MockHTTP\", but you may also use any Plack::Handler \
implementation to run live HTTP requests against a web server."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Plack"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MI/MIYAGAWA/Plack-1.0031.tar.gz"

SRC_URI[md5sum] = "1fec97d69a0b3684897a981847cc4d91"
SRC_URI[sha256sum] = "318caccfac13f265d098a34ec7493a557f7a867d41939edfa3491c3374bf776f"
RDEPENDS_${PN} += "apache-logformat-compiler-perl"
RDEPENDS_${PN} += "devel-stacktrace-ashtml-perl"
RDEPENDS_${PN} += "devel-stacktrace-perl"
RDEPENDS_${PN} += "file-sharedir-perl"
RDEPENDS_${PN} += "filesys-notify-simple-perl"
RDEPENDS_${PN} += "hash-multivalue-perl"
RDEPENDS_${PN} += "http-body-perl"
RDEPENDS_${PN} += "http-message-perl"
RDEPENDS_${PN} += "uri-perl"
RDEPENDS_${PN} += "perl"
RDEPENDS_${PN} += "stream-buffered-perl"
RDEPENDS_${PN} += "test-tcp-perl"
RDEPENDS_${PN} += "try-tiny-perl"
DEPENDS += "file-sharedir-install-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Plack-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
