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
RDEPENDS_${PV} += "apache-logformat-compiler-perl"
RDEPENDS_${PV} += "devel-stacktrace-ashtml-perl"
RDEPENDS_${PV} += "devel-stacktrace-perl"
RDEPENDS_${PV} += "file-sharedir-perl"
RDEPENDS_${PV} += "filesys-notify-simple-perl"
RDEPENDS_${PV} += "hash-multivalue-perl"
RDEPENDS_${PV} += "http-body-perl"
RDEPENDS_${PV} += "http-message-perl"
RDEPENDS_${PV} += "liburi-perl"
RDEPENDS_${PV} += "perl"
RDEPENDS_${PV} += "stream-buffered-perl"
RDEPENDS_${PV} += "test-tcp-perl"
RDEPENDS_${PV} += "try-tiny-perl"
DEPENDS += "file-sharedir-install-perl"
DEPENDS += "test-requires-perl"

S = "${WORKDIR}/Plack-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
