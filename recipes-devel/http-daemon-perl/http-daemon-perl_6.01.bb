DESCRIPTION = "Instances of the \"HTTP::Daemon\" class are HTTP/1.1 servers that \
listen on a socket for incoming requests. The \"HTTP::Daemon\" is a \
subclass of \
\"IO::Socket::INET\", so you can perform socket operations directly on \
it too."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Daemon"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/HTTP-Daemon-6.01.tar.gz"

SRC_URI[md5sum] = "ed0ae02d25d7f1e89456d4d69732adc2"
SRC_URI[sha256sum] = "43fd867742701a3f9fcc7bd59838ab72c6490c0ebaf66901068ec6997514adc2"
RDEPENDS_${PV} += "http-date-perl"
RDEPENDS_${PV} += "http-message-perl"
RDEPENDS_${PV} += "lwp-mediatypes-perl"

S = "${WORKDIR}/HTTP-Daemon-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
