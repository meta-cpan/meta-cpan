DESCRIPTION = "Plack::Test is a unified interface to test PSGI applications using \
HTTP::Request and HTTP::Response objects. It also allows you to run \
PSGI \
applications in various ways. The default backend is \
"Plack::Test::MockHTTP", but you may also use any Plack::Handler \
implementation to run live HTTP requests against a web server."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Plack"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS += "apache-logformat-compiler-perl"
DEPENDS += "devel-stacktrace-ashtml-perl"
DEPENDS += "devel-stacktrace-perl"
DEPENDS += "file-sharedir-perl"
DEPENDS += "filesys-notify-simple-perl"
DEPENDS += "hash-multivalue-perl"
DEPENDS += "http-body-perl"
DEPENDS += "http-message-perl"
DEPENDS += "liburi-perl"
DEPENDS += "perl"
DEPENDS += "stream-buffered-perl"
DEPENDS += "test-tcp-perl"
DEPENDS += "try-tiny-perl"

DEPENDS += "file-sharedir-install-perl-native"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MI/MIYAGAWA/Plack-1.0031.tar.gz"

SRC_URI[md5sum] = "1fec97d69a0b3684897a981847cc4d91"
SRC_URI[sha256sum] = "318caccfac13f265d098a34ec7493a557f7a867d41939edfa3491c3374bf776f"

S = "${WORKDIR}/Plack-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
